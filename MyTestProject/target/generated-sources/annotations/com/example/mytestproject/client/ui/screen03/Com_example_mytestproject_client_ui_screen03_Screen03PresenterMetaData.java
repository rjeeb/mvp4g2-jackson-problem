package com.example.mytestproject.client.ui.screen03;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData extends PresenterMetaData<Screen03Presenter, IScreen03View> {
  public Com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData() {
    super("com.example.mytestproject.client.ui.screen03.Screen03Presenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.FRAMEWORK);
    super.presenter = new Screen03Presenter();
    super.view = (IScreen03View) new Screen03View();
  }
}
