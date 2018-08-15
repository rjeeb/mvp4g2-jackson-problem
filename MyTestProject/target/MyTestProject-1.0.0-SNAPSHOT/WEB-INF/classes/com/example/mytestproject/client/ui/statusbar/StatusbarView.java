package com.example.mytestproject.client.ui.statusbar;

import com.github.mvp4g.mvp4g2.core.ui.LazyReverseView;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
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
public class StatusbarView extends LazyReverseView<IStatusbarView.Presenter> implements IStatusbarView {
  private SimplePanel container;

  private Label label;

  public StatusbarView() {
    super();
  }

  @Override
  public Widget asWidget() {
    return container;
  }

  @Override
  public void edit(String message) {
    label.setText(message);
  }

  @Override
  public void createView() {
    container = new SimplePanel();
    container.setSize("100%","100%");
    container.getElement().getStyle().setBackgroundColor("whitesmoke");
    container.getElement().getStyle().setPadding(12, Style.Unit.PX);
    label = new Label();
    container.setWidget(label);
  }
}
