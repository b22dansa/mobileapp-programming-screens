package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonToSecondActivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }
        });
    }

    private void openSecondActivity() {

        //Bundle object is created
        Bundle extras = new Bundle();

        //Values to bundle
        extras.putString("WORKER_NAME","Daniel");
        extras.putInt("WORKER_AGE", 22);
        extras.putBoolean("WORKER_WORKING", true);

        //Intent is created and initialized
        Intent intent = new Intent(this, SecondActivity.class);

        //Bundle is attached to the Intent object
        intent.putExtras(extras);

        //Starting the activity
        startActivity(intent);



    }
}