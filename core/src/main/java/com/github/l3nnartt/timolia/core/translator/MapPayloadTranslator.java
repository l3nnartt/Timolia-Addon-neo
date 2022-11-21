package com.github.l3nnartt.timolia.core.translator;

import com.github.l3nnartt.timolia.core.packet.MapPacket;
import com.google.gson.JsonElement;
import net.labymod.serverapi.protocol.packet.Packet;
import net.labymod.serverapi.protocol.packet.protocol.neo.translation.AbstractLabyMod3PayloadTranslationListener;

public class MapPayloadTranslator extends AbstractLabyMod3PayloadTranslationListener {

  public MapPayloadTranslator() {
    super("Timolia:1vs1:Map");
  }

  @Override
  public byte[] translateIncomingPayload(JsonElement messageContent) {
    return this.writePacketBinary(new MapPacket());
  }

  @Override
  public <T extends Packet> byte[] translateOutgoingPayload(T packet) {
    return new byte[0];
  }
}
