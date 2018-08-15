package com.example.mytestproject.client.ui.navigation;

import com.github.mvp4g.mvp4g2.core.ui.LazyReverseView;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
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
public class NavigationView extends LazyReverseView<INavigationView.Presenter> implements INavigationView {
  private SimplePanel container;

  public NavigationView() {
    super();
  }

  @Override
  public Widget asWidget() {
    return container;
  }

  @Override
  public void createView() {
    container = new SimplePanel();
    container.setSize("100%","100%");
    container.getElement().getStyle().setBackgroundColor("snow");
    VerticalPanel innerContainer = new VerticalPanel();
    container.setWidget(innerContainer);
    Anchor anchorscreen01 = new Anchor("screen01");
    anchorscreen01.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        getPresenter().doNavigateTo("screen01");
      }
    });
    anchorscreen01.getElement().getStyle().setMargin(24, Style.Unit.PX);
    innerContainer.add(anchorscreen01);
    Anchor anchorscreen02 = new Anchor("screen02");
    anchorscreen02.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        getPresenter().doNavigateTo("screen02");
      }
    });
    anchorscreen02.getElement().getStyle().setMargin(24, Style.Unit.PX);
    innerContainer.add(anchorscreen02);
    Anchor anchorscreen03 = new Anchor("screen03");
    anchorscreen03.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        getPresenter().doNavigateTo("screen03");
      }
    });
    anchorscreen03.getElement().getStyle().setMargin(24, Style.Unit.PX);
    innerContainer.add(anchorscreen03);
    Anchor anchorscreen04 = new Anchor("screen04");
    anchorscreen04.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        getPresenter().doNavigateTo("screen04");
      }
    });
    anchorscreen04.getElement().getStyle().setMargin(24, Style.Unit.PX);
    innerContainer.add(anchorscreen04);
    Anchor anchorscreen05 = new Anchor("screen05");
    anchorscreen05.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        getPresenter().doNavigateTo("screen05");
      }
    });
    anchorscreen05.getElement().getStyle().setMargin(24, Style.Unit.PX);
    innerContainer.add(anchorscreen05);
  }
}
