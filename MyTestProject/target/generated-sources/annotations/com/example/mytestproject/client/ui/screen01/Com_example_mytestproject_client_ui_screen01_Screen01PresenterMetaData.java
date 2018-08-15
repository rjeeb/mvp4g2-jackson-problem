package com.example.mytestproject.client.ui.screen01;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData extends PresenterMetaData<Screen01Presenter, IScreen01View> {
  public Com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData() {
    super("com.example.mytestproject.client.ui.screen01.Screen01Presenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.PRESENTER);
    super.presenter = new Screen01Presenter();
    super.view = presenter.createView();
  }
}
