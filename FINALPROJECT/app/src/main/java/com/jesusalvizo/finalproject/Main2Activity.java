package com.jesusalvizo.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button defined = (Button) findViewById(R.id.definedBtn);
        defined.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

        Button timer = (Button) findViewById(R.id.timerBtn);
        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });

        Button receipts = (Button) findViewById(R.id.moreBtn);
        receipts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main9Activity.class);
                startActivity(intent);
            }
        });

        Button us = (Button) findViewById(R.id.usBtn);
        us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main10Activity.class);
                startActivity(intent);
            }
        });
    }
}