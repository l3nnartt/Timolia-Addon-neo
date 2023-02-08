package com.github.l3nnartt.timolia.core.hud;

import com.github.l3nnartt.timolia.core.packet.StreakPacket;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidget;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidgetConfig;
import net.labymod.api.client.gui.hud.hudwidget.text.TextLine;

public class KitTextHudWidget extends TextHudWidget<TextHudWidgetConfig> {

  private TextLine kitLine;
  private static KitTextHudWidget instance;

  public KitTextHudWidget(String id) {
    super(id);
    instance = this;
  }

  @Override
  public void load(TextHudWidgetConfig config) {
    super.load(config);
    this.kitLine = super.createLine("Kit", "");
  }

  public static KitTextHudWidget getInstance() {
    return instance;
  }

  public TextLine getKitLine() {
    return kitLine;
  }

  public void setKitLine(String kitLine) {
    this.kitLine.updateAndFlush(kitLine);
  }
}