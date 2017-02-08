package com.example.jeffrey.sodukugame;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jeffrey on 1/8/2017.
 */

public class WinPopTwo extends Activity {
    Button tryButton;
    Button diffButton;
    TextView playerTime;
    MediaPlayer rightSound;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win_pop);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        rightSound = MediaPlayer.create(this, R.raw.rightanswer);
        rightSound.start();
        tryButton = (Button) findViewById(R.id.try_button);
        tryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent tryIntent = new Intent(WinPopTwo.this,MediumSoduku.class);
                startActivity(tryIntent);
            }

        }) ;
        diffButton = (Button) findViewById(R.id.diff_button);
        diffButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent diffIntent = new Intent(WinPopTwo.this,SodukuGameMenu.class);
                startActivity(diffIntent);
            }

        }) ;
        playerTime = (TextView) findViewById(R.id.player_time);
        playerTime.setText(MediumSoduku.time.getText());
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        getWindow().setLayout((int) (width * 0.9), (int) (height * 0.5));
    }
}
