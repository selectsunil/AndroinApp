package com.androin.androinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        getSupportActionBar().hide();

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Home.this,Home2.class);
                startActivity(i);
                finish();
            }
        },2000);

    }
}
