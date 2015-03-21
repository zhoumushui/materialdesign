package com.zms.materialdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.zms.materialdesign.observablescrollview.activity.ActionBarControlGridViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ActionBarControlListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ActionBarControlRecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ActionBarControlScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ActionBarControlWebViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGap2ListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGap2RecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGap2ScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGap3ListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGap3RecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGap3ScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGapListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGapRecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FillGapScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FlexibleSpaceToolbarScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FlexibleSpaceWithImageListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FlexibleSpaceWithImageRecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FlexibleSpaceWithImageScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FlexibleSpaceWithImageWithViewPagerTab2Activity;
import com.zms.materialdesign.observablescrollview.activity.FragmentActionBarControlListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.FragmentTransitionActivity;
import com.zms.materialdesign.observablescrollview.activity.HandleTouchGridViewActivity;
import com.zms.materialdesign.observablescrollview.activity.HandleTouchListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.HandleTouchRecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.HandleTouchScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.HandleTouchWebViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ParallaxToolbarListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ParallaxToolbarScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ScrollFromBottomListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ScrollFromBottomRecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.SlidingUpGridViewActivity;
import com.zms.materialdesign.observablescrollview.activity.SlidingUpListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.SlidingUpRecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.SlidingUpScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.SlidingUpWebViewActivity;
import com.zms.materialdesign.observablescrollview.activity.StickyHeaderListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.StickyHeaderRecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.StickyHeaderScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.StickyHeaderWebViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ToolbarControlGridViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ToolbarControlListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ToolbarControlRecyclerViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ToolbarControlScrollViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ToolbarControlWebViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ViewPagerTab2Activity;
import com.zms.materialdesign.observablescrollview.activity.ViewPagerTabActivity;
import com.zms.materialdesign.observablescrollview.activity.ViewPagerTabFragmentActivity;
import com.zms.materialdesign.observablescrollview.activity.ViewPagerTabListViewActivity;
import com.zms.materialdesign.observablescrollview.activity.ViewPagerTabScrollViewActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AlexZhou on 2015/3/20.
 * 14:13
 */
