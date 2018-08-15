package com.example.mytestproject.client.ui.screen01;

import com.example.mytestproject.client.MyTestProjectEventBus;
import com.example.mytestproject.client.model.MyModel;
import com.github.mvp4g.mvp4g2.core.ui.AbstractPresenter;
import com.github.mvp4g.mvp4g2.core.ui.IsViewCreator;
import com.github.mvp4g.mvp4g2.core.ui.annotation.EventHandler;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;
import com.google.gwt.core.client.GWT;
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
    viewClass = Screen01View.class,
    viewInterface = IScreen01View.class,
    viewCreator = Presenter.VIEW_CREATION_METHOD.PRESENTER
)
public class Screen01Presenter extends AbstractPresenter<MyTestProjectEventBus, IScreen01View> implements IScreen01View.Presenter, IsViewCreator<IScreen01View> {
  private MyModel model;

  public Screen01Presenter() {
  }

  @Override
  public void onBeforeEvent(String eventName) {
    // This method will be call in case the presenter will handle a event and before the event handling
  }

  @EventHandler
  public void onGotoScreen01() {
    // Here we simulate the creation of a model.
    // In the real world we would do a server call or
    // something else to get the data.
    model = new MyModel("This value is set using the edit method! The value is >>" + "screen01" + "<<");
    // ok, now place our view into the content area of the viewport!
    eventBus.setContent(view.asWidget());
    // yet we are visible!
    // 
    // now, move the data out of the model into the widgets - that's what we do next
    view.edit(model);
    // update the statusbar at the buttom of the screen
    eventBus.updateStatus("active screen: >>screen01<<");
  }

  @EventHandler
  public void onInitHistory() {
    eventBus.gotoScreen01();
  }

  /**
   * Because we have told mvp4g2, that this presenter will create it's view
   * (viewCreator = Presenter.VIEW_CREATION_METHOD.PRESENTER), we have to
   * implement this method.
   *
   * This enables use, to use GWT.create or something else instead of new (what the framework is doing!)
   * Because this implementation does not know 'GWT.create()' we will do a simple new ... 
   *
   * @return a new instance of the view.
   */
  @Override
  public IScreen01View createView() {
    return GWT.create(Screen01View.class);
  }
}
