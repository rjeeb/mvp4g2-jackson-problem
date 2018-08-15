package com.example.mytestproject.client;

import com.github.mvp4g.mvp4g2.core.internal.eventbus.EventMetaData;

public final class Com_example_mytestproject_client_MyTestProjectEventBus_start extends EventMetaData<MyTestProjectEventBus> {
  public Com_example_mytestproject_client_MyTestProjectEventBus_start() {
    super("start", "start", null, null, null, false, false);
    super.addBindHandler("com.example.mytestproject.client.ui.navigation.NavigationPresenter");
    super.addBindHandler("com.example.mytestproject.client.ui.header.HeaderPresenter");
    super.addBindHandler("com.example.mytestproject.client.ui.statusbar.StatusbarPresenter");
  }
}
