package ru.startandroid.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout layout= findViewById(R.id.layout);
        final Button red = findViewById(R.id.red);
        final Button orange = findViewById(R.id.orange);
        final Button yellow = findViewById(R.id.yellow);
        final Button green = findViewById(R.id.green);
        final Button blue = findViewById(R.id.blue);
        final Button indigo = findViewById(R.id.indigo);
        final Button violet = findViewById(R.id.violet);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.red);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.yellow);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.green);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.blue);
            }
        });
        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.indigo);
            }
        });
        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.violet);
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(R.id.orange);
            }
        });
    }



}
