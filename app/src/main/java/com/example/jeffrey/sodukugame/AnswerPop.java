package com.example.jeffrey.sodukugame;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by jeffrey on 1/5/2017.
 */

public class AnswerPop extends Activity {

    Random rand = new Random();
    TextView answerText;
    int messageNumber;
    MediaPlayer wrongSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_pop);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        getWindow().setLayout((int)(width*0.4),(int)(height*0.2));
        wrongSound = MediaPlayer.create(this, R.raw.wronganswer);
        wrongSound.start();
        messageNumber = rand.nextInt(3);
        switch (messageNumber){
            case 0:
                answerText = (TextView) findViewById(R.id.textView2);
                answerText.setText("It's Easy");
                break;
            case 1:
                answerText = (TextView) findViewById(R.id.textView2);
                answerText.setText("Use Common Sense!");
                break;
            case 2:
                answerText = (TextView) findViewById(R.id.textView2);
                answerText.setText("Wrong");
                break;

        }
    }
}
