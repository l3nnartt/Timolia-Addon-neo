package com.github.l3nnartt.timolia.core.hud;

import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidget;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidgetConfig;

public class KitTextHudWidget extends TextHudWidget<TextHudWidgetConfig> {

  public KitTextHudWidget(String id) {
    super(id);
  }

  @Override
  public void load(TextHudWidgetConfig config) {
    super.load(config);
    super.createLine("Kit", "kit123");
  }

}