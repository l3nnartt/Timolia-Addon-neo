package com.github.l3nnartt.timolia.core.packet;

import com.google.gson.JsonElement;
import net.labymod.serverapi.protocol.packet.Packet;

public class KitPacket implements Packet {

  JsonElement messageContent;
  String kit;

  public KitPacket(JsonElement messageContent) {
    this.messageContent = messageContent;
  }

  public void setKit(String kit) {
    this.kit = kit;
  }

  public String getKit() {
    return kit;
  }

  public JsonElement getMessageContent() {
    return messageContent;
  }

  public void setMessageContent(JsonElement messageContent) {
    this.messageContent = messageContent;
  }
}