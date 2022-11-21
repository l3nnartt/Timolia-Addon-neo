package com.github.l3nnartt.timolia.core;

import com.github.l3nnartt.timolia.core.packet.EnemyPacket;
import com.github.l3nnartt.timolia.core.packet.MapPacket;
import com.github.l3nnartt.timolia.core.packet.MatchPacket;
import com.github.l3nnartt.timolia.core.packet.StreakPacket;
import net.labymod.serverapi.protocol.packet.protocol.AddonProtocol;

public class TimoliaProtocol extends AddonProtocol {

  public TimoliaProtocol() {
    super("timolia");

    this.registerPacket(0, new StreakPacket());
    this.registerPacket(1, new MatchPacket());
    this.registerPacket(2, new EnemyPacket());
    this.registerPacket(3, new MapPacket());
  }
}