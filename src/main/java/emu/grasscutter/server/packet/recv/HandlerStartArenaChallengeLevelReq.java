
package emu.grasscutter.server.packet.recv;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.server.game.GameSession;

@Opcodes(value = PacketOpcodes.newOpcodes.StartArenaChallengeLevelReq, type = 1)
public class HandlerStartArenaChallengeLevelReq extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.grasscutter.net.newproto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq req) {
            super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.StartArenaChallengeLevelReq, 2));

            var q = emu.grasscutter.net.oldproto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.newBuilder();
            try{
                String json = JsonFormat.printer().print(req);
                JsonFormat.parser().ignoringUnknownFields().merge(json, q);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }

            this.setData(q.build());
        }
    }
    @Override
    public BasePacket Packet(byte[] payload) throws Exception {
        return new Packet(new byte[0], emu.grasscutter.net.newproto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.grasscutter.net.newproto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq req = emu.grasscutter.net.newproto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.parseFrom(payload);
        // Auto template
        session.send(new Packet(header, req));
    }

}
