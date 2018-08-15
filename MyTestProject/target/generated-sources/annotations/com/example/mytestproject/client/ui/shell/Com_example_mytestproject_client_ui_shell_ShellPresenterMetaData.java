package com.example.mytestproject.client.ui.shell;

import com.github.mvp4g.mvp4g2.core.internal.ui.AbstractHandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;

public final class Com_example_mytestproject_client_ui_shell_ShellPresenterMetaData extends PresenterMetaData<ShellPresenter, IShellView> {
  public Com_example_mytestproject_client_ui_shell_ShellPresenterMetaData() {
    super("com.example.mytestproject.client.ui.shell.ShellPresenter", AbstractHandlerMetaData.Kind.PRESENTER, false, Presenter.VIEW_CREATION_METHOD.FRAMEWORK);
    super.presenter = new ShellPresenter();
    super.view = (IShellView) new ShellView();
  }
}
