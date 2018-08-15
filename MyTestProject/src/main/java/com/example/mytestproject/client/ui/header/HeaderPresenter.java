package com.example.mytestproject.client.ui.header;

import com.example.mytestproject.client.MyTestProjectEventBus;
import com.github.mvp4g.mvp4g2.core.ui.AbstractPresenter;
import com.github.mvp4g.mvp4g2.core.ui.annotation.Presenter;
import java.lang.Override;

/**
 * Copyright (C) 2018 Frank Hossfeld <frank.hossfeld@googlemail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Presenter(
    viewClass = HeaderView.class,
    viewInterface = IHeaderView.class
)
public class HeaderPresenter extends AbstractPresenter<MyTestProjectEventBus, IHeaderView> implements IHeaderView.Presenter {
  public HeaderPresenter() {
  }

  @Override
  public void bind() {
    eventBus.setHeader(view.asWidget());
  }
}
