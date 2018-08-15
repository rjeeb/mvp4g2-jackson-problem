package com.example.mytestproject.client.ui.screen05;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData extends PresenterMetaData<Screen05Presenter, IScreen05View> {
  public Com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData() {
    super("com.example.mytestproject.client.ui.screen05.Screen05Presenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.FRAMEWORK);
    super.presenter = new Screen05Presenter();
    super.view = (IScreen05View) new Screen05View();
  }
}
