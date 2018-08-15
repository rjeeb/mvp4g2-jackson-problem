package com.example.mytestproject.client.ui.header;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_header_HeaderPresenterMetaData extends PresenterMetaData<HeaderPresenter, IHeaderView> {
  public Com_example_mytestproject_client_ui_header_HeaderPresenterMetaData() {
    super("com.example.mytestproject.client.ui.header.HeaderPresenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.FRAMEWORK);
    super.presenter = new HeaderPresenter();
    super.view = (IHeaderView) new HeaderView();
  }
}
