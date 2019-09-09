package com.linmu.souldialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.adorkable.iosdialog.AlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog(MainActivity.this).init()
                .setMsg("你现在无法接收到新消息提醒。请到系统-设置-通知中开启消息提醒")
                .setNegativeButton("确定", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .show();

    }
}
