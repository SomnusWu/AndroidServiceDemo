package com.somnus.androidservicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.somnus.androidservicedemo.service.LongRunningService;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        /**
         * 后台定时任务
         */
        Intent intent = new Intent(this, LongRunningService.class);
        startService(intent);

    }


    @OnClick(R.id.btn_service)
    public void onClick() {
        startActivity(new Intent(MainActivity.this, ServiceActivity.class));
    }
}
