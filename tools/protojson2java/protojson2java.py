from cmdIdList import oldcmdList, newcmdList

from os import listdir
from os.path import  splitext

PROTOJSON_NEW_DIR = '..\\proto2json\\output\\new\\'
PROTOJSON_OLD_DIR = '..\\proto2json\\output\\old\\'
OUTPUT_RECV_DIR = '..\\..\\src\\main\\java\\emu\\grasscutter\\server\\packet\\recv\\'
OUTPUT_SEND_DIR = '..\\..\\src\\main\\java\\emu\\grasscutter\\server\\packet\\send\\'

oldjson_list = []
newjson_list = []


for i in listdir(PROTOJSON_NEW_DIR):
    newjson_list.append(splitext(i)[0])

for i in listdir(PROTOJSON_OLD_DIR):
    oldjson_list.append(splitext(i)[0])

for i in oldcmdList:
    if i in newcmdList:
        if i not in newjson_list or i not in oldjson_list:
            continue

        with open(OUTPUT_RECV_DIR+'Handler'+i+'.java', 'w', encoding='utf-8') as file:
            file.write(
                '''
package emu.grasscutter.server.packet.recv;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.server.game.GameSession;

@Opcodes(value = PacketOpcodes.newOpcodes.'''+i+''', type = 1)
public class Handler'''+i+''' extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.grasscutter.net.newproto.'''+i+'''OuterClass.'''+i+''' req) {
            super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.'''+i+''', 2));

            var q = emu.grasscutter.net.oldproto.'''+i+'''OuterClass.'''+i+'''.newBuilder();
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
        return new Packet(new byte[0], emu.grasscutter.net.newproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.grasscutter.net.newproto.'''+i+'''OuterClass.'''+i+''' req = emu.grasscutter.net.newproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload);
        // Auto template
        session.send(new Packet(header, req));
    }

}
'''
            )
        with open(OUTPUT_SEND_DIR+'Handler'+i+'.java', 'w', encoding='utf-8') as file:
            file.write(
                '''
package emu.grasscutter.server.packet.send;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;

import emu.grasscutter.server.game.GameSession;

@Opcodes(value = PacketOpcodes.oldOpcodes.'''+i+''',type = 2)
public class Handler'''+i+''' extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.grasscutter.net.oldproto.'''+i+'''OuterClass.'''+i+''' rsp) {
            super(header, new PacketOpcodes(PacketOpcodes.newOpcodes.'''+i+''', 1));

            var p = emu.grasscutter.net.newproto.'''+i+'''OuterClass.'''+i+'''.newBuilder();;
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
        return new Packet(new byte[0], emu.grasscutter.net.oldproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.grasscutter.net.oldproto.'''+i+'''OuterClass.'''+i+''' rsp = emu.grasscutter.net.oldproto.'''+i+'''OuterClass.'''+i+'''.parseFrom(payload);
        // Auto template
        session.send(new Packet(header, rsp));
    }

}
'''
            )
