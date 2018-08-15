package com.example.mytestproject.client.ui.screen02;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData extends PresenterMetaData<Screen02Presenter, IScreen02View> {
  public Com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData() {
    super("com.example.mytestproject.client.ui.screen02.Screen02Presenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.FRAMEWORK);
    super.presenter = new Screen02Presenter();
    super.view = (IScreen02View) new Screen02View();
  }
}
