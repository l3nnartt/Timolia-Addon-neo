package com.github.l3nnartt.timolia.core.handler;

import com.github.l3nnartt.timolia.core.packet.EnemyPacket;
import net.labymod.serverapi.protocol.packet.PacketHandler;

public class EnemyPacketHandler implements PacketHandler<EnemyPacket> {

  @Override
  public void handle(EnemyPacket packet) {
    packet.getClass();
  }
}
