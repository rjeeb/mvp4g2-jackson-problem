package com.example.mytestproject.client.ui.shell;

import com.github.mvp4g.mvp4g2.core.ui.LazyReverseView;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.ResizeLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import java.lang.Override;

/**
 * Copyright (C) 2018 Frank Hossfeld <frank.hossfeld@googlemail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class ShellView extends LazyReverseView<IShellView.Presenter> implements IShellView {
  private ResizeLayoutPanel shell;

  private DockLayoutPanel container;

  private SimplePanel header;

  private SimplePanel navigation;

  private SimplePanel statusbar;

  private Widget widget;

  public ShellView() {
    super();
  }

  @Override
  public Widget asWidget() {
    return shell;
  }

  @Override
  public void createView() {
    shell = new ResizeLayoutPanel();
    shell.setSize("100%", "100%");
    shell.addResizeHandler(new ResizeHandler() {
      @Override
      public void onResize(ResizeEvent event) {
        forceLayout();
      }
    });
    container = new DockLayoutPanel(Style.Unit.PX);
    container.setSize("100%", "100%");
    shell.add(container);
    header = new SimplePanel();
    container.addNorth(header, 128);
    navigation = new SimplePanel();
    container.addWest(navigation, 212);
    statusbar = new SimplePanel();
    container.addSouth(statusbar, 42);
  }

  @Override
  public void setContent(Widget widget) {
    if (this.widget != null)  {
      this.widget.removeFromParent();
    }
    this.container.add(widget);
    this.widget = widget;
  }

  @Override
  public void setHeader(Widget widget) {
    if (this.header.getWidget() != null)  {
      this.header.getWidget().removeFromParent();
    }
    this.header.setWidget(widget);
  }

  @Override
  public void setNavigation(Widget widget) {
    if (this.navigation.getWidget() != null)  {
      this.navigation.getWidget().removeFromParent();
    }
    this.navigation.setWidget(widget);
  }

  @Override
  public void setStatusbar(Widget widget) {
    if (this.statusbar.getWidget() != null)  {
      this.statusbar.getWidget().removeFromParent();
    }
    this.statusbar.setWidget(widget);
  }

  public void forceLayout() {
  }
}
