package com.github.l3nnartt.timolia.core.translator;

import com.github.l3nnartt.timolia.core.TimoliaAddon;
import com.github.l3nnartt.timolia.core.packet.KitPacket;
import com.google.gson.JsonElement;
import net.labymod.serverapi.protocol.packet.Packet;
import net.labymod.serverapi.protocol.packet.protocol.neo.translation.AbstractLabyMod3PayloadTranslationListener;

public class KitPayloadTranslator extends AbstractLabyMod3PayloadTranslationListener {

  public KitPayloadTranslator() {
    super("Timolia:1vs1:Kit");
  }

  @Override
  public byte[] translateIncomingPayload(JsonElement messageContent) {
    String kit = messageContent.getAsJsonObject().get("kit").getAsString();
    return this.writePacketBinary(new KitPacket(kit));
  }

  @Override
  public <T extends Packet> byte[] translateOutgoingPayload(T packet) {
    return new byte[0];
  }
}