package com.jesusalvizo.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button cake = (Button) findViewById(R.id.cake);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(intent);
            }
        });

        Button muffins = (Button) findViewById(R.id.muffins);
        muffins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main6Activity.class);
                startActivity(intent);
            }
        });

        Button brownies = (Button) findViewById(R.id.brownies);
        brownies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main7Activity.class);
                startActivity(intent);
            }
        });

        Button pie = (Button) findViewById(R.id.pie);
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main8Activity.class);
                startActivity(intent);
            }
        });
    }
}