package com.github.l3nnartt.timolia.core.hud;

import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidget;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidgetConfig;
import net.labymod.api.client.gui.hud.hudwidget.text.TextLine;

public class MapTextHudidget extends TextHudWidget<TextHudWidgetConfig> {

  private TextLine mapLine;
  private static MapTextHudidget instance;

  public MapTextHudidget(String id) {
    super(id);
    instance = this;
  }

  public MapTextHudidget(String id, Class<TextHudWidgetConfig> configClass) {
    super(id, configClass);
    this.mapLine = super.createLine("Map", "");
  }

  public static MapTextHudidget getInstance() {
    return instance;
  }

  public TextLine getMapLine() {
    return mapLine;
  }

  public void setMapLine(TextLine mapLine) {
    this.mapLine = mapLine;
  }
}