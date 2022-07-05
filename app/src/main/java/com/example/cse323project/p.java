package com.example.cse323project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p extends AppCompatActivity {

    Button pnp, pp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p);

        pnp = (Button) findViewById(R.id.p_np);
        pp = (Button) findViewById(R.id.p_p);

        pnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(p.this, pnp.class);
                startActivity(intent);
            }
        });

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(p.this, pp.class);
                startActivity(intent);
            }
        });
    }
}