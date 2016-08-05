package com.hss01248.bar;

import android.app.Activity;
import android.os.Bundle;

import com.hss01248.titlebarlib.Titlebar;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Titlebar titlebar = (Titlebar) findViewById(R.id.titlebar);
        titlebar.init(this);
    }
}
