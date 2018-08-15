package com.example.mytestproject.client.ui.screen04;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData extends PresenterMetaData<Screen04Presenter, IScreen04View> {
  public Com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData() {
    super("com.example.mytestproject.client.ui.screen04.Screen04Presenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.PRESENTER);
    super.presenter = new Screen04Presenter();
    super.view = presenter.createView();
  }
}
