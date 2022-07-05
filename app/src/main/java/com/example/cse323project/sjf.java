package com.example.cse323project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sjf extends AppCompatActivity {

    Button sjfnp, sjfp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjf);

        sjfnp = (Button) findViewById(R.id.sjf_np);
        sjfp = (Button) findViewById(R.id.sjf_p);

        sjfnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sjf.this, sjfnp.class);
                startActivity(intent);
            }
        });

        sjfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sjf.this, sjfp.class);
                startActivity(intent);
            }
        });



    }
}