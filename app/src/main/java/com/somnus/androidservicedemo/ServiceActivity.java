package com.somnus.androidservicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ServiceActivity extends AppCompatActivity {

    private final String TAG = getClass().getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_start_service, R.id.btn_stop_service})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start_service:
                Log.i(TAG, "onClick: starting service");
                startService(new Intent(this, MyService.class));
                break;
            case R.id.btn_stop_service:
                Log.i(TAG, "onClick: starting service");
                stopService(new Intent(this, MyService.class));
                break;
        }
    }
}
