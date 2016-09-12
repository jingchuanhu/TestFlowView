package com.sohu.jch.testflowview;

import android.app.Notification;
import android.content.Intent;
import android.content.ServiceConnection;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void startFlow(View view){

// TODO Auto-generated method stub
        Intent intent = new Intent(MainActivity.this, FlowViewService.class);
        //启动FxService
        startService(intent);
        finish();

    }


    public void offFlow(View view){

        //uninstallApp("com.phicomm.hu");
        Intent intent = new Intent(MainActivity.this, FlowViewService.class);
        //终止FxService
        stopService(intent);

    }

}
