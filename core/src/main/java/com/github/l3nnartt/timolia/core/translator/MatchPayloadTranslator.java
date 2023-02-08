package com.github.l3nnartt.timolia.core.translator;

import com.github.l3nnartt.timolia.core.packet.MatchPacket;
import com.google.gson.JsonElement;
import net.labymod.serverapi.protocol.packet.Packet;
import net.labymod.serverapi.protocol.packet.protocol.neo.translation.AbstractLabyMod3PayloadTranslationListener;

public class MatchPayloadTranslator extends AbstractLabyMod3PayloadTranslationListener {

  public MatchPayloadTranslator() {
    super("Timolia:1vs1:Match");
  }

  @Override
  public byte[] translateIncomingPayload(JsonElement messageContent) {
    String kit = messageContent.getAsJsonObject().get("kit").getAsString();
    String map = messageContent.getAsJsonObject().get("map").getAsString();
    String enemy = messageContent.getAsJsonObject().get("enemy").getAsString();
    return this.writePacketBinary(new MatchPacket(map, kit,enemy));
  }

  @Override
  public <T extends Packet> byte[] translateOutgoingPayload(T packet) {
    return new byte[0];
  }
}
