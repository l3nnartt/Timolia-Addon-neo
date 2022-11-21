package com.github.l3nnartt.timolia.core.handler;

import com.github.l3nnartt.timolia.core.packet.MapPacket;
import net.labymod.serverapi.protocol.packet.PacketHandler;

public class MapPacketHandler implements PacketHandler<MapPacket> {

  @Override
  public void handle(MapPacket packet) {
    packet.getClass();
  }
}
