package com.example.emcleod.cs407_android_hw1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by emcleod on 2/18/16.
 */
public class WinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        final Button replay_button = (Button) findViewById(R.id.replay_button);
        replay_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                replayPressed(replay_button);
            }
        });

        final Button quit_button = (Button) findViewById(R.id.quit_button);
        quit_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                quitPressed(quit_button);
            }
        });
    }

    public void replayPressed(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void quitPressed(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
