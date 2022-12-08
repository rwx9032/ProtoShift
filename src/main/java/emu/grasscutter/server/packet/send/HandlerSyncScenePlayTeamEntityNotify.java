
package emu.grasscutter.server.packet.send;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.server.game.GameSession;

@Opcodes(value = PacketOpcodes.oldOpcodes.SyncScenePlayTeamEntityNotify,type = 2)
public class HandlerSyncScenePlayTeamEntityNotify extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.grasscutter.net.oldproto.SyncScenePlayTeamEntityNotifyOuterClass.SyncScenePlayTeamEntityNotify rsp) {
            super(header, new PacketOpcodes(PacketOpcodes.newOpcodes.SyncScenePlayTeamEntityNotify, 1));

            var p = emu.grasscutter.net.newproto.SyncScenePlayTeamEntityNotifyOuterClass.SyncScenePlayTeamEntityNotify.newBuilder();;
            try{
                String json = JsonFormat.printer().print(rsp);
                JsonFormat.parser().ignoringUnknownFields().merge(json, p);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }

            this.setData(p.build());
        }
    }
    @Override
    public BasePacket Packet(byte[] payload) throws Exception {
        return new Packet(new byte[0], emu.grasscutter.net.oldproto.SyncScenePlayTeamEntityNotifyOuterClass.SyncScenePlayTeamEntityNotify.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.grasscutter.net.oldproto.SyncScenePlayTeamEntityNotifyOuterClass.SyncScenePlayTeamEntityNotify rsp = emu.grasscutter.net.oldproto.SyncScenePlayTeamEntityNotifyOuterClass.SyncScenePlayTeamEntityNotify.parseFrom(payload);
        // Auto template
        session.send(new Packet(header, rsp));
    }

}
