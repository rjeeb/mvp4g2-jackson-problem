package com.example.mytestproject.client.ui.statusbar;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData extends PresenterMetaData<StatusbarPresenter, IStatusbarView> {
  public Com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData() {
    super("com.example.mytestproject.client.ui.statusbar.StatusbarPresenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.FRAMEWORK);
    super.presenter = new StatusbarPresenter();
    super.view = (IStatusbarView) new StatusbarView();
  }
}
