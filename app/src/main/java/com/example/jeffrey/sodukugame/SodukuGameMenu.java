package com.example.jeffrey.sodukugame;

        import android.app.Activity;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.os.SystemClock;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Chronometer;

        import static android.R.id.button1;
        import static android.os.Build.VERSION_CODES.M;

/**
 * Created by jeffrey on 1/4/2017.
 */

public class SodukuGameMenu extends Activity {
    Button easyButton;
    Button mediumButton;
    Button hardButton;
    Button homeButton;
    Button soundButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sodukugamemenu);
        easyButton = (Button) findViewById(R.id.easy_button);
        mediumButton = (Button) findViewById(R.id.medium_button);
        hardButton = (Button) findViewById(R.id.hard_button);
        homeButton = (Button) findViewById(R.id.home);
        soundButton = (Button) findViewById(R.id.mutebutton);



        easyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent1 = new Intent(SodukuGameMenu.this,EasySoduku.class);
                startActivity(intent1);

            }


        }) ;
        mediumButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent2 = new Intent(SodukuGameMenu.this,MediumSoduku.class);
                startActivity(intent2);
            }

        }) ;
        hardButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent3 = new Intent(SodukuGameMenu.this,HardSoduku.class);
                startActivity(intent3);
            }

        }) ;
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                MainActivity.controlSound();
                Intent intent4 = new Intent(SodukuGameMenu.this,MainActivity.class);

                startActivity(intent4);

            }


        }) ;
        soundButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                MainActivity.controlSound();
            }


        }) ;




    }

}
