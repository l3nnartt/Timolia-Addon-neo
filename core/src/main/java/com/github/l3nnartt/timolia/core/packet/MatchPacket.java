package com.github.l3nnartt.timolia.core.packet;

import net.labymod.serverapi.protocol.packet.Packet;

public class MatchPacket implements Packet {

  private final String map;
  private final String kit;
  private final String enemy;

  public MatchPacket(String map, String kit, String enemy) {
    this.map = map;
    this.kit = kit;
    this.enemy = enemy;
  }

  public String getMap() {
    return map;
  }

  public String getKit() {
    return kit;
  }

  public String getEnemy() {
    return enemy;
  }

}
