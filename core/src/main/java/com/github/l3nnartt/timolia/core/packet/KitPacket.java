package com.github.l3nnartt.timolia.core.packet;

import net.labymod.serverapi.protocol.packet.Packet;

public class KitPacket implements Packet {

  private final String kit;

  public KitPacket(String kit) {
    this.kit = kit;
  }

  public String getKit() {
    return kit;
  }
}