public class ObservableScrollViewActivity extends Activity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.observable_scrollview);
        listView = (ListView) findViewById(R.id.list);

        final List<String> adapterData = new ArrayList<String>();

        // Initial ListView Text Content
        adapterData.add("00-Toast HeHe");
        adapterData.add("01-ActionBarControlGridViewActivity");    // 1
        adapterData.add("02-ActionBarControlListViewActivity");    // 2
        adapterData.add("03-ActionBarControlRecyclerViewActivity");    // 3
        adapterData.add("04-ActionBarControlScrollViewActivity");    // 4
        adapterData.add("05-ActionBarControlWebViewActivity");    // 5
        adapterData.add("06-FillGap2ListViewActivity");    // 6
        adapterData.add("07-FillGap2RecyclerViewActivity");    // 7
        adapterData.add("08-FillGap2ScrollViewActivity");    // 8
        adapterData.add("09-FillGap3ListViewActivity");    // 9
        adapterData.add("10-FillGap3RecyclerViewActivity");    // 10
        adapterData.add("11-FillGap3ScrollViewActivity");    // 11
        adapterData.add("12-FillGapListViewActivity");    // 12
        adapterData.add("13-FillGapRecyclerViewActivity");    // 13
        adapterData.add("14-FillGapScrollViewActivity");    // 14
        adapterData.add("15-FlexibleSpaceToolbarScrollViewActivity");    // 15
        adapterData.add("16-FlexibleSpaceWithImageScrollViewActivity");    // 16
        adapterData.add("17-FlexibleSpaceWithImageRecyclerViewActivity");    // 17
        adapterData.add("18-FlexibleSpaceWithImageWithViewPagerTab2Activity");    // 18
        adapterData.add("19-FlexibleSpaceWithImageListViewActivity");    // 19
        adapterData.add("20-FragmentActionBarControlListViewActivity");    // 20
        adapterData.add("21-FragmentTransitionActivity");    // 21
        adapterData.add("22-HandleTouchGridViewActivity");    // 22
        adapterData.add("23-HandleTouchListViewActivity");    // 23
        adapterData.add("24-HandleTouchRecyclerViewActivity");    // 24
        adapterData.add("25-HandleTouchScrollViewActivity");    // 25
        adapterData.add("26-HandleTouchWebViewActivity");    // 26
        adapterData.add("27-ParallaxToolbarListViewActivity");    // 27
        adapterData.add("28-ParallaxToolbarScrollViewActivity");    // 28
        adapterData.add("29-ScrollFromBottomListViewActivity");    // 29
        adapterData.add("30-ScrollFromBottomRecyclerViewActivity");    // 30
        adapterData.add("31-SlidingUpGridViewActivity");    // 31
        adapterData.add("32-SlidingUpListViewActivity");    // 32
        adapterData.add("33-SlidingUpRecyclerViewActivity");    // 33
        adapterData.add("34-SlidingUpScrollViewActivity");    // 34
        adapterData.add("35-SlidingUpWebViewActivity");    // 35
        adapterData.add("36-StickyHeaderListViewActivity");    // 36
        adapterData.add("37-StickyHeaderRecyclerViewActivity");    // 37
        adapterData.add("38-StickyHeaderScrollViewActivity");    // 38
        adapterData.add("39-StickyHeaderWebViewActivity");    // 39
        adapterData.add("40-ToolbarControlGridViewActivity");    // 40
        adapterData.add("41-ToolbarControlListViewActivity");    // 41
        adapterData.add("42-ToolbarControlRecyclerViewActivity");    // 42
        adapterData.add("43-ToolbarControlScrollViewActivity");    // 43
        adapterData.add("44-ToolbarControlWebViewActivity");    // 44
        adapterData.add("45-ViewPagerTab2Activity");    // 45
        adapterData.add("46-ViewPagerTabActivity");    // 46
        adapterData.add("47-ViewPagerTabFragmentActivity");    // 47
        adapterData.add("48-ViewPagerTabListViewActivity");    // 48
        adapterData.add("49-ViewPagerTabScrollViewActivity");    // 49

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, adapterData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent intent1 = new Intent(ObservableScrollViewActivity.this,
                                ActionBarControlGridViewActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(ObservableScrollViewActivity.this,
                                ActionBarControlListViewActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(ObservableScrollViewActivity.this,
                                ActionBarControlRecyclerViewActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(ObservableScrollViewActivity.this,
                                ActionBarControlScrollViewActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(ObservableScrollViewActivity.this,
                                ActionBarControlWebViewActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(ObservableScrollViewActivity.this,
                                FillGap2ListViewActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(ObservableScrollViewActivity.this,
                                FillGap2RecyclerViewActivity.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(ObservableScrollViewActivity.this,
                                FillGap2ScrollViewActivity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(ObservableScrollViewActivity.this,
                                FillGap3ListViewActivity.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(ObservableScrollViewActivity.this,
                                FillGap3RecyclerViewActivity.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(ObservableScrollViewActivity.this,
                                FillGap3ScrollViewActivity.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(ObservableScrollViewActivity.this,
                                FillGapListViewActivity.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(ObservableScrollViewActivity.this,
                                FillGapRecyclerViewActivity.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(ObservableScrollViewActivity.this,
                                FillGapScrollViewActivity.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(ObservableScrollViewActivity.this,
                                FlexibleSpaceToolbarScrollViewActivity.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(ObservableScrollViewActivity.this,
                                FlexibleSpaceWithImageScrollViewActivity.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(ObservableScrollViewActivity.this,
                                FlexibleSpaceWithImageRecyclerViewActivity.class);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(ObservableScrollViewActivity.this,
                                FlexibleSpaceWithImageWithViewPagerTab2Activity.class);
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(ObservableScrollViewActivity.this,
                                FlexibleSpaceWithImageListViewActivity.class);
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(ObservableScrollViewActivity.this,
                                FragmentActionBarControlListViewActivity.class);
                        startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21 = new Intent(ObservableScrollViewActivity.this,
                                FragmentTransitionActivity.class);
                        startActivity(intent21);
                        break;
                    case 22:
                        Intent intent22 = new Intent(ObservableScrollViewActivity.this,
                                HandleTouchGridViewActivity.class);
                        startActivity(intent22);
                        break;
                    case 23:
                        Intent intent23 = new Intent(ObservableScrollViewActivity.this,
                                HandleTouchListViewActivity.class);
                        startActivity(intent23);
                        break;
                    case 24:
                        Intent intent24 = new Intent(ObservableScrollViewActivity.this,
                                HandleTouchRecyclerViewActivity.class);
                        startActivity(intent24);
                        break;
                    case 25:
                        Intent intent25 = new Intent(ObservableScrollViewActivity.this,
                                HandleTouchScrollViewActivity.class);
                        startActivity(intent25);
                        break;
                    case 26:
                        Intent intent26 = new Intent(ObservableScrollViewActivity.this,
                                HandleTouchWebViewActivity.class);
                        startActivity(intent26);
                        break;
                    case 27:
                        Intent intent27 = new Intent(ObservableScrollViewActivity.this,
                                ParallaxToolbarListViewActivity.class);
                        startActivity(intent27);
                        break;
                    case 28:
                        Intent intent28 = new Intent(ObservableScrollViewActivity.this,
                                ParallaxToolbarScrollViewActivity.class);
                        startActivity(intent28);
                        break;
                    case 29:
                        Intent intent29 = new Intent(ObservableScrollViewActivity.this,
                                ScrollFromBottomListViewActivity.class);
                        startActivity(intent29);
                        break;
                    case 30:
                        Intent intent30 = new Intent(ObservableScrollViewActivity.this,
                                ScrollFromBottomRecyclerViewActivity.class);
                        startActivity(intent30);
                        break;
                    case 31:
                        Intent intent31 = new Intent(ObservableScrollViewActivity.this,
                                SlidingUpGridViewActivity.class);
                        startActivity(intent31);
                        break;
                    case 32:
                        Intent intent32 = new Intent(ObservableScrollViewActivity.this,
                                SlidingUpListViewActivity.class);
                        startActivity(intent32);
                        break;
                    case 33:
                        Intent intent33 = new Intent(ObservableScrollViewActivity.this,
                                SlidingUpRecyclerViewActivity.class);
                        startActivity(intent33);
                        break;
                    case 34:
                        Intent intent34 = new Intent(ObservableScrollViewActivity.this,
                                SlidingUpScrollViewActivity.class);
                        startActivity(intent34);
                        break;
                    case 35:
                        Intent intent35 = new Intent(ObservableScrollViewActivity.this,
                                SlidingUpWebViewActivity.class);
                        startActivity(intent35);
                        break;
                    case 36:
                        Intent intent36 = new Intent(ObservableScrollViewActivity.this,
                                StickyHeaderListViewActivity.class);
                        startActivity(intent36);
                        break;
                    case 37:
                        Intent intent37 = new Intent(ObservableScrollViewActivity.this,
                                StickyHeaderRecyclerViewActivity.class);
                        startActivity(intent37);
                        break;
                    case 38:
                        Intent intent38 = new Intent(ObservableScrollViewActivity.this,
                                StickyHeaderScrollViewActivity.class);
                        startActivity(intent38);
                        break;
                    case 39:
                        Intent intent39 = new Intent(ObservableScrollViewActivity.this,
                                StickyHeaderWebViewActivity.class);
                        startActivity(intent39);
                        break;
                    case 40:
                        Intent intent40 = new Intent(ObservableScrollViewActivity.this,
                                ToolbarControlGridViewActivity.class);
                        startActivity(intent40);
                    case 41:
                        Intent intent41 = new Intent(ObservableScrollViewActivity.this,
                                ToolbarControlListViewActivity.class);
                        startActivity(intent41);
                        break;
                    case 42:
                        Intent intent42 = new Intent(ObservableScrollViewActivity.this,
                                ToolbarControlRecyclerViewActivity.class);
                        startActivity(intent42);
                        break;
                    case 43:
                        Intent intent43 = new Intent(ObservableScrollViewActivity.this,
                                ToolbarControlScrollViewActivity.class);
                        startActivity(intent43);
                        break;
                    case 44:
                        Intent intent44 = new Intent(ObservableScrollViewActivity.this,
                                ToolbarControlWebViewActivity.class);
                        startActivity(intent44);
                        break;
                    case 45:
                        Intent intent45 = new Intent(ObservableScrollViewActivity.this,
                                ViewPagerTab2Activity.class);
                        startActivity(intent45);
                        break;
                    case 46:
                        Intent intent46 = new Intent(ObservableScrollViewActivity.this,
                                ViewPagerTabActivity.class);
                        startActivity(intent46);
                        break;
                    case 47:
                        Intent intent47 = new Intent(ObservableScrollViewActivity.this,
                                ViewPagerTabFragmentActivity.class);
                        startActivity(intent47);
                        break;
                    case 48:
                        Intent intent48 = new Intent(ObservableScrollViewActivity.this,
                                ViewPagerTabListViewActivity.class);
                        startActivity(intent48);
                        break;
                    case 49:
                        Intent intent49 = new Intent(ObservableScrollViewActivity.this,
                                ViewPagerTabScrollViewActivity.class);
                        startActivity(intent49);
                        break;
                    default:
                        Toast.makeText(ObservableScrollViewActivity.this, "He He", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
