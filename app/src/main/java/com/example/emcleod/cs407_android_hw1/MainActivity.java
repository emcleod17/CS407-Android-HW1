package com.example.emcleod.cs407_android_hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button start_button = (Button) findViewById(R.id.start_button);
        start_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playPressed(start_button);
            }
        });
    }

    public void playPressed(View view) {
        //TODO: Put to start game play activity
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}
