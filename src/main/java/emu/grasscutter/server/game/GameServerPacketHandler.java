package emu.grasscutter.server.game;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.packet.PacketOpcodesUtil;
import emu.grasscutter.server.game.GameSession.SessionState;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static emu.grasscutter.utils.Utils.bytesToHex;


public class GameServerPacketHandler {
    private final Map<Integer, PacketHandler> newHandlers = new HashMap<>();
    private final Map<Integer, PacketHandler> oldHandlers = new HashMap<>();

    public GameServerPacketHandler() {
        this.registerHandlers();
    }

    public void registerPacketHandler(Class<? extends PacketHandler> handlerClass) {
        try {
            Opcodes opcode = handlerClass.getAnnotation(Opcodes.class);

            if (opcode == null || opcode.disabled() || opcode.value() <= 0) {
                return;
            }

            PacketHandler packetHandler = handlerClass.getDeclaredConstructor().newInstance();

            if (opcode.type() == 1) {
                this.newHandlers.put(opcode.value(), packetHandler);
            } else {
                this.oldHandlers.put(opcode.value(), packetHandler);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void registerHandlers() {
        Reflections reflections = new Reflections("emu.grasscutter.server.packet");
        Set<Class<? extends PacketHandler>> handlerClasses = reflections.getSubTypesOf(PacketHandler.class);

        for (var obj : handlerClasses) {
            this.registerPacketHandler(obj);
        }

        // Debug
        Grasscutter.getLogger().info("Registered newHandlers " + this.newHandlers.size() + " " + PacketHandler.class.getSimpleName() + "s");
        Grasscutter.getLogger().info("Registered oldHandlers " + this.oldHandlers.size() + " " + PacketHandler.class.getSimpleName() + "s");
    }

    public PacketHandler getHandler(PacketOpcodes opcode) {
        return opcode.type == 1 ? this.newHandlers.get(opcode.value) : this.oldHandlers.get(opcode.value);
    }

    public void handle(GameSession session, PacketOpcodes opcode, byte[] header, byte[] payload, HandlerManager handlers) {
        PacketHandler handler = (opcode.type == 1 ? this.newHandlers.get(opcode.value) : this.oldHandlers.get(opcode.value));

        Grasscutter.getLogger().info("Recv packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode) + "\n"
                + bytesToHex(payload));


        if (opcode.value == PacketOpcodes.NONE) return;

        if (handler != null) {
            try {
                // Make sure session is ready for packets
                SessionState state = session.getState();

                if ((opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.PingReq) || (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.PingRsp)) {
                    // Always continue if packet is ping request
                } else if (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.GetPlayerTokenReq) {
                    if (state != SessionState.WAITING_FOR_TOKEN) return;
                } else if (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.GetPlayerTokenRsp) {
                    if (state != SessionState.WAITING_FOR_TOKEN) return;
                    // Set session state
                    session.setUseSecretKey(true);
                    session.setState(GameSession.SessionState.ACTIVE);
                } else {
                    if (state != SessionState.ACTIVE) return;
                }

                long time = System.currentTimeMillis();

                if (handlers == null
                        || (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.GetPlayerTokenReq)
                        || (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.GetPlayerTokenRsp)
                        || (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.SetPlayerBornDataReq)
                        || (opcode.type == 2 && opcode.value == PacketOpcodes.oldOpcodes.SetPlayerBornDataRsp)
                        || (opcode.type == 1 && opcode.value == PacketOpcodes.newOpcodes.PlayerLoginReq)
                        || (opcode.type == 2 && opcode.value == PacketOpcodes.newOpcodes.PlayerLoginRsp)) {
                    handler.handle(session, header, payload);
                } else {
                    if (handlers.getSession() == session) {
                        handlers.getHandler().add(new Handler(session, opcode, header, payload, time));
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return; // Packet successfully handled
        }

        Grasscutter.getLogger().

                info("Unhandled packet (" + opcode.value + ", " + opcode.type + "): " + PacketOpcodesUtil.getOpcodeName(opcode));

    }


    public void handle(GameSession session, PacketOpcodes opcode, byte[] header, byte[] payload) {
        this.handle(session, opcode, header, payload, null);
    }
}
