package com.github.l3nnartt.timolia.core.handler;

import com.github.l3nnartt.timolia.core.hud.KitTextHudWidget;
import com.github.l3nnartt.timolia.core.packet.KitPacket;
import net.labymod.serverapi.protocol.packet.PacketHandler;

public class KitPacketHandler implements PacketHandler<KitPacket> {

  @Override
  public void handle(KitPacket packet) {
    KitTextHudWidget.getInstance().setKitLine(packet.getKit());
  }
}