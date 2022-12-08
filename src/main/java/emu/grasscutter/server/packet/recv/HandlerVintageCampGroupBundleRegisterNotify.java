
package emu.grasscutter.server.packet.recv;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.server.game.GameSession;

@Opcodes(value = PacketOpcodes.newOpcodes.VintageCampGroupBundleRegisterNotify, type = 1)
public class HandlerVintageCampGroupBundleRegisterNotify extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.grasscutter.net.newproto.VintageCampGroupBundleRegisterNotifyOuterClass.VintageCampGroupBundleRegisterNotify req) {
            super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.VintageCampGroupBundleRegisterNotify, 2));

            var q = emu.grasscutter.net.oldproto.VintageCampGroupBundleRegisterNotifyOuterClass.VintageCampGroupBundleRegisterNotify.newBuilder();
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
        return new Packet(new byte[0], emu.grasscutter.net.newproto.VintageCampGroupBundleRegisterNotifyOuterClass.VintageCampGroupBundleRegisterNotify.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.grasscutter.net.newproto.VintageCampGroupBundleRegisterNotifyOuterClass.VintageCampGroupBundleRegisterNotify req = emu.grasscutter.net.newproto.VintageCampGroupBundleRegisterNotifyOuterClass.VintageCampGroupBundleRegisterNotify.parseFrom(payload);
        // Auto template
        session.send(new Packet(header, req));
    }

}
