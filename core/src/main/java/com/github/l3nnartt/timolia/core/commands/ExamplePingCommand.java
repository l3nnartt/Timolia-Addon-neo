package com.github.l3nnartt.timolia.core.commands;

import net.labymod.api.client.component.Component;
import net.labymod.api.client.component.format.NamedTextColor;
import net.labymod.api.client.chat.command.Command;

public class ExamplePingCommand extends Command {

  private ExamplePingCommand() {
    super("ping", "pong");
  }

  @Override
  public boolean execute(String prefix, String[] arguments) {
    if (prefix.equalsIgnoreCase("ping")) {
      this.displayMessage(Component.text("Ping!", NamedTextColor.AQUA));
      return false;
    }

    this.displayMessage(Component.text("Pong!", NamedTextColor.GOLD));
    return true;
  }
}
