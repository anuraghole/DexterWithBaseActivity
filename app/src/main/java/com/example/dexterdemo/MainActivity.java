package com.example.dexterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }
}
