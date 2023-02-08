package com.github.l3nnartt.timolia.core.packet;

import net.labymod.serverapi.protocol.packet.Packet;

public class EnemyPacket implements Packet {

  private final String enemy;

  public EnemyPacket(String enemy) {
    this.enemy = enemy;
  }

  public String getEnemy() {
    return enemy;
  }

}
