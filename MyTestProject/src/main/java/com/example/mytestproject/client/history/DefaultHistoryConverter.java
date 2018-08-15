package com.example.mytestproject.client.history;

import com.example.mytestproject.client.MyTestProjectEventBus;
import com.github.mvp4g.mvp4g2.core.history.IsHistoryConverter;
import com.github.mvp4g.mvp4g2.core.history.annotation.History;
import java.lang.Override;
import java.lang.String;

@History(
    type = History.HistoryConverterType.SIMPLE
)
public class DefaultHistoryConverter implements IsHistoryConverter<MyTestProjectEventBus> {
  public DefaultHistoryConverter() {
  }

  @Override
  public void convertFromToken(String historyName, String param, MyTestProjectEventBus eventBus) {
    switch (historyName) {
      case "gotoScreen01":
      eventBus.gotoScreen01();
      break;
      case "gotoScreen02":
      eventBus.gotoScreen02();
      break;
      case "gotoScreen03":
      eventBus.gotoScreen03();
      break;
      case "gotoScreen04":
      eventBus.gotoScreen04();
      break;
      case "gotoScreen05":
      eventBus.gotoScreen05();
      break;
    }
  }

  @Override
  public boolean isCrawlable() {
    return false;
  }

  public String convertToToken(String historyName) {
    return "";
  }
}
