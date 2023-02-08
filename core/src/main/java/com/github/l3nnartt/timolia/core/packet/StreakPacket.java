package com.github.l3nnartt.timolia.core.packet;

import net.labymod.serverapi.protocol.packet.Packet;

public class StreakPacket implements Packet {

  private final String streak;

  public StreakPacket(String streak) {
    this.streak = streak;
  }

  public String getStreak() {
    return streak;
  }

}
