package com.example.mytestproject.client;

import com.example.mytestproject.client.ui.header.Com_example_mytestproject_client_ui_header_HeaderPresenterMetaData;
import com.example.mytestproject.client.ui.navigation.Com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData;
import com.example.mytestproject.client.ui.screen01.Com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData;
import com.example.mytestproject.client.ui.screen01.Screen01Presenter;
import com.example.mytestproject.client.ui.screen02.Com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData;
import com.example.mytestproject.client.ui.screen02.Screen02Presenter;
import com.example.mytestproject.client.ui.screen03.Com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData;
import com.example.mytestproject.client.ui.screen03.Screen03Presenter;
import com.example.mytestproject.client.ui.screen04.Com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData;
import com.example.mytestproject.client.ui.screen04.Screen04Presenter;
import com.example.mytestproject.client.ui.screen05.Com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData;
import com.example.mytestproject.client.ui.screen05.Screen05Presenter;
import com.example.mytestproject.client.ui.shell.Com_example_mytestproject_client_ui_shell_ShellPresenterMetaData;
import com.example.mytestproject.client.ui.shell.ShellPresenter;
import com.example.mytestproject.client.ui.statusbar.Com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData;
import com.example.mytestproject.client.ui.statusbar.StatusbarPresenter;
import com.github.mvp4g.mvp4g2.core.Mvp4g2RuntimeException;
import com.github.mvp4g.mvp4g2.core.eventbus.PresenterRegistration;
import com.github.mvp4g.mvp4g2.core.eventbus.annotation.Debug;
import com.github.mvp4g.mvp4g2.core.history.NavigationEventCommand;
import com.github.mvp4g.mvp4g2.core.internal.eventbus.AbstractEventBus;
import com.github.mvp4g.mvp4g2.core.internal.eventbus.DefaultMvp4g2Logger;
import com.github.mvp4g.mvp4g2.core.internal.eventbus.EventMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.HandlerMetaData;
import com.github.mvp4g.mvp4g2.core.internal.ui.PresenterMetaData;
import com.github.mvp4g.mvp4g2.core.ui.IsPresenter;
import com.google.gwt.user.client.ui.Widget;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public final class MyTestProjectEventBusImpl extends AbstractEventBus<MyTestProjectEventBus> implements MyTestProjectEventBus {
  public MyTestProjectEventBusImpl() {
    super("com.example.mytestproject.client.ui.shell.ShellPresenter");
  }

  @Override
  public void loadDebugConfiguration() {
    super.setDebugEnable(true);
    super.setLogger(new DefaultMvp4g2Logger());
    super.setLogLevel(Debug.LogLevel.DETAILED);
  }

  @Override
  public void loadFilterConfiguration() {
    super.setFiltersEnable(false);
  }

  @Override
  protected void loadEventMetaData() {
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_updateStatus
    // 
    super.putEventMetaData("updateStatus_pPp_java_lang_String", new Com_example_mytestproject_client_MyTestProjectEventBus_updateStatus());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_setHeader
    // 
    super.putEventMetaData("setHeader_pPp_com_google_gwt_user_client_ui_Widget", new Com_example_mytestproject_client_MyTestProjectEventBus_setHeader());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_start
    // 
    super.putEventMetaData("start", new Com_example_mytestproject_client_MyTestProjectEventBus_start());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen01
    // 
    super.putEventMetaData("gotoScreen01", new Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen01());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen02
    // 
    super.putEventMetaData("gotoScreen02", new Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen02());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_initHistory
    // 
    super.putEventMetaData("initHistory", new Com_example_mytestproject_client_MyTestProjectEventBus_initHistory());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen03
    // 
    super.putEventMetaData("gotoScreen03", new Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen03());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_setStatusbar
    // 
    super.putEventMetaData("setStatusbar_pPp_com_google_gwt_user_client_ui_Widget", new Com_example_mytestproject_client_MyTestProjectEventBus_setStatusbar());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen04
    // 
    super.putEventMetaData("gotoScreen04", new Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen04());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen05
    // 
    super.putEventMetaData("gotoScreen05", new Com_example_mytestproject_client_MyTestProjectEventBus_gotoScreen05());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_setNavigation
    // 
    super.putEventMetaData("setNavigation_pPp_com_google_gwt_user_client_ui_Widget", new Com_example_mytestproject_client_MyTestProjectEventBus_setNavigation());
    // 
    // ----------------------------------------------------------------------
    // 
    // handle Com_example_mytestproject_client_MyTestProjectEventBus_setContent
    // 
    super.putEventMetaData("setContent_pPp_com_google_gwt_user_client_ui_Widget", new Com_example_mytestproject_client_MyTestProjectEventBus_setContent());
  }

  @Override
  public final void updateStatus(final String statusMessage) {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      execUpdateStatus(statusMessage);
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execUpdateStatus(final String statusMessage) {
    super.logEvent(++AbstractEventBus.logDepth, "updateStatus", statusMessage);
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("updateStatus", statusMessage)) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("updateStatus_pPp_java_lang_String");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData, statusMessage);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.statusbar.StatusbarPresenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.statusbar.StatusbarPresenter");
    super.executePresenter(eventMetaData, presenters, null, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName(), statusMessage);
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((StatusbarPresenter) metaData.getPresenter()).onUpdateStatus(statusMessage);
      }
    }, false);
  }

  @Override
  public final void setHeader(final Widget widget) {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      execSetHeader(widget);
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execSetHeader(final Widget widget) {
    super.logEvent(++AbstractEventBus.logDepth, "setHeader", widget);
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("setHeader", widget)) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("setHeader_pPp_com_google_gwt_user_client_ui_Widget");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData, widget);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.shell.ShellPresenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.shell.ShellPresenter");
    super.executePresenter(eventMetaData, presenters, null, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName(), widget);
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((ShellPresenter) metaData.getPresenter()).onSetHeader(widget);
      }
    }, false);
  }

  @Override
  public final void start() {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      execStart();
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execStart() {
    super.logEvent(++AbstractEventBus.logDepth, "start");
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("start")) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("start");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
  }

  @Override
  public final void gotoScreen01() {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      super.logAskingForConfirmation(++AbstractEventBus.logDepth, "gotoScreen01");
      super.placeService.confirmEvent(new NavigationEventCommand(this) {
        @Override
        public void execute() {
          execGotoScreen01();
        }
      });
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execGotoScreen01() {
    super.logEvent(++AbstractEventBus.logDepth, "gotoScreen01");
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("gotoScreen01")) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("gotoScreen01");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.screen01.Screen01Presenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.screen01.Screen01Presenter");
    super.executePresenter(eventMetaData, presenters, listOfExecutedHandlers, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName());
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((Screen01Presenter) metaData.getPresenter()).onGotoScreen01();
      }
    }, true);
    if (listOfExecutedHandlers.size() > 0) {
      super.placeService.place("gotoScreen01", ((com.example.mytestproject.client.history.DefaultHistoryConverter) super.placeService.getHistoryConverter("gotoScreen01")).convertToToken("gotoScreen01"), false);
    }
  }

  @Override
  public final void gotoScreen02() {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      super.logAskingForConfirmation(++AbstractEventBus.logDepth, "gotoScreen02");
      super.placeService.confirmEvent(new NavigationEventCommand(this) {
        @Override
        public void execute() {
          execGotoScreen02();
        }
      });
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execGotoScreen02() {
    super.logEvent(++AbstractEventBus.logDepth, "gotoScreen02");
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("gotoScreen02")) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("gotoScreen02");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.screen02.Screen02Presenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.screen02.Screen02Presenter");
    super.executePresenter(eventMetaData, presenters, listOfExecutedHandlers, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName());
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((Screen02Presenter) metaData.getPresenter()).onGotoScreen02();
      }
    }, true);
    if (listOfExecutedHandlers.size() > 0) {
      super.placeService.place("gotoScreen02", ((com.example.mytestproject.client.history.DefaultHistoryConverter) super.placeService.getHistoryConverter("gotoScreen02")).convertToToken("gotoScreen02"), false);
    }
  }

  @Override
  public final void initHistory() {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      execInitHistory();
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execInitHistory() {
    super.logEvent(++AbstractEventBus.logDepth, "initHistory");
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("initHistory")) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("initHistory");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.screen01.Screen01Presenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.screen01.Screen01Presenter");
    super.executePresenter(eventMetaData, presenters, null, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName());
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((Screen01Presenter) metaData.getPresenter()).onInitHistory();
      }
    }, false);
  }

  @Override
  public final void gotoScreen03() {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      super.logAskingForConfirmation(++AbstractEventBus.logDepth, "gotoScreen03");
      super.placeService.confirmEvent(new NavigationEventCommand(this) {
        @Override
        public void execute() {
          execGotoScreen03();
        }
      });
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execGotoScreen03() {
    super.logEvent(++AbstractEventBus.logDepth, "gotoScreen03");
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("gotoScreen03")) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("gotoScreen03");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.screen03.Screen03Presenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.screen03.Screen03Presenter");
    super.executePresenter(eventMetaData, presenters, listOfExecutedHandlers, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName());
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((Screen03Presenter) metaData.getPresenter()).onGotoScreen03();
      }
    }, true);
    if (listOfExecutedHandlers.size() > 0) {
      super.placeService.place("gotoScreen03", ((com.example.mytestproject.client.history.DefaultHistoryConverter) super.placeService.getHistoryConverter("gotoScreen03")).convertToToken("gotoScreen03"), false);
    }
  }

  @Override
  public final void setStatusbar(final Widget widget) {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      execSetStatusbar(widget);
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execSetStatusbar(final Widget widget) {
    super.logEvent(++AbstractEventBus.logDepth, "setStatusbar", widget);
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("setStatusbar", widget)) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("setStatusbar_pPp_com_google_gwt_user_client_ui_Widget");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData, widget);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.shell.ShellPresenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.shell.ShellPresenter");
    super.executePresenter(eventMetaData, presenters, null, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName(), widget);
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((ShellPresenter) metaData.getPresenter()).onSetStatusbar(widget);
      }
    }, false);
  }

  @Override
  public final void gotoScreen04() {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      super.logAskingForConfirmation(++AbstractEventBus.logDepth, "gotoScreen04");
      super.placeService.confirmEvent(new NavigationEventCommand(this) {
        @Override
        public void execute() {
          execGotoScreen04();
        }
      });
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execGotoScreen04() {
    super.logEvent(++AbstractEventBus.logDepth, "gotoScreen04");
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("gotoScreen04")) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("gotoScreen04");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.screen04.Screen04Presenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.screen04.Screen04Presenter");
    super.executePresenter(eventMetaData, presenters, listOfExecutedHandlers, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName());
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((Screen04Presenter) metaData.getPresenter()).onGotoScreen04();
      }
    }, true);
    if (listOfExecutedHandlers.size() > 0) {
      super.placeService.place("gotoScreen04", ((com.example.mytestproject.client.history.DefaultHistoryConverter) super.placeService.getHistoryConverter("gotoScreen04")).convertToToken("gotoScreen04"), false);
    }
  }

  @Override
  public final void gotoScreen05() {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      super.logAskingForConfirmation(++AbstractEventBus.logDepth, "gotoScreen05");
      super.placeService.confirmEvent(new NavigationEventCommand(this) {
        @Override
        public void execute() {
          execGotoScreen05();
        }
      });
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execGotoScreen05() {
    super.logEvent(++AbstractEventBus.logDepth, "gotoScreen05");
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("gotoScreen05")) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("gotoScreen05");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.screen05.Screen05Presenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.screen05.Screen05Presenter");
    super.executePresenter(eventMetaData, presenters, listOfExecutedHandlers, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName());
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((Screen05Presenter) metaData.getPresenter()).onGotoScreen05();
      }
    }, true);
    if (listOfExecutedHandlers.size() > 0) {
      super.placeService.place("gotoScreen05", ((com.example.mytestproject.client.history.DefaultHistoryConverter) super.placeService.getHistoryConverter("gotoScreen05")).convertToToken("gotoScreen05"), false);
    }
  }

  @Override
  public final void setNavigation(final Widget widget) {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      execSetNavigation(widget);
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execSetNavigation(final Widget widget) {
    super.logEvent(++AbstractEventBus.logDepth, "setNavigation", widget);
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("setNavigation", widget)) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("setNavigation_pPp_com_google_gwt_user_client_ui_Widget");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData, widget);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.shell.ShellPresenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.shell.ShellPresenter");
    super.executePresenter(eventMetaData, presenters, null, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName(), widget);
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((ShellPresenter) metaData.getPresenter()).onSetNavigation(widget);
      }
    }, false);
  }

  @Override
  public final void setContent(final Widget widget) {
    int startLogDepth = AbstractEventBus.logDepth;
    try {
      execSetContent(widget);
    } finally {
      AbstractEventBus.logDepth = startLogDepth;
    }
  }

  public final void execSetContent(final Widget widget) {
    super.logEvent(++AbstractEventBus.logDepth, "setContent", widget);
    ++AbstractEventBus.logDepth;
    if (!super.filterEvent("setContent", widget)) {
      return;
    }
    EventMetaData<MyTestProjectEventBus> eventMetaData = super.getEventMetaData("setContent_pPp_com_google_gwt_user_client_ui_Widget");
    super.createAndBindView(eventMetaData);
    super.bind(eventMetaData, widget);
    super.activate(eventMetaData);
    super.deactivate(eventMetaData);
    List<HandlerMetaData<?>> handlers = null;
    List<PresenterMetaData<?, ?>> presenters = null;
    List<String> listOfExecutedHandlers = new ArrayList<>();
    // handling: com.example.mytestproject.client.ui.shell.ShellPresenter
    presenters = this.presenterMetaDataMap.get("com.example.mytestproject.client.ui.shell.ShellPresenter");
    super.executePresenter(eventMetaData, presenters, null, new AbstractEventBus.ExecPresenter() {
      @Override
      public boolean execPass(EventMetaData<?> eventMetaData, PresenterMetaData<?, ?> metaData) {
        return metaData.getPresenter().pass(eventMetaData.getEventName(), widget);
      }

      @Override
      public void execEventHandlingMethod(PresenterMetaData<?, ?> metaData) {
        ((ShellPresenter) metaData.getPresenter()).onSetContent(widget);
      }
    }, false);
  }

  @Override
  public final void fireStartEvent() {
    this.start();
  }

  @Override
  public final void fireInitHistoryEvent() {
    this.initHistory();
  }

  @Override
  public final void fireNotFoundHistoryEvent() {
    this.initHistory();
  }

  @Override
  public PresenterRegistration addHandler(IsPresenter<?, ?> presenter, boolean bind) throws
      Mvp4g2RuntimeException {
    throw new Mvp4g2RuntimeException(presenter.getClass().getCanonicalName() + ": can not be used with the addHandler()-method, because it is not defined as multiple presenter!");
  }

  @Override
  protected void loadEventHandlerMetaData() {
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.shell.ShellPresenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_shell_ShellPresenterMetaData com_example_mytestproject_client_ui_shell_ShellPresenterMetaData = new Com_example_mytestproject_client_ui_shell_ShellPresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.shell.ShellPresenter", com_example_mytestproject_client_ui_shell_ShellPresenterMetaData);
    com_example_mytestproject_client_ui_shell_ShellPresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_shell_ShellPresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_shell_ShellPresenterMetaData.getView());
    com_example_mytestproject_client_ui_shell_ShellPresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_shell_ShellPresenterMetaData.getPresenter());
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.navigation.NavigationPresenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData = new Com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.navigation.NavigationPresenter", com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData);
    com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData.getView());
    com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_navigation_NavigationPresenterMetaData.getPresenter());
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.header.HeaderPresenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_header_HeaderPresenterMetaData com_example_mytestproject_client_ui_header_HeaderPresenterMetaData = new Com_example_mytestproject_client_ui_header_HeaderPresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.header.HeaderPresenter", com_example_mytestproject_client_ui_header_HeaderPresenterMetaData);
    com_example_mytestproject_client_ui_header_HeaderPresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_header_HeaderPresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_header_HeaderPresenterMetaData.getView());
    com_example_mytestproject_client_ui_header_HeaderPresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_header_HeaderPresenterMetaData.getPresenter());
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.statusbar.StatusbarPresenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData = new Com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.statusbar.StatusbarPresenter", com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData);
    com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData.getView());
    com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_statusbar_StatusbarPresenterMetaData.getPresenter());
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.screen03.Screen03Presenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData = new Com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.screen03.Screen03Presenter", com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData);
    com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData.getView());
    com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_screen03_Screen03PresenterMetaData.getPresenter());
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.screen02.Screen02Presenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData = new Com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.screen02.Screen02Presenter", com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData);
    com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData.getView());
    com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_screen02_Screen02PresenterMetaData.getPresenter());
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.screen01.Screen01Presenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData = new Com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.screen01.Screen01Presenter", com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData);
    com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData.getView());
    com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_screen01_Screen01PresenterMetaData.getPresenter());
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.screen05.Screen05Presenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData = new Com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.screen05.Screen05Presenter", com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData);
    com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData.getView());
    com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_screen05_Screen05PresenterMetaData.getPresenter());
    // 
    // ===> 
    // handle com.example.mytestproject.client.ui.screen04.Screen04Presenter (Presenter)
    // 
    Com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData = new Com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData();
    super.putPresenterMetaData("com.example.mytestproject.client.ui.screen04.Screen04Presenter", com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData);
    com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData.getPresenter().setEventBus(this);
    com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData.getPresenter().setView(com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData.getView());
    com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData.getView().setPresenter(com_example_mytestproject_client_ui_screen04_Screen04PresenterMetaData.getPresenter());
    // 
    // ===> add the handler to the handler list of the EventMetaData-class
    super.getEventMetaData("gotoScreen03").addHandler("com.example.mytestproject.client.ui.screen03.Screen03Presenter");
    super.getEventMetaData("updateStatus_pPp_java_lang_String").addHandler("com.example.mytestproject.client.ui.statusbar.StatusbarPresenter");
    super.getEventMetaData("gotoScreen02").addHandler("com.example.mytestproject.client.ui.screen02.Screen02Presenter");
    super.getEventMetaData("setContent_pPp_com_google_gwt_user_client_ui_Widget").addHandler("com.example.mytestproject.client.ui.shell.ShellPresenter");
    super.getEventMetaData("setHeader_pPp_com_google_gwt_user_client_ui_Widget").addHandler("com.example.mytestproject.client.ui.shell.ShellPresenter");
    super.getEventMetaData("setNavigation_pPp_com_google_gwt_user_client_ui_Widget").addHandler("com.example.mytestproject.client.ui.shell.ShellPresenter");
    super.getEventMetaData("setStatusbar_pPp_com_google_gwt_user_client_ui_Widget").addHandler("com.example.mytestproject.client.ui.shell.ShellPresenter");
    super.getEventMetaData("gotoScreen01").addHandler("com.example.mytestproject.client.ui.screen01.Screen01Presenter");
    super.getEventMetaData("initHistory").addHandler("com.example.mytestproject.client.ui.screen01.Screen01Presenter");
    super.getEventMetaData("gotoScreen05").addHandler("com.example.mytestproject.client.ui.screen05.Screen05Presenter");
    super.getEventMetaData("gotoScreen04").addHandler("com.example.mytestproject.client.ui.screen04.Screen04Presenter");
  }
}
