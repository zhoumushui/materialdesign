/*
 * Copyright 2014 Soichiro Kashima
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zms.materialdesign.observablescrollview.activity;

import com.zms.materialdesign.R;
import com.zms.materialdesign.observablescrollview.ObservableScrollView;
import com.zms.materialdesign.observablescrollview.ObservableScrollViewCallbacks;

public class FillGap3ScrollViewActivity extends FillGap3BaseActivity<ObservableScrollView> implements ObservableScrollViewCallbacks {
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_fillgap3scrollview;
    }

    @Override
    protected ObservableScrollView createScrollable() {
        ObservableScrollView scrollView = (ObservableScrollView) findViewById(R.id.scroll);
        scrollView.setScrollViewCallbacks(this);
        return scrollView;
    }
}
