package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Getting the intent
        Intent intent = getIntent();

        //Getting values form the attached bundle
        Bundle extras = intent.getExtras();

        //Extracting the stored data
        String worker_name = extras.getString("WORKER_NAME");
        Integer worker_age = extras.getInt("WORKER_AGE");
        Boolean worker_working = extras.getBoolean("WORKER_WORKING");

        TextView textViewTop = (TextView) findViewById(R.id.textViewTop);
        TextView textViewMid = (TextView) findViewById(R.id.textViewMid);
        Switch switch1 = (Switch) findViewById(R.id.switch1);

        textViewTop.setText("Worker Name: " + worker_name);
        textViewMid.setText("Worker Age: " + worker_age); // ("" + ...) for numbers
        switch1.setChecked(worker_working);

    }

}