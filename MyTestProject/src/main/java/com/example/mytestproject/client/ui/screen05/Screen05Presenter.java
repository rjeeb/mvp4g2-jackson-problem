package com.example.mytestproject.client.ui.screen05;

import com.example.mytestproject.client.MyTestProjectEventBus;
import com.example.mytestproject.client.model.MyModel;
import com.github.mvp4g.mvp4g2.core.ui.AbstractPresenter;
import com.github.mvp4g.mvp4g2.core.ui.annotation.EventHandler;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;
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
    viewClass = Screen05View.class,
    viewInterface = IScreen05View.class
)
public class Screen05Presenter extends AbstractPresenter<MyTestProjectEventBus, IScreen05View> implements IScreen05View.Presenter {
  private MyModel model;

  public Screen05Presenter() {
  }

  @Override
  public void onBeforeEvent(String eventName) {
    // This method will be call in case the presenter will handle a event and before the event handling
  }

  @EventHandler
  public void onGotoScreen05() {
    // Here we simulate the creation of a model.
    // In the real world we would do a server call or
    // something else to get the data.
    model = new MyModel("This value is set using the edit method! The value is >>" + "screen05" + "<<");
    // ok, now place our view into the content area of the viewport!
    eventBus.setContent(view.asWidget());
    // yet we are visible!
    // 
    // now, move the data out of the model into the widgets - that's what we do next
    view.edit(model);
    // update the statusbar at the buttom of the screen
    eventBus.updateStatus("active screen: >>screen05<<");
  }
}
