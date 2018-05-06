package com.androin.androinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv= (TextView) findViewById(R.id.tv);
    }
    public void next(View v){
        Intent i=new Intent(Home.this,Next.class);
        startActivity(i);
    }
}
