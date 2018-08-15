package com.example.mytestproject.client.ui.navigation;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData extends PresenterMetaData<NavigationPresenter, INavigationView> {
  public Com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData() {
    super("com.example.mytestproject.client.ui.navigation.NavigationPresenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.FRAMEWORK);
    super.presenter = new NavigationPresenter();
    super.view = (INavigationView) new NavigationView();
  }
}
