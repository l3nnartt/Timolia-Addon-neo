package com.github.l3nnartt.timolia.core.translator;

import com.github.l3nnartt.timolia.core.packet.StreakPacket;
import com.google.gson.JsonElement;
import net.labymod.serverapi.protocol.packet.Packet;
import net.labymod.serverapi.protocol.packet.protocol.neo.translation.AbstractLabyMod3PayloadTranslationListener;

public class StreakPayloadTranslator extends AbstractLabyMod3PayloadTranslationListener {

  public StreakPayloadTranslator() {
    super("Timolia:1vs1:Streak");
  }

  @Override
  public byte[] translateIncomingPayload(JsonElement messageContent) {
    String streak = messageContent.getAsJsonObject().get("streak").getAsString();
    return this.writePacketBinary(new StreakPacket(streak));
  }

  @Override
  public <T extends Packet> byte[] translateOutgoingPayload(T packet) {
    return new byte[0];
  }
}
