package com.example.mytestproject.client.ui.screen05;

import com.example.mytestproject.client.model.MyModel;
import com.github.mvp4g.mvp4g2.core.ui.LazyReverseView;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.Label;
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
public class Screen05View extends LazyReverseView<IScreen05View.Presenter> implements IScreen05View {
  private SimplePanel container;

  private Label label;

  public Screen05View() {
    super();
  }

  @Override
  public Widget asWidget() {
    return container;
  }

  @Override
  public void edit(MyModel model) {
    // that's a good place to move your data out of the model into wth widgets
    // 
    // Using GWT 2.x you can use the editor framewok and in this case
    // it is a good idea to edit and flush ths data inside the presenter.
    label.setText(model.getActiveScreen());
  }

  @Override
  public void createView() {
    container = new SimplePanel();
    label = new Label();
    label.getElement().getStyle().setMargin(12, Style.Unit.PX);
    container.setWidget(label);
  }
}
