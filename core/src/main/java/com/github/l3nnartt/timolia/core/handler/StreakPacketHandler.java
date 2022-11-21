package com.github.l3nnartt.timolia.core.handler;

import com.github.l3nnartt.timolia.core.packet.StreakPacket;
import net.labymod.serverapi.protocol.packet.PacketHandler;

public class StreakPacketHandler implements PacketHandler<StreakPacket> {

  @Override
  public void handle(StreakPacket packet) {
    packet.getClass();
  }
}
