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
import com.zms.materialdesign.observablescrollview.ObservableListView;
import com.zms.materialdesign.observablescrollview.ObservableScrollViewCallbacks;

public class FillGap3ListViewActivity extends FillGap3BaseActivity<ObservableListView> implements ObservableScrollViewCallbacks {

    @Override
    protected ObservableListView createScrollable() {
        ObservableListView listView = (ObservableListView) findViewById(R.id.scroll);
        listView.setScrollViewCallbacks(this);
        setDummyDataFew(listView);
        return listView;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_fillgap3listview;
    }
}
