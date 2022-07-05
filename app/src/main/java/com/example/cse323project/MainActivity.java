package com.example.cse323project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button fcfs,sjf,p,rr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fcfs = (Button) findViewById(R.id.fcfs);
        sjf = (Button) findViewById(R.id.sjf);
        p = (Button) findViewById(R.id.p);
        rr = (Button) findViewById(R.id.rr);

        fcfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, fcfs.class);
                startActivity(intent);
            }
        });

        sjf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, sjf.class);
                startActivity(intent);
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, p.class);
                startActivity(intent);
            }
        });

        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, rr.class);
                startActivity(intent);
            }
        });
    }
}