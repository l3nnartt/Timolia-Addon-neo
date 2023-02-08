package com.github.l3nnartt.timolia.core.packet;

import net.labymod.serverapi.protocol.packet.Packet;

public class MapPacket implements Packet {

  private final String map;

  public MapPacket(String map) {
    this.map = map;
  }

  public String getMap() {
    return map;
  }

}
