package com.github.l3nnartt.timolia.core.handler;

import com.github.l3nnartt.timolia.core.packet.MatchPacket;
import net.labymod.serverapi.protocol.packet.PacketHandler;

public class MatchPacketHandler implements PacketHandler<MatchPacket> {

  @Override
  public void handle(MatchPacket packet) {
    packet.getClass();
  }
}
