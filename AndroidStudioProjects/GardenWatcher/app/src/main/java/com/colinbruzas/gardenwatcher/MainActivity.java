package com.colinbruzas.gardenwatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView timer = (TextView)findViewById(R.id.toGarden);

        timer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this, Timer_Activity.class);
                startActivity(numbersIntent);
            }
        });
    }

    public void openNumbersList(View view){
        Intent i = new Intent(this, Timer_Activity.class);
        startActivity(i);
    }

    }
