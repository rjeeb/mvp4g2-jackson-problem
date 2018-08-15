package com.example.mytestproject.client;

import com.github.mvp4g.mvp4g2.core.application.IsApplicationLoader;
import com.github.mvp4g.mvp4g2.core.internal.application.AbstractApplication;
import java.lang.Override;

public final class MyTestProjectApplicationImpl extends AbstractApplication<MyTestProjectEventBus> implements MyTestProjectApplication {
  public MyTestProjectApplicationImpl() {
    super();
    super.eventBus = new com.example.mytestproject.client.MyTestProjectEventBusImpl();
    super.historyOnStart = true;
    super.encodeToken = false;
  }

  @Override
  public IsApplicationLoader getApplicationLoader() {
    return new MyTestProjectLoader();
  }
}
