
package emu.grasscutter.server.packet.recv;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.server.game.GameSession;

@Opcodes(value = PacketOpcodes.newOpcodes.PlayerRandomCookReq, type = 1)
public class HandlerPlayerRandomCookReq extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.grasscutter.net.newproto.PlayerRandomCookReqOuterClass.PlayerRandomCookReq req) {
            super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.PlayerRandomCookReq, 2));

            var q = emu.grasscutter.net.oldproto.PlayerRandomCookReqOuterClass.PlayerRandomCookReq.newBuilder();
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
        return new Packet(new byte[0], emu.grasscutter.net.newproto.PlayerRandomCookReqOuterClass.PlayerRandomCookReq.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.grasscutter.net.newproto.PlayerRandomCookReqOuterClass.PlayerRandomCookReq req = emu.grasscutter.net.newproto.PlayerRandomCookReqOuterClass.PlayerRandomCookReq.parseFrom(payload);
        // Auto template
        session.send(new Packet(header, req));
    }

}
