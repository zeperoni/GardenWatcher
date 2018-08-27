package com.colinbruzas.myapplicationsandbox;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.button;
import static com.colinbruzas.myapplicationsandbox.R.id.buttonplay;

public class MainActivity extends AppCompatActivity {

    EditText mainEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.buttonplay);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "It's magic", Toast.LENGTH_SHORT).show();
            }
        });


        mainEditText = (EditText) findViewById(R.id.main_edittext);






    }
}




