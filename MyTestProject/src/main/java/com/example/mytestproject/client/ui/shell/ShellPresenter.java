package com.example.mytestproject.client.ui.shell;

import com.example.mytestproject.client.MyTestProjectEventBus;
import com.github.mvp4g.mvp4g2.core.ui.AbstractPresenter;
import com.github.mvp4g.mvp4g2.core.ui.IsShell;
import com.github.mvp4g.mvp4g2.core.ui.annotation.EventHandler;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import java.lang.Override;
import java.lang.String;

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
@Presenter(
    viewClass = ShellView.class,
    viewInterface = IShellView.class
)
public class ShellPresenter extends AbstractPresenter<MyTestProjectEventBus, IShellView> implements IShellView.Presenter, IsShell<MyTestProjectEventBus, IShellView> {
  public ShellPresenter() {
  }

  public void onBeforeEvent(String eventName) {
  }

  @EventHandler
  public void onSetContent(Widget widget) {
    view.setContent(widget);
  }

  @EventHandler
  public void onSetHeader(Widget widget) {
    view.setHeader(widget);
  }

  @EventHandler
  public void onSetNavigation(Widget widget) {
    view.setNavigation(widget);
  }

  @EventHandler
  public void onSetStatusbar(Widget widget) {
    view.setStatusbar(widget);
  }

  @Override
  public void setShell() {
    RootLayoutPanel.get().add(view.asWidget());
  }
}
