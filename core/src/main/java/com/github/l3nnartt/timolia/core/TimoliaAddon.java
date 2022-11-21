package com.github.l3nnartt.timolia.core;

import com.github.l3nnartt.timolia.core.handler.EnemyPacketHandler;
import com.github.l3nnartt.timolia.core.handler.KitPacketHandler;
import com.github.l3nnartt.timolia.core.handler.MapPacketHandler;
import com.github.l3nnartt.timolia.core.handler.MatchPacketHandler;
import com.github.l3nnartt.timolia.core.handler.StreakPacketHandler;
import com.github.l3nnartt.timolia.core.hud.KitTextHudWidget;
import com.github.l3nnartt.timolia.core.packet.EnemyPacket;
import com.github.l3nnartt.timolia.core.packet.KitPacket;
import com.github.l3nnartt.timolia.core.packet.MapPacket;
import com.github.l3nnartt.timolia.core.packet.MatchPacket;
import com.github.l3nnartt.timolia.core.packet.StreakPacket;
import com.github.l3nnartt.timolia.core.translator.EnemyPayloadTranslator;
import com.github.l3nnartt.timolia.core.translator.KitPayloadTranslator;
import com.github.l3nnartt.timolia.core.translator.MapPayloadTranslator;
import com.github.l3nnartt.timolia.core.translator.MatchPayloadTranslator;
import com.github.l3nnartt.timolia.core.translator.StreakPayloadTranslator;
import com.google.inject.Singleton;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.inject.LabyGuice;
import net.labymod.api.models.addon.annotation.AddonListener;
import net.labymod.serverapi.protocol.api.ProtocolApi;
import net.labymod.serverapi.protocol.packet.protocol.ProtocolService;
import net.labymod.serverapi.protocol.packet.protocol.neo.NeoProtocol;

@Singleton
@AddonListener
public class TimoliaAddon extends LabyAddon<TimoliaConfiguration> {

  private static TimoliaAddon instance;

  @Override
  protected void enable() {
    instance = this;
    this.registerSettingCategory();

    //this.registerListener(ExampleGameTickListener.class);
    //this.registerCommand(ExamplePingCommand.class);

    this.labyAPI().hudWidgetRegistry().register(new KitTextHudWidget("kit"));

    ProtocolService protocolService = LabyGuice.getInstance(ProtocolApi.class).getProtocolService();
    protocolService.registerAddonProtocol(new TimoliaProtocol());

    NeoProtocol neoProtocol = protocolService.getNeoProtocol();
    neoProtocol.registerPacket(96, new StreakPacket());
    neoProtocol.registerPacket(97, new MatchPacket());
    neoProtocol.registerPacket(98, new EnemyPacket());
    neoProtocol.registerPacket(99, new MapPacket());
    neoProtocol.registerPacket(100, new KitPacket());

    protocolService.registerTranslationListener(new StreakPayloadTranslator());
    protocolService.registerTranslationListener(new MatchPayloadTranslator());
    protocolService.registerTranslationListener(new EnemyPayloadTranslator());
    protocolService.registerTranslationListener(new MapPayloadTranslator());
    protocolService.registerTranslationListener(new KitPayloadTranslator());

    protocolService.registerPacketHandler(StreakPacket.class, new StreakPacketHandler());
    protocolService.registerPacketHandler(MatchPacket.class, new MatchPacketHandler());
    protocolService.registerPacketHandler(EnemyPacket.class, new EnemyPacketHandler());
    protocolService.registerPacketHandler(MapPacket.class, new MapPacketHandler());
    protocolService.registerPacketHandler(KitPacket.class, new KitPacketHandler());

    this.logger().info("Enabled the Addon");
  }

  @Override
  protected Class<TimoliaConfiguration> configurationClass() {
    return TimoliaConfiguration.class;
  }

  public static TimoliaAddon getInstance() {
    return instance;
  }
}