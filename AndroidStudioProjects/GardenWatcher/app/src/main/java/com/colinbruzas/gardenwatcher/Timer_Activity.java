package com.colinbruzas.gardenwatcher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Timer_Activity extends AppCompatActivity {
    private long startTime = System.currentTimeMillis();


    protected void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_timer_);

        startTime = System.currentTimeMillis();
        long elapsedTime = System.currentTimeMillis() - startTime;
        long elapsedSeconds = elapsedTime / 1000;
        long secondsDisplay = elapsedSeconds % 60;
        long elapsedMinutes = elapsedSeconds / 60;


        Button totalWater = (Button) findViewById(R.id.WaterAll);
        totalWater.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Button b = (Button) findViewById(R.id.WaterAll);
               b.setBackground(getDrawable(R.color.lightPurple));
            }
        });

        Button outDoorWater = (Button) findViewById(R.id.OutdoorPlant);
        outDoorWater.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button b = (Button) findViewById(R.id.OutdoorPlant);
                b.setBackground(getDrawable(R.color.lightPurple));
            }
        });

        Button inDoorWater = (Button) findViewById(R.id.indoorPlant);
        inDoorWater.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button b = (Button) findViewById(R.id.indoorPlant);
                b.setBackground(getDrawable(R.color.lightPurple));
            }
        });

    }
    }

   /* private void displayWatered ()
    {

    }*/



