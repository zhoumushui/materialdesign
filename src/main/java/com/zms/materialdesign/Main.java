package com.zms.materialdesign;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.zms.materialdesign.observablescrollview.activity.MainActivity;


public class Main extends ActionBarActivity {
    private Button btnFloatButton;
    private Button btnObservableScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnFloatButton = (Button) findViewById(R.id.btnFloatButton);
        btnFloatButton.setOnClickListener(new MyOnClickListener());

        btnObservableScrollView = (Button) findViewById(R.id.btnObservableScrollView);
        btnObservableScrollView.setOnClickListener(new MyOnClickListener());
    }

    class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v == btnFloatButton) {
                Intent intent = new Intent(Main.this, FloatingButtonActivity.class);
                startActivity(intent);
            } else if (v == btnObservableScrollView) {
                Intent intent = new Intent(Main.this,
                        ObservableScrollViewActivity.class);
                startActivity(intent);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
