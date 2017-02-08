package com.example.jeffrey.sodukugame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

/**
 * Created by jeffrey on 2/3/2017.
 */

public class PausePopThree extends Activity {
    Button tryButton,diffButton, exitButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause_pop);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        tryButton = (Button) findViewById(R.id.newpuzzle);
        tryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent tryIntent = new Intent(PausePopThree.this,HardSoduku.class);
                startActivity(tryIntent);
            }

        }) ;
        diffButton = (Button) findViewById(R.id.back_button);
        diffButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent diffIntent = new Intent(PausePopThree.this,SodukuGameMenu.class);
                startActivity(diffIntent);
            }

        }) ;

        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        getWindow().setLayout((int) (width * 0.53), (int) (height * 0.35));

        exitButton = (Button) findViewById(R.id.pause_exit);
        exitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                HardSoduku.time.start();
                finish();
            }

        }) ;
    }



}
