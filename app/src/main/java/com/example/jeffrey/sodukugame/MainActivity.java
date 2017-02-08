package com.example.jeffrey.sodukugame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;

import static android.R.attr.button;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {
Button Button;
    static MediaPlayer mysound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mysound = MediaPlayer.create(this, R.raw.sudokusound);
        mysound.start();
        mysound.setLooping(true);
        Button = (Button) findViewById(R.id.startButton);
        Button muteSound = (Button) findViewById(R.id.button3);
        Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SodukuGameMenu.class);
                startActivity(intent);
            }

        });
        muteSound.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                controlSound();

                }
            }

        );
    }
    public static void controlSound() {
        if (mysound.isPlaying() == true) {
            mysound.pause();

        } else {
            mysound.start();

        }


    }

    }

