package com.example.mytestproject.client.ui.screen04;

import com.example.mytestproject.client.MyTestProjectEventBus;
import com.example.mytestproject.client.model.MyModel;
import com.github.mvp4g.mvp4g2.core.history.IsNavigationConfirmation;
import com.github.mvp4g.mvp4g2.core.history.NavigationEventCommand;
import com.github.mvp4g.mvp4g2.core.ui.AbstractPresenter;
import com.github.mvp4g.mvp4g2.core.ui.IsViewCreator;
import com.github.mvp4g.mvp4g2.core.ui.annotation.EventHandler;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
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
    viewClass = Screen04View.class,
    viewInterface = IScreen04View.class,
    viewCreator = Presenter.VIEW_CREATION_METHOD.PRESENTER
)
public class Screen04Presenter extends AbstractPresenter<MyTestProjectEventBus, IScreen04View> implements IScreen04View.Presenter, IsNavigationConfirmation, IsViewCreator<IScreen04View> {
  private MyModel model;

  public Screen04Presenter() {
  }

  @Override
  public void onBeforeEvent(String eventName) {
    // This method will be call in case the presenter will handle a event and before the event handling
  }

  @EventHandler
  public void onGotoScreen04() {
    // Here we simulate the creation of a model.
    // In the real world we would do a server call or
    // something else to get the data.
    model = new MyModel("This value is set using the edit method! The value is >>" + "screen04" + "<<");
    // ok, now place our view into the content area of the viewport!
    eventBus.setContent(view.asWidget());
    // yet we are visible!
    // 
    // now, move the data out of the model into the widgets - that's what we do next
    view.edit(model);
    // update the statusbar at the buttom of the screen
    eventBus.updateStatus("active screen: >>screen04<<");
    eventBus.setNavigationConfirmation(this);
  }

  /**
   * The confirm method will be called by the framework in
   * case a navigation event occured.
   *
   * It is up tp this method to decide if the navigation event
   * will be executed or not.
   *
   * this is a good place to validate the entered data and
   * move it into the model.
   */
  @Override
  public void confirm(NavigationEventCommand event) {
    // check if there are changes
    if (view.isDirty()) {
      // are you sure? :-)
      if (Window.confirm("Do you really want to cancel?")) {
        // ok, but before, we check the entered data (type safety and required fields)
        if (view.isValid()) {
          // move the data into the model
          view.flush(model);
          // navigate!
          event.fireEvent();
        } else {
          Window.alert("Please correct the error!");
        }
      }
    } else {
      event.fireEvent();
    }
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
  public IScreen04View createView() {
    return GWT.create(Screen04View.class);
  }
}
