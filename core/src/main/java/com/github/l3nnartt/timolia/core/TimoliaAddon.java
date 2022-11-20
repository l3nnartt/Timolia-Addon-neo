package com.github.l3nnartt.timolia.core;

import com.google.inject.Singleton;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonListener;

@Singleton
@AddonListener
public class TimoliaAddon extends LabyAddon<TimoliaConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();

    //this.registerListener(ExampleGameTickListener.class);
    //this.registerCommand(ExamplePingCommand.class);

    this.logger().info("Enabled the Addon");
  }

  @Override
  protected Class<TimoliaConfiguration> configurationClass() {
    return TimoliaConfiguration.class;
  }
}