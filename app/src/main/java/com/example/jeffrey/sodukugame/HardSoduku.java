package com.example.jeffrey.sodukugame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static android.os.Build.VERSION_CODES.N;
import static com.example.jeffrey.sodukugame.R.id.number_1;
import static com.example.jeffrey.sodukugame.R.id.number_2;
import static com.example.jeffrey.sodukugame.R.id.number_3;
import static com.example.jeffrey.sodukugame.R.id.number_4;
import static com.example.jeffrey.sodukugame.R.id.number_5;
import static com.example.jeffrey.sodukugame.R.id.number_6;
import static com.example.jeffrey.sodukugame.R.id.number_7;
import static com.example.jeffrey.sodukugame.R.id.number_8;
import static com.example.jeffrey.sodukugame.R.id.number_9;
import static com.example.jeffrey.sodukugame.SudokuButton.getNewNumber;

/**
 * Created by jeffrey on 1/4/2017.
 */

public class HardSoduku extends Activity {
    SudokuButton button1 = new SudokuButton();
    SudokuButton button2 = new SudokuButton();
    SudokuButton button3 = new SudokuButton();
    SudokuButton button4 = new SudokuButton();
    SudokuButton button5 = new SudokuButton();
    SudokuButton button6 = new SudokuButton();
    SudokuButton button7 = new SudokuButton();
    SudokuButton button8 = new SudokuButton();
    SudokuButton button9 = new SudokuButton();
    SudokuButton button10 = new SudokuButton();
    SudokuButton button11 = new SudokuButton();
    SudokuButton button12 = new SudokuButton();
    SudokuButton button13 = new SudokuButton();
    SudokuButton button14 = new SudokuButton();
    SudokuButton button15 = new SudokuButton();
    SudokuButton button16 = new SudokuButton();
    SudokuButton button17 = new SudokuButton();
    SudokuButton button18 = new SudokuButton();
    SudokuButton button19 = new SudokuButton();
    SudokuButton button20 = new SudokuButton();
    SudokuButton button21 = new SudokuButton();
    SudokuButton button22 = new SudokuButton();
    SudokuButton button23 = new SudokuButton();
    SudokuButton button24 = new SudokuButton();
    SudokuButton button25 = new SudokuButton();
    SudokuButton button26 = new SudokuButton();
    SudokuButton button27 = new SudokuButton();
    SudokuButton button28 = new SudokuButton();
    SudokuButton button29 = new SudokuButton();
    SudokuButton button30 = new SudokuButton();
    SudokuButton button31 = new SudokuButton();
    SudokuButton button32 = new SudokuButton();
    SudokuButton button33 = new SudokuButton();
    SudokuButton button34 = new SudokuButton();
    SudokuButton button35 = new SudokuButton();
    SudokuButton button36 = new SudokuButton();
    SudokuButton button37 = new SudokuButton();
    SudokuButton button38 = new SudokuButton();
    SudokuButton button39 = new SudokuButton();
    SudokuButton button40 = new SudokuButton();
    SudokuButton button41 = new SudokuButton();
    SudokuButton button42 = new SudokuButton();
    SudokuButton button43 = new SudokuButton();
    SudokuButton button44 = new SudokuButton();
    SudokuButton button45 = new SudokuButton();
    SudokuButton button46 = new SudokuButton();
    SudokuButton button47 = new SudokuButton();
    SudokuButton button48 = new SudokuButton();
    SudokuButton button49 = new SudokuButton();
    SudokuButton button50 = new SudokuButton();
    SudokuButton button51 = new SudokuButton();
    SudokuButton button52 = new SudokuButton();
    SudokuButton button53 = new SudokuButton();
    SudokuButton button54 = new SudokuButton();
    SudokuButton button55 = new SudokuButton();
    SudokuButton button56 = new SudokuButton();
    SudokuButton button57 = new SudokuButton();
    SudokuButton button58 = new SudokuButton();
    SudokuButton button59 = new SudokuButton();
    SudokuButton button60 = new SudokuButton();
    SudokuButton button61 = new SudokuButton();
    SudokuButton button62 = new SudokuButton();
    SudokuButton button63 = new SudokuButton();
    SudokuButton button64 = new SudokuButton();
    SudokuButton button65 = new SudokuButton();
    SudokuButton button66 = new SudokuButton();
    SudokuButton button67 = new SudokuButton();
    SudokuButton button68 = new SudokuButton();
    SudokuButton button69 = new SudokuButton();
    SudokuButton button70 = new SudokuButton();
    SudokuButton button71 = new SudokuButton();
    SudokuButton button72 = new SudokuButton();
    SudokuButton button73 = new SudokuButton();
    SudokuButton button74 = new SudokuButton();
    SudokuButton button75 = new SudokuButton();
    SudokuButton button76 = new SudokuButton();
    SudokuButton button77 = new SudokuButton();
    SudokuButton button78 = new SudokuButton();
    SudokuButton button79 = new SudokuButton();
    SudokuButton button80 = new SudokuButton();
    SudokuButton button81 = new SudokuButton();


    ArrayList<Integer> numArray = new ArrayList<>();
    Button pauseButton;
    Button soundButton;
    static Chronometer time;
    Random rand = new Random();
    int randomNumOne = 0;
    int randomNumTwo = 0;



    int[][] sodukuArray = SudokuBoard.generateBoard()
            ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sodukulayout);
        createGame();
        time = (Chronometer) findViewById(R.id.chronometer3);
        pauseButton = (Button) findViewById(R.id.pause);
        soundButton = (Button) findViewById(R.id.mutebuttontwo);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                time.stop();
                startActivity(new Intent(HardSoduku.this,PausePopThree.class));
            }

        }) ;
        soundButton.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                MainActivity.controlSound();
            }


        }) ;

        time.setBase(SystemClock.elapsedRealtime());
        time.start();

        time.setText(time.getFormat());


    }




    public void createGame(){
        for (int a = 0; a < 9; a++){
            for (int b = 0; b < 9; b++){
                numArray.add(sodukuArray[a][b]);
            }


        }
        randomNumOne = rand.nextInt(63) + 58;
        for (int c = 0; c <= randomNumOne; c++){
            randomNumTwo = rand.nextInt(81);
            numArray.set(randomNumTwo,0);
        }
        for (int c = 0; c < 81; c++) {
            switch (c) {
                case 0:
                    button1.setNumber(numArray.get(c));
                    display_1(button1.getNumber());
                    if(numArray.get(c) != 0) {
                        button1.isLock();
                        display_1(button1.getNumber());
                    }
                    break;

                case 1:
                    button2.setNumber(numArray.get(c));
                    display_2(button2.getNumber());
                    if(numArray.get(c) != 0) {
                        button2.isLock();
                        display_2(button2.getNumber());
                    }
                    break;

                case 2:
                    button3.setNumber(numArray.get(c));
                    display_3(button3.getNumber());
                    if(numArray.get(c) != 0) {
                        button3.isLock();
                        display_3(button3.getNumber());
                    }
                    break;

                case 3:
                    button4.setNumber(numArray.get(c));
                    display_4(button4.getNumber());
                    if(numArray.get(c) != 0) {
                        button4.isLock();
                        display_4(button4.getNumber());
                    }
                    break;

                case 4:
                    button5.setNumber(numArray.get(c));
                    display_5(button5.getNumber());
                    if(numArray.get(c) != 0) {
                        button5.isLock();
                        display_5(button5.getNumber());
                    }
                    break;

                case 5:
                    button6.setNumber(numArray.get(c));
                    display_6(button6.getNumber());
                    if(numArray.get(c) != 0) {
                        button6.isLock();
                        display_6(button6.getNumber());
                    }
                    break;

                case 6:
                    button7.setNumber(numArray.get(c));
                    display_7(button7.getNumber());
                    if(numArray.get(c) != 0) {
                        button7.isLock();
                        display_7(button7.getNumber());
                    }
                    break;

                case 7:
                    button8.setNumber(numArray.get(c));
                    display_8(button8.getNumber());
                    if(numArray.get(c) != 0) {
                        button8.isLock();
                        display_8(button8.getNumber());
                    }
                    break;

                case 8:
                    button9.setNumber(numArray.get(c));
                    display_9(button9.getNumber());
                    if(numArray.get(c) != 0) {
                        button9.isLock();
                        display_9(button9.getNumber());
                    }
                    break;

                case 9:
                    button10.setNumber(numArray.get(c));
                    display_10(button10.getNumber());
                    if(numArray.get(c) != 0) {
                        button10.isLock();
                        display_10(button10.getNumber());
                    }
                    break;

                case 10:
                    button11.setNumber(numArray.get(c));
                    display_11(button11.getNumber());
                    if(numArray.get(c) != 0) {
                        button11.isLock();
                        display_11(button11.getNumber());
                    }
                    break;

                case 11:
                    button12.setNumber(numArray.get(c));
                    display_12(button12.getNumber());
                    if(numArray.get(c) != 0) {
                        button12.isLock();
                        display_12(button12.getNumber());
                    }
                    break;

                case 12:
                    button13.setNumber(numArray.get(c));
                    display_13(button13.getNumber());
                    if(numArray.get(c) != 0) {
                        button13.isLock();
                        display_13(button13.getNumber());
                    }
                    break;

                case 13:
                    button14.setNumber(numArray.get(c));
                    display_14(button14.getNumber());
                    if(numArray.get(c) != 0) {
                        button14.isLock();
                        display_14(button14.getNumber());
                    }
                    break;

                case 14:
                    button15.setNumber(numArray.get(c));
                    display_15(button15.getNumber());
                    if(numArray.get(c) != 0) {
                        button15.isLock();
                        display_15(button15.getNumber());
                    }
                    break;

                case 15:
                    button16.setNumber(numArray.get(c));
                    display_16(button16.getNumber());
                    if(numArray.get(c) != 0) {
                        button16.isLock();
                        display_16(button16.getNumber());
                    }
                    break;

                case 16:
                    button17.setNumber(numArray.get(c));
                    display_17(button17.getNumber());
                    if(numArray.get(c) != 0) {
                        button17.isLock();
                        display_17(button17.getNumber());
                    }
                    break;

                case 17:
                    button18.setNumber(numArray.get(c));
                    display_18(button18.getNumber());
                    if(numArray.get(c) != 0) {
                        button18.isLock();
                        display_18(button18.getNumber());
                    }
                    break;

                case 18:
                    button19.setNumber(numArray.get(c));
                    display_19(button19.getNumber());
                    if(numArray.get(c) != 0) {
                        button19.isLock();
                        display_19(button19.getNumber());
                    }
                    break;

                case 19:
                    button20.setNumber(numArray.get(c));
                    display_20(button20.getNumber());
                    if(numArray.get(c) != 0) {
                        button20.isLock();
                        display_20(button20.getNumber());
                    }
                    break;

                case 20:
                    button21.setNumber(numArray.get(c));
                    display_21(button21.getNumber());
                    if(numArray.get(c) != 0) {
                        button21.isLock();
                        display_21(button21.getNumber());
                    }
                    break;

                case 21:
                    button22.setNumber(numArray.get(c));
                    display_22(button22.getNumber());
                    if(numArray.get(c) != 0) {
                        button22.isLock();
                        display_22(button22.getNumber());
                    }
                    break;

                case 22:
                    button23.setNumber(numArray.get(c));
                    display_23(button23.getNumber());
                    if(numArray.get(c) != 0) {
                        button23.isLock();
                        display_23(button23.getNumber());
                    }
                    break;

                case 23:
                    button24.setNumber(numArray.get(c));
                    display_24(button24.getNumber());
                    if(numArray.get(c) != 0) {
                        button24.isLock();
                        display_24(button24.getNumber());
                    }
                    break;

                case 24:
                    button25.setNumber(numArray.get(c));
                    display_25(button25.getNumber());
                    if(numArray.get(c) != 0) {
                        button25.isLock();
                        display_25(button25.getNumber());
                    }
                    break;

                case 25:
                    button26.setNumber(numArray.get(c));
                    display_26(button26.getNumber());
                    if(numArray.get(c) != 0) {
                        button26.isLock();
                        display_26(button26.getNumber());
                    }
                    break;

                case 26:
                    button27.setNumber(numArray.get(c));
                    display_27(button27.getNumber());
                    if(numArray.get(c) != 0) {
                        button27.isLock();
                        display_27(button27.getNumber());
                    }
                    break;

                case 27:
                    button28.setNumber(numArray.get(c));
                    display_28(button28.getNumber());
                    if(numArray.get(c) != 0) {
                        button28.isLock();
                        display_28(button28.getNumber());
                    }
                    break;

                case 28:
                    button29.setNumber(numArray.get(c));
                    display_29(button29.getNumber());
                    if(numArray.get(c) != 0) {
                        button29.isLock();
                        display_29(button29.getNumber());
                    }
                    break;

                case 29:
                    button30.setNumber(numArray.get(c));
                    display_30(button30.getNumber());
                    if(numArray.get(c) != 0) {
                        button30.isLock();
                        display_30(button30.getNumber());
                    }
                    break;

                case 30:
                    button31.setNumber(numArray.get(c));
                    display_31(button31.getNumber());
                    if(numArray.get(c) != 0) {
                        button31.isLock();
                        display_31(button31.getNumber());
                    }
                    break;

                case 31:
                    button32.setNumber(numArray.get(c));
                    display_32(button32.getNumber());
                    if(numArray.get(c) != 0) {
                        button32.isLock();
                        display_32(button32.getNumber());
                    }
                    break;

                case 32:
                    button33.setNumber(numArray.get(c));
                    display_33(button33.getNumber());
                    if(numArray.get(c) != 0) {
                        button33.isLock();
                        display_33(button33.getNumber());
                    }
                    break;

                case 33:
                    button34.setNumber(numArray.get(c));
                    display_34(button34.getNumber());
                    if(numArray.get(c) != 0) {
                        button34.isLock();
                        display_34(button34.getNumber());
                    }
                    break;

                case 34:
                    button35.setNumber(numArray.get(c));
                    display_35(button35.getNumber());
                    if(numArray.get(c) != 0) {
                        button35.isLock();
                        display_35(button35.getNumber());
                    }
                    break;

                case 35:
                    button36.setNumber(numArray.get(c));
                    display_36(button36.getNumber());
                    if(numArray.get(c) != 0) {
                        button36.isLock();
                        display_36(button36.getNumber());
                    }
                    break;

                case 36:
                    button37.setNumber(numArray.get(c));
                    display_37(button37.getNumber());
                    if(numArray.get(c) != 0) {
                        button37.isLock();
                        display_37(button37.getNumber());
                    }
                    break;

                case 37:
                    button38.setNumber(numArray.get(c));
                    display_38(button38.getNumber());
                    if(numArray.get(c) != 0) {
                        button38.isLock();
                        display_38(button38.getNumber());
                    }
                    break;

                case 38:
                    button39.setNumber(numArray.get(c));
                    display_39(button39.getNumber());
                    if(numArray.get(c) != 0) {
                        button39.isLock();
                        display_39(button39.getNumber());
                    }
                    break;

                case 39:
                    button40.setNumber(numArray.get(c));
                    display_40(button40.getNumber());
                    if(numArray.get(c) != 0) {
                        button40.isLock();
                        display_40(button40.getNumber());
                    }
                    break;

                case 40:
                    button41.setNumber(numArray.get(c));
                    display_41(button41.getNumber());
                    if(numArray.get(c) != 0) {
                        button41.isLock();
                        display_41(button41.getNumber());
                    }
                    break;

                case 41:
                    button42.setNumber(numArray.get(c));
                    display_42(button42.getNumber());
                    if(numArray.get(c) != 0) {
                        button42.isLock();
                        display_42(button42.getNumber());
                    }
                    break;

                case 42:
                    button43.setNumber(numArray.get(c));
                    display_43(button43.getNumber());
                    if(numArray.get(c) != 0) {
                        button43.isLock();
                        display_43(button43.getNumber());
                    }
                    break;

                case 43:
                    button44.setNumber(numArray.get(c));
                    display_44(button44.getNumber());
                    if(numArray.get(c) != 0) {
                        button44.isLock();
                        display_44(button44.getNumber());
                    }
                    break;

                case 44:
                    button45.setNumber(numArray.get(c));
                    display_45(button45.getNumber());
                    if(numArray.get(c) != 0) {
                        button45.isLock();
                        display_45(button45.getNumber());
                    }
                    break;

                case 45:
                    button46.setNumber(numArray.get(c));
                    display_46(button46.getNumber());
                    if(numArray.get(c) != 0) {
                        button46.isLock();
                        display_46(button46.getNumber());
                    }
                    break;

                case 46:
                    button47.setNumber(numArray.get(c));
                    display_47(button47.getNumber());
                    if(numArray.get(c) != 0) {
                        button47.isLock();
                        display_47(button47.getNumber());
                    }
                    break;

                case 47:
                    button48.setNumber(numArray.get(c));
                    display_48(button48.getNumber());
                    if(numArray.get(c) != 0) {
                        button48.isLock();
                        display_48(button48.getNumber());
                    }
                    break;

                case 48:
                    button49.setNumber(numArray.get(c));
                    display_49(button49.getNumber());
                    if(numArray.get(c) != 0) {
                        button49.isLock();
                        display_49(button49.getNumber());
                    }
                    break;

                case 49:
                    button50.setNumber(numArray.get(c));
                    display_50(button50.getNumber());
                    if(numArray.get(c) != 0) {
                        button50.isLock();
                        display_50(button50.getNumber());
                    }
                    break;

                case 50:
                    button51.setNumber(numArray.get(c));
                    display_51(button51.getNumber());
                    if(numArray.get(c) != 0) {
                        button51.isLock();
                        display_51(button51.getNumber());
                    }
                    break;

                case 51:
                    button52.setNumber(numArray.get(c));
                    display_52(button52.getNumber());
                    if(numArray.get(c) != 0) {
                        button52.isLock();
                        display_52(button52.getNumber());
                    }
                    break;

                case 52:
                    button53.setNumber(numArray.get(c));
                    display_53(button53.getNumber());
                    if(numArray.get(c) != 0) {
                        button53.isLock();
                        display_53(button53.getNumber());
                    }
                    break;

                case 53:
                    button54.setNumber(numArray.get(c));
                    display_54(button54.getNumber());
                    if(numArray.get(c) != 0) {
                        button54.isLock();
                        display_54(button54.getNumber());
                    }
                    break;

                case 54:
                    button55.setNumber(numArray.get(c));
                    display_55(button55.getNumber());
                    if(numArray.get(c) != 0) {
                        button55.isLock();
                        display_55(button55.getNumber());
                    }
                    break;

                case 55:
                    button56.setNumber(numArray.get(c));
                    display_56(button56.getNumber());
                    if(numArray.get(c) != 0) {
                        button56.isLock();
                        display_56(button56.getNumber());
                    }
                    break;

                case 56:
                    button57.setNumber(numArray.get(c));
                    display_57(button57.getNumber());
                    if(numArray.get(c) != 0) {
                        button57.isLock();
                        display_57(button57.getNumber());
                    }
                    break;

                case 57:
                    button58.setNumber(numArray.get(c));
                    display_58(button58.getNumber());
                    if(numArray.get(c) != 0) {
                        button58.isLock();
                        display_58(button58.getNumber());
                    }
                    break;

                case 58:
                    button59.setNumber(numArray.get(c));
                    display_59(button59.getNumber());
                    if(numArray.get(c) != 0) {
                        button59.isLock();
                        display_59(button59.getNumber());
                    }
                    break;

                case 59:
                    button60.setNumber(numArray.get(c));
                    display_60(button60.getNumber());
                    if(numArray.get(c) != 0) {
                        button60.isLock();
                        display_60(button60.getNumber());
                    }
                    break;

                case 60:
                    button61.setNumber(numArray.get(c));
                    display_61(button61.getNumber());
                    if(numArray.get(c) != 0) {
                        button61.isLock();
                        display_61(button61.getNumber());
                    }
                    break;

                case 61:
                    button62.setNumber(numArray.get(c));
                    display_62(button62.getNumber());
                    if(numArray.get(c) != 0) {
                        button62.isLock();
                        display_62(button62.getNumber());
                    }
                    break;

                case 62:
                    button63.setNumber(numArray.get(c));
                    display_63(button63.getNumber());
                    if(numArray.get(c) != 0) {
                        button63.isLock();
                        display_63(button63.getNumber());
                    }
                    break;

                case 63:
                    button64.setNumber(numArray.get(c));
                    display_64(button64.getNumber());
                    if(numArray.get(c) != 0) {
                        button64.isLock();
                        display_64(button64.getNumber());
                    }
                    break;

                case 64:
                    button65.setNumber(numArray.get(c));
                    display_65(button65.getNumber());
                    if(numArray.get(c) != 0) {
                        button65.isLock();
                        display_65(button65.getNumber());
                    }
                    break;

                case 65:
                    button66.setNumber(numArray.get(c));
                    display_66(button66.getNumber());
                    if(numArray.get(c) != 0) {
                        button66.isLock();
                        display_66(button66.getNumber());
                    }
                    break;

                case 66:
                    button67.setNumber(numArray.get(c));
                    display_67(button67.getNumber());
                    if(numArray.get(c) != 0) {
                        button67.isLock();
                        display_67(button67.getNumber());
                    }
                    break;

                case 67:
                    button68.setNumber(numArray.get(c));
                    display_68(button68.getNumber());
                    if(numArray.get(c) != 0) {
                        button68.isLock();
                        display_68(button68.getNumber());
                    }
                    break;

                case 68:
                    button69.setNumber(numArray.get(c));
                    display_69(button69.getNumber());
                    if(numArray.get(c) != 0) {
                        button69.isLock();
                        display_69(button69.getNumber());
                    }
                    break;

                case 69:
                    button70.setNumber(numArray.get(c));
                    display_70(button70.getNumber());
                    if(numArray.get(c) != 0) {
                        button70.isLock();
                        display_70(button70.getNumber());
                    }
                    break;

                case 70:
                    button71.setNumber(numArray.get(c));
                    display_71(button71.getNumber());
                    if(numArray.get(c) != 0) {
                        button71.isLock();
                        display_71(button71.getNumber());
                    }
                    break;

                case 71:
                    button72.setNumber(numArray.get(c));
                    display_72(button72.getNumber());
                    if(numArray.get(c) != 0) {
                        button72.isLock();
                        display_72(button72.getNumber());
                    }
                    break;

                case 72:
                    button73.setNumber(numArray.get(c));
                    display_73(button73.getNumber());
                    if(numArray.get(c) != 0) {
                        button73.isLock();
                        display_73(button73.getNumber());
                    }
                    break;

                case 73:
                    button74.setNumber(numArray.get(c));
                    display_74(button74.getNumber());
                    if(numArray.get(c) != 0) {
                        button74.isLock();
                        display_74(button74.getNumber());
                    }
                    break;

                case 74:
                    button75.setNumber(numArray.get(c));
                    display_75(button75.getNumber());
                    if(numArray.get(c) != 0) {
                        button75.isLock();
                        display_75(button75.getNumber());
                    }
                    break;

                case 75:
                    button76.setNumber(numArray.get(c));
                    display_76(button76.getNumber());
                    if(numArray.get(c) != 0) {
                        button76.isLock();
                        display_76(button76.getNumber());
                    }
                    break;

                case 76:
                    button77.setNumber(numArray.get(c));
                    display_77(button77.getNumber());
                    if(numArray.get(c) != 0) {
                        button77.isLock();
                        display_77(button77.getNumber());
                    }
                    break;

                case 77:
                    button78.setNumber(numArray.get(c));
                    display_78(button78.getNumber());
                    if(numArray.get(c) != 0) {
                        button78.isLock();
                        display_78(button78.getNumber());
                    }
                    break;

                case 78:
                    button79.setNumber(numArray.get(c));
                    display_79(button79.getNumber());
                    if(numArray.get(c) != 0) {
                        button79.isLock();
                        display_79(button79.getNumber());
                    }
                    break;

                case 79:
                    button80.setNumber(numArray.get(c));
                    display_80(button80.getNumber());
                    if(numArray.get(c) != 0) {
                        button80.isLock();
                        display_80(button80.getNumber());
                    }
                    break;

                case 80:
                    button81.setNumber(numArray.get(c));
                    display_81(button81.getNumber());
                    if(numArray.get(c) != 0) {
                        button81.isLock();
                        display_81(button81.getNumber());
                    }
                    break;





            }
        }
    }

    public void setNumber1(View view){
        if((button1.getLock()) == false){
            button1.setNumber(getNewNumber());
            display_1(button1.getNewNumber());}
        else{display_1(button1.getNumber());}
    }

    public void setNumber2(View view){
        if((button2.getLock()) == false){
            button2.setNumber(getNewNumber());
            display_2(button2.getNewNumber());}
        else{display_2(button2.getNumber());}
    }

    public void setNumber3(View view){
        if((button3.getLock()) == false){
            button3.setNumber(getNewNumber());
            display_3(button3.getNewNumber());}
        else{display_3(button3.getNumber());}
    }

    public void setNumber4(View view){
        if((button4.getLock()) == false){
            button4.setNumber(getNewNumber());
            display_4(button4.getNewNumber());}
        else{display_4(button4.getNumber());}
    }

    public void setNumber5(View view){
        if((button5.getLock()) == false){
            button5.setNumber(getNewNumber());
            display_5(button5.getNewNumber());}
        else{display_5(button5.getNumber());}
    }

    public void setNumber6(View view){
        if((button6.getLock()) == false){
            button6.setNumber(getNewNumber());
            display_6(button6.getNewNumber());}
        else{display_6(button6.getNumber());}
    }

    public void setNumber7(View view){
        if((button7.getLock()) == false){
            button7.setNumber(getNewNumber());
            display_7(button7.getNewNumber());}
        else{display_7(button7.getNumber());}
    }

    public void setNumber8(View view){
        if((button8.getLock()) == false){
            button8.setNumber(getNewNumber());
            display_8(button8.getNewNumber());}
        else{display_8(button8.getNumber());}
    }

    public void setNumber9(View view){
        if((button9.getLock()) == false){
            button9.setNumber(getNewNumber());
            display_9(button9.getNewNumber());}
        else{display_9(button9.getNumber());}
    }

    public void setNumber10(View view){
        if((button10.getLock()) == false){
            button10.setNumber(getNewNumber());
            display_10(button10.getNewNumber());}
        else{display_10(button10.getNumber());}
    }

    public void setNumber11(View view){
        if((button11.getLock()) == false){
            button11.setNumber(getNewNumber());
            display_11(button11.getNewNumber());}
        else{display_11(button11.getNumber());}
    }

    public void setNumber12(View view){
        if((button12.getLock()) == false){
            button12.setNumber(getNewNumber());
            display_12(button12.getNewNumber());}
        else{display_12(button12.getNumber());}
    }

    public void setNumber13(View view){
        if((button13.getLock()) == false){
            button13.setNumber(getNewNumber());
            display_13(button13.getNewNumber());}
        else{display_13(button13.getNumber());}
    }

    public void setNumber14(View view){
        if((button14.getLock()) == false){
            button14.setNumber(getNewNumber());
            display_14(button14.getNewNumber());}
        else{display_14(button14.getNumber());}
    }

    public void setNumber15(View view){
        if((button15.getLock()) == false){
            button15.setNumber(getNewNumber());
            display_15(button15.getNewNumber());}
        else{display_15(button15.getNumber());}
    }

    public void setNumber16(View view){
        if((button16.getLock()) == false){
            button16.setNumber(getNewNumber());
            display_16(button16.getNewNumber());}
        else{display_16(button16.getNumber());}
    }

    public void setNumber17(View view){
        if((button17.getLock()) == false){
            button17.setNumber(getNewNumber());
            display_17(button17.getNewNumber());}
        else{display_17(button17.getNumber());}
    }

    public void setNumber18(View view){
        if((button18.getLock()) == false){
            button18.setNumber(getNewNumber());
            display_18(button18.getNewNumber());}
        else{display_18(button18.getNumber());}
    }

    public void setNumber19(View view){
        if((button19.getLock()) == false){
            button19.setNumber(getNewNumber());
            display_19(button19.getNewNumber());}
        else{display_19(button19.getNumber());}
    }

    public void setNumber20(View view){
        if((button20.getLock()) == false){
            button20.setNumber(getNewNumber());
            display_20(button20.getNewNumber());}
        else{display_20(button20.getNumber());}
    }

    public void setNumber21(View view){
        if((button21.getLock()) == false){
            button21.setNumber(getNewNumber());
            display_21(button21.getNewNumber());}
        else{display_21(button21.getNumber());}
    }

    public void setNumber22(View view){
        if((button22.getLock()) == false){
            button22.setNumber(getNewNumber());
            display_22(button22.getNewNumber());}
        else{display_22(button22.getNumber());}
    }

    public void setNumber23(View view){
        if((button23.getLock()) == false){
            button23.setNumber(getNewNumber());
            display_23(button23.getNewNumber());}
        else{display_23(button23.getNumber());}
    }

    public void setNumber24(View view){
        if((button24.getLock()) == false){
            button24.setNumber(getNewNumber());
            display_24(button24.getNewNumber());}
        else{display_24(button24.getNumber());}
    }

    public void setNumber25(View view){
        if((button25.getLock()) == false){
            button25.setNumber(getNewNumber());
            display_25(button25.getNewNumber());}
        else{display_25(button25.getNumber());}
    }

    public void setNumber26(View view){
        if((button26.getLock()) == false){
            button26.setNumber(getNewNumber());
            display_26(button26.getNewNumber());}
        else{display_26(button26.getNumber());}
    }

    public void setNumber27(View view){
        if((button27.getLock()) == false){
            button27.setNumber(getNewNumber());
            display_27(button27.getNewNumber());}
        else{display_27(button27.getNumber());}
    }

    public void setNumber28(View view){
        if((button28.getLock()) == false){
            button28.setNumber(getNewNumber());
            display_28(button28.getNewNumber());}
        else{display_28(button28.getNumber());}
    }

    public void setNumber29(View view){
        if((button29.getLock()) == false){
            button29.setNumber(getNewNumber());
            display_29(button29.getNewNumber());}
        else{display_29(button29.getNumber());}
    }

    public void setNumber30(View view){
        if((button30.getLock()) == false){
            button30.setNumber(getNewNumber());
            display_30(button30.getNewNumber());}
        else{display_30(button30.getNumber());}
    }

    public void setNumber31(View view){
        if((button31.getLock()) == false){
            button31.setNumber(getNewNumber());
            display_31(button31.getNewNumber());}
        else{display_31(button31.getNumber());}
    }

    public void setNumber32(View view){
        if((button32.getLock()) == false){
            button32.setNumber(getNewNumber());
            display_32(button32.getNewNumber());}
        else{display_32(button32.getNumber());}
    }

    public void setNumber33(View view){
        if((button33.getLock()) == false){
            button33.setNumber(getNewNumber());
            display_33(button33.getNewNumber());}
        else{display_33(button33.getNumber());}
    }

    public void setNumber34(View view){
        if((button34.getLock()) == false){
            button34.setNumber(getNewNumber());
            display_34(button34.getNewNumber());}
        else{display_34(button34.getNumber());}
    }

    public void setNumber35(View view){
        if((button35.getLock()) == false){
            button35.setNumber(getNewNumber());
            display_35(button35.getNewNumber());}
        else{display_35(button35.getNumber());}
    }

    public void setNumber36(View view){
        if((button36.getLock()) == false){
            button36.setNumber(getNewNumber());
            display_36(button36.getNewNumber());}
        else{display_36(button36.getNumber());}
    }

    public void setNumber37(View view){
        if((button37.getLock()) == false){
            button37.setNumber(getNewNumber());
            display_37(button37.getNewNumber());}
        else{display_37(button37.getNumber());}
    }

    public void setNumber38(View view){
        if((button38.getLock()) == false){
            button38.setNumber(getNewNumber());
            display_38(button38.getNewNumber());}
        else{display_38(button38.getNumber());}
    }

    public void setNumber39(View view){
        if((button39.getLock()) == false){
            button39.setNumber(getNewNumber());
            display_39(button39.getNewNumber());}
        else{display_39(button39.getNumber());}
    }

    public void setNumber40(View view){
        if((button40.getLock()) == false){
            button40.setNumber(getNewNumber());
            display_40(button40.getNewNumber());}
        else{display_40(button40.getNumber());}
    }

    public void setNumber41(View view){
        if((button41.getLock()) == false){
            button41.setNumber(getNewNumber());
            display_41(button41.getNewNumber());}
        else{display_41(button41.getNumber());}
    }

    public void setNumber42(View view){
        if((button42.getLock()) == false){
            button42.setNumber(getNewNumber());
            display_42(button42.getNewNumber());}
        else{display_42(button42.getNumber());}
    }

    public void setNumber43(View view){
        if((button43.getLock()) == false){
            button43.setNumber(getNewNumber());
            display_43(button43.getNewNumber());}
        else{display_43(button43.getNumber());}
    }

    public void setNumber44(View view){
        if((button44.getLock()) == false){
            button44.setNumber(getNewNumber());
            display_44(button44.getNewNumber());}
        else{display_44(button44.getNumber());}
    }

    public void setNumber45(View view){
        if((button45.getLock()) == false){
            button45.setNumber(getNewNumber());
            display_45(button45.getNewNumber());}
        else{display_45(button45.getNumber());}
    }

    public void setNumber46(View view){
        if((button46.getLock()) == false){
            button46.setNumber(getNewNumber());
            display_46(button46.getNewNumber());}
        else{display_46(button46.getNumber());}
    }

    public void setNumber47(View view){
        if((button47.getLock()) == false){
            button47.setNumber(getNewNumber());
            display_47(button47.getNewNumber());}
        else{display_47(button47.getNumber());}
    }

    public void setNumber48(View view){
        if((button48.getLock()) == false){
            button48.setNumber(getNewNumber());
            display_48(button48.getNewNumber());}
        else{display_48(button48.getNumber());}
    }

    public void setNumber49(View view){
        if((button49.getLock()) == false){
            button49.setNumber(getNewNumber());
            display_49(button49.getNewNumber());}
        else{display_49(button49.getNumber());}
    }

    public void setNumber50(View view){
        if((button50.getLock()) == false){
            button50.setNumber(getNewNumber());
            display_50(button50.getNewNumber());}
        else{display_50(button50.getNumber());}
    }

    public void setNumber51(View view){
        if((button51.getLock()) == false){
            button51.setNumber(getNewNumber());
            display_51(button51.getNewNumber());}
        else{display_51(button51.getNumber());}
    }

    public void setNumber52(View view){
        if((button52.getLock()) == false){
            button52.setNumber(getNewNumber());
            display_52(button52.getNewNumber());}
        else{display_52(button52.getNumber());}
    }

    public void setNumber53(View view){
        if((button53.getLock()) == false){
            button53.setNumber(getNewNumber());
            display_53(button53.getNewNumber());}
        else{display_53(button53.getNumber());}
    }

    public void setNumber54(View view){
        if((button54.getLock()) == false){
            button54.setNumber(getNewNumber());
            display_54(button54.getNewNumber());}
        else{display_54(button54.getNumber());}
    }

    public void setNumber55(View view){
        if((button55.getLock()) == false){
            button55.setNumber(getNewNumber());
            display_55(button55.getNewNumber());}
        else{display_55(button55.getNumber());}
    }

    public void setNumber56(View view){
        if((button56.getLock()) == false){
            button56.setNumber(getNewNumber());
            display_56(button56.getNewNumber());}
        else{display_56(button56.getNumber());}
    }

    public void setNumber57(View view){
        if((button57.getLock()) == false){
            button57.setNumber(getNewNumber());
            display_57(button57.getNewNumber());}
        else{display_57(button57.getNumber());}
    }

    public void setNumber58(View view){
        if((button58.getLock()) == false){
            button58.setNumber(getNewNumber());
            display_58(button58.getNewNumber());}
        else{display_58(button58.getNumber());}
    }

    public void setNumber59(View view){
        if((button59.getLock()) == false){
            button59.setNumber(getNewNumber());
            display_59(button59.getNewNumber());}
        else{display_59(button59.getNumber());}
    }

    public void setNumber60(View view){
        if((button60.getLock()) == false){
            button60.setNumber(getNewNumber());
            display_60(button60.getNewNumber());}
        else{display_60(button60.getNumber());}
    }

    public void setNumber61(View view){
        if((button61.getLock()) == false){
            button61.setNumber(getNewNumber());
            display_61(button61.getNewNumber());}
        else{display_61(button61.getNumber());}
    }

    public void setNumber62(View view){
        if((button62.getLock()) == false){
            button62.setNumber(getNewNumber());
            display_62(button62.getNewNumber());}
        else{display_62(button62.getNumber());}
    }

    public void setNumber63(View view){
        if((button63.getLock()) == false){
            button63.setNumber(getNewNumber());
            display_63(button63.getNewNumber());}
        else{display_63(button63.getNumber());}
    }

    public void setNumber64(View view){
        if((button64.getLock()) == false){
            button64.setNumber(getNewNumber());
            display_64(button64.getNewNumber());}
        else{display_64(button64.getNumber());}
    }

    public void setNumber65(View view){
        if((button65.getLock()) == false){
            button65.setNumber(getNewNumber());
            display_65(button65.getNewNumber());}
        else{display_65(button65.getNumber());}
    }

    public void setNumber66(View view){
        if((button66.getLock()) == false){
            button66.setNumber(getNewNumber());
            display_66(button66.getNewNumber());}
        else{display_66(button66.getNumber());}
    }

    public void setNumber67(View view){
        if((button67.getLock()) == false){
            button67.setNumber(getNewNumber());
            display_67(button67.getNewNumber());}
        else{display_67(button67.getNumber());}
    }

    public void setNumber68(View view){
        if((button68.getLock()) == false){
            button68.setNumber(getNewNumber());
            display_68(button68.getNewNumber());}
        else{display_68(button68.getNumber());}
    }

    public void setNumber69(View view){
        if((button69.getLock()) == false){
            button69.setNumber(getNewNumber());
            display_69(button69.getNewNumber());}
        else{display_69(button69.getNumber());}
    }

    public void setNumber70(View view){
        if((button70.getLock()) == false){
            button70.setNumber(getNewNumber());
            display_70(button70.getNewNumber());}
        else{display_70(button70.getNumber());}
    }

    public void setNumber71(View view){
        if((button71.getLock()) == false){
            button71.setNumber(getNewNumber());
            display_71(button71.getNewNumber());}
        else{display_71(button71.getNumber());}
    }

    public void setNumber72(View view){
        if((button72.getLock()) == false){
            button72.setNumber(getNewNumber());
            display_72(button72.getNewNumber());}
        else{display_72(button72.getNumber());}
    }

    public void setNumber73(View view){
        if((button73.getLock()) == false){
            button73.setNumber(getNewNumber());
            display_73(button73.getNewNumber());}
        else{display_73(button73.getNumber());}
    }

    public void setNumber74(View view){
        if((button74.getLock()) == false){
            button74.setNumber(getNewNumber());
            display_74(button74.getNewNumber());}
        else{display_74(button74.getNumber());}
    }

    public void setNumber75(View view){
        if((button75.getLock()) == false){
            button75.setNumber(getNewNumber());
            display_75(button75.getNewNumber());}
        else{display_75(button75.getNumber());}
    }

    public void setNumber76(View view){
        if((button76.getLock()) == false){
            button76.setNumber(getNewNumber());
            display_76(button76.getNewNumber());}
        else{display_76(button76.getNumber());}
    }

    public void setNumber77(View view){
        if((button77.getLock()) == false){
            button77.setNumber(getNewNumber());
            display_77(button77.getNewNumber());}
        else{display_77(button77.getNumber());}
    }

    public void setNumber78(View view){
        if((button78.getLock()) == false){
            button78.setNumber(getNewNumber());
            display_78(button78.getNewNumber());}
        else{display_78(button78.getNumber());}
    }

    public void setNumber79(View view){
        if((button79.getLock()) == false){
            button79.setNumber(getNewNumber());
            display_79(button79.getNewNumber());}
        else{display_79(button79.getNumber());}
    }

    public void setNumber80(View view){
        if((button80.getLock()) == false){
            button80.setNumber(getNewNumber());
            display_80(button80.getNewNumber());}
        else{display_80(button80.getNumber());}
    }

    public void setNumber81(View view){
        if((button81.getLock()) == false){
            button81.setNumber(getNewNumber());
            display_81(button81.getNewNumber());}
        else{display_81(button81.getNumber());}
    }










    public void resetGame(View view){
        if(button1.getLock() == false) {
            button1.setNumber(0);
            display_1(button1.getNumber());
        }

        if(button2.getLock() == false) {
            button2.setNumber(0);
            display_2(button2.getNumber());
        }

        if(button3.getLock() == false) {
            button3.setNumber(0);
            display_3(button3.getNumber());
        }

        if(button4.getLock() == false) {
            button4.setNumber(0);
            display_4(button4.getNumber());
        }

        if(button5.getLock() == false) {
            button5.setNumber(0);
            display_5(button5.getNumber());
        }

        if(button6.getLock() == false) {
            button6.setNumber(0);
            display_6(button6.getNumber());
        }

        if(button7.getLock() == false) {
            button7.setNumber(0);
            display_7(button7.getNumber());
        }

        if(button8.getLock() == false) {
            button8.setNumber(0);
            display_8(button8.getNumber());
        }

        if(button9.getLock() == false) {
            button9.setNumber(0);
            display_9(button9.getNumber());
        }

        if(button10.getLock() == false) {
            button10.setNumber(0);
            display_10(button10.getNumber());
        }

        if(button11.getLock() == false) {
            button11.setNumber(0);
            display_11(button11.getNumber());
        }

        if(button12.getLock() == false) {
            button12.setNumber(0);
            display_12(button12.getNumber());
        }

        if(button13.getLock() == false) {
            button13.setNumber(0);
            display_13(button13.getNumber());
        }

        if(button14.getLock() == false) {
            button14.setNumber(0);
            display_14(button14.getNumber());
        }

        if(button15.getLock() == false) {
            button15.setNumber(0);
            display_15(button15.getNumber());
        }

        if(button16.getLock() == false) {
            button16.setNumber(0);
            display_16(button16.getNumber());
        }

        if(button17.getLock() == false) {
            button17.setNumber(0);
            display_17(button17.getNumber());
        }

        if(button18.getLock() == false) {
            button18.setNumber(0);
            display_18(button18.getNumber());
        }

        if(button19.getLock() == false) {
            button19.setNumber(0);
            display_19(button19.getNumber());
        }

        if(button20.getLock() == false) {
            button20.setNumber(0);
            display_20(button20.getNumber());
        }

        if(button21.getLock() == false) {
            button21.setNumber(0);
            display_21(button21.getNumber());
        }

        if(button22.getLock() == false) {
            button22.setNumber(0);
            display_22(button22.getNumber());
        }

        if(button23.getLock() == false) {
            button23.setNumber(0);
            display_23(button23.getNumber());
        }

        if(button24.getLock() == false) {
            button24.setNumber(0);
            display_24(button24.getNumber());
        }

        if(button25.getLock() == false) {
            button25.setNumber(0);
            display_25(button25.getNumber());
        }

        if(button26.getLock() == false) {
            button26.setNumber(0);
            display_26(button26.getNumber());
        }

        if(button27.getLock() == false) {
            button27.setNumber(0);
            display_27(button27.getNumber());
        }

        if(button28.getLock() == false) {
            button28.setNumber(0);
            display_28(button28.getNumber());
        }

        if(button29.getLock() == false) {
            button29.setNumber(0);
            display_29(button29.getNumber());
        }

        if(button30.getLock() == false) {
            button30.setNumber(0);
            display_30(button30.getNumber());
        }

        if(button31.getLock() == false) {
            button31.setNumber(0);
            display_31(button31.getNumber());
        }

        if(button32.getLock() == false) {
            button32.setNumber(0);
            display_32(button32.getNumber());
        }

        if(button33.getLock() == false) {
            button33.setNumber(0);
            display_33(button33.getNumber());
        }

        if(button34.getLock() == false) {
            button34.setNumber(0);
            display_34(button34.getNumber());
        }

        if(button35.getLock() == false) {
            button35.setNumber(0);
            display_35(button35.getNumber());
        }

        if(button36.getLock() == false) {
            button36.setNumber(0);
            display_36(button36.getNumber());
        }

        if(button37.getLock() == false) {
            button37.setNumber(0);
            display_37(button37.getNumber());
        }

        if(button38.getLock() == false) {
            button38.setNumber(0);
            display_38(button38.getNumber());
        }

        if(button39.getLock() == false) {
            button39.setNumber(0);
            display_39(button39.getNumber());
        }

        if(button40.getLock() == false) {
            button40.setNumber(0);
            display_40(button40.getNumber());
        }

        if(button41.getLock() == false) {
            button41.setNumber(0);
            display_41(button41.getNumber());
        }

        if(button42.getLock() == false) {
            button42.setNumber(0);
            display_42(button42.getNumber());
        }

        if(button43.getLock() == false) {
            button43.setNumber(0);
            display_43(button43.getNumber());
        }

        if(button44.getLock() == false) {
            button44.setNumber(0);
            display_44(button44.getNumber());
        }

        if(button45.getLock() == false) {
            button45.setNumber(0);
            display_45(button45.getNumber());
        }

        if(button46.getLock() == false) {
            button46.setNumber(0);
            display_46(button46.getNumber());
        }

        if(button47.getLock() == false) {
            button47.setNumber(0);
            display_47(button47.getNumber());
        }

        if(button48.getLock() == false) {
            button48.setNumber(0);
            display_48(button48.getNumber());
        }

        if(button49.getLock() == false) {
            button49.setNumber(0);
            display_49(button49.getNumber());
        }

        if(button50.getLock() == false) {
            button50.setNumber(0);
            display_50(button50.getNumber());
        }

        if(button51.getLock() == false) {
            button51.setNumber(0);
            display_51(button51.getNumber());
        }

        if(button52.getLock() == false) {
            button52.setNumber(0);
            display_52(button52.getNumber());
        }

        if(button53.getLock() == false) {
            button53.setNumber(0);
            display_53(button53.getNumber());
        }

        if(button54.getLock() == false) {
            button54.setNumber(0);
            display_54(button54.getNumber());
        }

        if(button55.getLock() == false) {
            button55.setNumber(0);
            display_55(button55.getNumber());
        }

        if(button56.getLock() == false) {
            button56.setNumber(0);
            display_56(button56.getNumber());
        }

        if(button57.getLock() == false) {
            button57.setNumber(0);
            display_57(button57.getNumber());
        }

        if(button58.getLock() == false) {
            button58.setNumber(0);
            display_58(button58.getNumber());
        }

        if(button59.getLock() == false) {
            button59.setNumber(0);
            display_59(button59.getNumber());
        }

        if(button60.getLock() == false) {
            button60.setNumber(0);
            display_60(button60.getNumber());
        }

        if(button61.getLock() == false) {
            button61.setNumber(0);
            display_61(button61.getNumber());
        }

        if(button62.getLock() == false) {
            button62.setNumber(0);
            display_62(button62.getNumber());
        }

        if(button63.getLock() == false) {
            button63.setNumber(0);
            display_63(button63.getNumber());
        }

        if(button64.getLock() == false) {
            button64.setNumber(0);
            display_64(button64.getNumber());
        }

        if(button65.getLock() == false) {
            button65.setNumber(0);
            display_65(button65.getNumber());
        }

        if(button66.getLock() == false) {
            button66.setNumber(0);
            display_66(button66.getNumber());
        }

        if(button67.getLock() == false) {
            button67.setNumber(0);
            display_67(button67.getNumber());
        }

        if(button68.getLock() == false) {
            button68.setNumber(0);
            display_68(button68.getNumber());
        }

        if(button69.getLock() == false) {
            button69.setNumber(0);
            display_69(button69.getNumber());
        }

        if(button70.getLock() == false) {
            button70.setNumber(0);
            display_70(button70.getNumber());
        }

        if(button71.getLock() == false) {
            button71.setNumber(0);
            display_71(button71.getNumber());
        }

        if(button72.getLock() == false) {
            button72.setNumber(0);
            display_72(button72.getNumber());
        }

        if(button73.getLock() == false) {
            button73.setNumber(0);
            display_73(button73.getNumber());
        }

        if(button74.getLock() == false) {
            button74.setNumber(0);
            display_74(button74.getNumber());
        }

        if(button75.getLock() == false) {
            button75.setNumber(0);
            display_75(button75.getNumber());
        }

        if(button76.getLock() == false) {
            button76.setNumber(0);
            display_76(button76.getNumber());
        }

        if(button77.getLock() == false) {
            button77.setNumber(0);
            display_77(button77.getNumber());
        }

        if(button78.getLock() == false) {
            button78.setNumber(0);
            display_78(button78.getNumber());
        }

        if(button79.getLock() == false) {
            button79.setNumber(0);
            display_79(button79.getNumber());
        }

        if(button80.getLock() == false) {
            button80.setNumber(0);
            display_80(button80.getNumber());
        }

        if(button81.getLock() == false) {
            button81.setNumber(0);
            display_81(button81.getNumber());
        }



    }
    public void setToOne(View view){
        SudokuButton.setButtonNumber(1);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));

    }
    public void setToTwo(View view){
        SudokuButton.setButtonNumber(2);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));
    }
    public void setToThree(View view){
        SudokuButton.setButtonNumber(3);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));
    }
    public void setToFour(View view){
        SudokuButton.setButtonNumber(4);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));
    }
    public void setToFive(View view){
        SudokuButton.setButtonNumber(5);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));
    }
    public void setToOSix(View view){
        SudokuButton.setButtonNumber(6);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));
    }
    public void setToSeven(View view){
        SudokuButton.setButtonNumber(7);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));
    }
    public void setToEight(View view){
        SudokuButton.setButtonNumber(8);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));
    }
    public void setToNine(View view){
        SudokuButton.setButtonNumber(9);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
        zeroButton.setBackgroundColor(Color.parseColor("#3F51B5"));
    }
    public void setToZero(View view){
        SudokuButton.setButtonNumber(0);
        Button oneButton = (Button) findViewById(R.id.number_1);
        Button twoButton = (Button) findViewById(R.id.number_2);
        Button threeButton = (Button) findViewById(R.id.number_3);
        Button fourButton = (Button) findViewById(R.id.number_4);
        Button fiveButton = (Button) findViewById(R.id.number_5);
        Button sixButton = (Button) findViewById(R.id.number_6);
        Button sevenButton = (Button) findViewById(R.id.number_7);
        Button eightButton = (Button) findViewById(R.id.number_8);
        Button nineButton = (Button) findViewById(R.id.number_9);
        Button zeroButton = (Button) findViewById(R.id.erase);
        oneButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        twoButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        threeButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fourButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        fiveButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sixButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        sevenButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        eightButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        nineButton.setBackgroundColor(Color.parseColor("#3F51B5"));
        zeroButton.setBackgroundColor(Color.parseColor("#9FA8DA"));
    }







    private void display_1(int number_1) {
        Button button_1 = (Button) findViewById(R.id.button_1);
        if (number_1 != 0) {
            button_1.setText(""+ number_1);
            if(button1.getLock() == true) {
                button_1.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button1.getLock() == false && number_1 != 0){
            button_1.setText(""+ number_1);
        }
        else {
            button_1.setText("");
        }
    }

    private void display_2(int number_2) {
        Button button_2 = (Button) findViewById(R.id.button_2);
        if (number_2 != 0) {
            button_2.setText(""+ number_2);
            if(button2.getLock() == true) {
                button_2.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button2.getLock() == false && number_2 != 0){
            button_2.setText(""+ number_2);
        }
        else {
            button_2.setText("");
        }
    }

    private void display_3(int number_3) {
        Button button_3 = (Button) findViewById(R.id.button_3);
        if (number_3 != 0) {
            button_3.setText(""+ number_3);
            if(button3.getLock() == true) {
                button_3.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button3.getLock() == false && number_3 != 0){
            button_3.setText(""+ number_3);
        }
        else {
            button_3.setText("");
        }
    }

    private void display_4(int number_4) {
        Button button_4 = (Button) findViewById(R.id.button_4);
        if (number_4 != 0) {
            button_4.setText(""+ number_4);
            if(button4.getLock() == true) {
                button_4.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button4.getLock() == false && number_4 != 0){
            button_4.setText(""+ number_4);
        }
        else {
            button_4.setText("");
        }
    }

    private void display_5(int number_5) {
        Button button_5 = (Button) findViewById(R.id.button_5);
        if (number_5 != 0) {
            button_5.setText(""+ number_5);
            if(button5.getLock() == true) {
                button_5.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button5.getLock() == false && number_5 != 0){
            button_5.setText(""+ number_5);
        }
        else {
            button_5.setText("");
        }
    }

    private void display_6(int number_6) {
        Button button_6 = (Button) findViewById(R.id.button_6);
        if (number_6 != 0) {
            button_6.setText(""+ number_6);
            if(button6.getLock() == true) {
                button_6.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button6.getLock() == false && number_6 != 0){
            button_6.setText(""+ number_6);
        }
        else {
            button_6.setText("");
        }
    }

    private void display_7(int number_7) {
        Button button_7 = (Button) findViewById(R.id.button_7);
        if (number_7 != 0) {
            button_7.setText(""+ number_7);
            if(button7.getLock() == true) {
                button_7.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button7.getLock() == false && number_7 != 0){
            button_7.setText(""+ number_7);
        }
        else {
            button_7.setText("");
        }
    }

    private void display_8(int number_8) {
        Button button_8 = (Button) findViewById(R.id.button_8);
        if (number_8 != 0) {
            button_8.setText(""+ number_8);
            if(button8.getLock() == true) {
                button_8.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button8.getLock() == false && number_8 != 0){
            button_8.setText(""+ number_8);
        }
        else {
            button_8.setText("");
        }
    }

    private void display_9(int number_9) {
        Button button_9 = (Button) findViewById(R.id.button_9);
        if (number_9 != 0) {
            button_9.setText(""+ number_9);
            if(button9.getLock() == true) {
                button_9.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button9.getLock() == false && number_9 != 0){
            button_9.setText(""+ number_9);
        }
        else {
            button_9.setText("");
        }
    }

    private void display_10(int number_10) {
        Button button_10 = (Button) findViewById(R.id.button_10);
        if (number_10 != 0) {
            button_10.setText(""+ number_10);
            if(button10.getLock() == true) {
                button_10.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button10.getLock() == false && number_10 != 0){
            button_10.setText(""+ number_10);
        }
        else {
            button_10.setText("");
        }
    }

    private void display_11(int number_11) {
        Button button_11 = (Button) findViewById(R.id.button_11);
        if (number_11 != 0) {
            button_11.setText(""+ number_11);
            if(button11.getLock() == true) {
                button_11.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button11.getLock() == false && number_11 != 0){
            button_11.setText(""+ number_11);
        }
        else {
            button_11.setText("");
        }
    }

    private void display_12(int number_12) {
        Button button_12 = (Button) findViewById(R.id.button_12);
        if (number_12 != 0) {
            button_12.setText(""+ number_12);
            if(button12.getLock() == true) {
                button_12.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button12.getLock() == false && number_12 != 0){
            button_12.setText(""+ number_12);
        }
        else {
            button_12.setText("");
        }
    }

    private void display_13(int number_13) {
        Button button_13 = (Button) findViewById(R.id.button_13);
        if (number_13 != 0) {
            button_13.setText(""+ number_13);
            if(button13.getLock() == true) {
                button_13.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button13.getLock() == false && number_13 != 0){
            button_13.setText(""+ number_13);
        }
        else {
            button_13.setText("");
        }
    }

    private void display_14(int number_14) {
        Button button_14 = (Button) findViewById(R.id.button_14);
        if (number_14 != 0) {
            button_14.setText(""+ number_14);
            if(button14.getLock() == true) {
                button_14.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button14.getLock() == false && number_14 != 0){
            button_14.setText(""+ number_14);
        }
        else {
            button_14.setText("");
        }
    }

    private void display_15(int number_15) {
        Button button_15 = (Button) findViewById(R.id.button_15);
        if (number_15 != 0) {
            button_15.setText(""+ number_15);
            if(button15.getLock() == true) {
                button_15.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button15.getLock() == false && number_15 != 0){
            button_15.setText(""+ number_15);
        }
        else {
            button_15.setText("");
        }
    }

    private void display_16(int number_16) {
        Button button_16 = (Button) findViewById(R.id.button_16);
        if (number_16 != 0) {
            button_16.setText(""+ number_16);
            if(button16.getLock() == true) {
                button_16.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button16.getLock() == false && number_16 != 0){
            button_16.setText(""+ number_16);
        }
        else {
            button_16.setText("");
        }
    }

    private void display_17(int number_17) {
        Button button_17 = (Button) findViewById(R.id.button_17);
        if (number_17 != 0) {
            button_17.setText(""+ number_17);
            if(button17.getLock() == true) {
                button_17.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button17.getLock() == false && number_17 != 0){
            button_17.setText(""+ number_17);
        }
        else {
            button_17.setText("");
        }
    }

    private void display_18(int number_18) {
        Button button_18 = (Button) findViewById(R.id.button_18);
        if (number_18 != 0) {
            button_18.setText(""+ number_18);
            if(button18.getLock() == true) {
                button_18.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button18.getLock() == false && number_18 != 0){
            button_18.setText(""+ number_18);
        }
        else {
            button_18.setText("");
        }
    }

    private void display_19(int number_19) {
        Button button_19 = (Button) findViewById(R.id.button_19);
        if (number_19 != 0) {
            button_19.setText(""+ number_19);
            if(button19.getLock() == true) {
                button_19.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button19.getLock() == false && number_19 != 0){
            button_19.setText(""+ number_19);
        }
        else {
            button_19.setText("");
        }
    }

    private void display_20(int number_20) {
        Button button_20 = (Button) findViewById(R.id.button_20);
        if (number_20 != 0) {
            button_20.setText(""+ number_20);
            if(button20.getLock() == true) {
                button_20.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button20.getLock() == false && number_20 != 0){
            button_20.setText(""+ number_20);
        }
        else {
            button_20.setText("");
        }
    }

    private void display_21(int number_21) {
        Button button_21 = (Button) findViewById(R.id.button_21);
        if (number_21 != 0) {
            button_21.setText(""+ number_21);
            if(button21.getLock() == true) {
                button_21.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button21.getLock() == false && number_21 != 0){
            button_21.setText(""+ number_21);
        }
        else {
            button_21.setText("");
        }
    }

    private void display_22(int number_22) {
        Button button_22 = (Button) findViewById(R.id.button_22);
        if (number_22 != 0) {
            button_22.setText(""+ number_22);
            if(button22.getLock() == true) {
                button_22.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button22.getLock() == false && number_22 != 0){
            button_22.setText(""+ number_22);
        }
        else {
            button_22.setText("");
        }
    }

    private void display_23(int number_23) {
        Button button_23 = (Button) findViewById(R.id.button_23);
        if (number_23 != 0) {
            button_23.setText(""+ number_23);
            if(button23.getLock() == true) {
                button_23.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button23.getLock() == false && number_23 != 0){
            button_23.setText(""+ number_23);
        }
        else {
            button_23.setText("");
        }
    }

    private void display_24(int number_24) {
        Button button_24 = (Button) findViewById(R.id.button_24);
        if (number_24 != 0) {
            button_24.setText(""+ number_24);
            if(button24.getLock() == true) {
                button_24.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button24.getLock() == false && number_24 != 0){
            button_24.setText(""+ number_24);
        }
        else {
            button_24.setText("");
        }
    }

    private void display_25(int number_25) {
        Button button_25 = (Button) findViewById(R.id.button_25);
        if (number_25 != 0) {
            button_25.setText(""+ number_25);
            if(button25.getLock() == true) {
                button_25.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button25.getLock() == false && number_25 != 0){
            button_25.setText(""+ number_25);
        }
        else {
            button_25.setText("");
        }
    }

    private void display_26(int number_26) {
        Button button_26 = (Button) findViewById(R.id.button_26);
        if (number_26 != 0) {
            button_26.setText(""+ number_26);
            if(button26.getLock() == true) {
                button_26.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button26.getLock() == false && number_26 != 0){
            button_26.setText(""+ number_26);
        }
        else {
            button_26.setText("");
        }
    }

    private void display_27(int number_27) {
        Button button_27 = (Button) findViewById(R.id.button_27);
        if (number_27 != 0) {
            button_27.setText(""+ number_27);
            if(button27.getLock() == true) {
                button_27.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button27.getLock() == false && number_27 != 0){
            button_27.setText(""+ number_27);
        }
        else {
            button_27.setText("");
        }
    }

    private void display_28(int number_28) {
        Button button_28 = (Button) findViewById(R.id.button_28);
        if (number_28 != 0) {
            button_28.setText(""+ number_28);
            if(button28.getLock() == true) {
                button_28.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button28.getLock() == false && number_28 != 0){
            button_28.setText(""+ number_28);
        }
        else {
            button_28.setText("");
        }
    }

    private void display_29(int number_29) {
        Button button_29 = (Button) findViewById(R.id.button_29);
        if (number_29 != 0) {
            button_29.setText(""+ number_29);
            if(button29.getLock() == true) {
                button_29.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button29.getLock() == false && number_29 != 0){
            button_29.setText(""+ number_29);
        }
        else {
            button_29.setText("");
        }
    }

    private void display_30(int number_30) {
        Button button_30 = (Button) findViewById(R.id.button_30);
        if (number_30 != 0) {
            button_30.setText(""+ number_30);
            if(button30.getLock() == true) {
                button_30.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button30.getLock() == false && number_30 != 0){
            button_30.setText(""+ number_30);
        }
        else {
            button_30.setText("");
        }
    }

    private void display_31(int number_31) {
        Button button_31 = (Button) findViewById(R.id.button_31);
        if (number_31 != 0) {
            button_31.setText(""+ number_31);
            if(button31.getLock() == true) {
                button_31.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button31.getLock() == false && number_31 != 0){
            button_31.setText(""+ number_31);
        }
        else {
            button_31.setText("");
        }
    }

    private void display_32(int number_32) {
        Button button_32 = (Button) findViewById(R.id.button_32);
        if (number_32 != 0) {
            button_32.setText(""+ number_32);
            if(button32.getLock() == true) {
                button_32.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button32.getLock() == false && number_32 != 0){
            button_32.setText(""+ number_32);
        }
        else {
            button_32.setText("");
        }
    }

    private void display_33(int number_33) {
        Button button_33 = (Button) findViewById(R.id.button_33);
        if (number_33 != 0) {
            button_33.setText(""+ number_33);
            if(button33.getLock() == true) {
                button_33.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button33.getLock() == false && number_33 != 0){
            button_33.setText(""+ number_33);
        }
        else {
            button_33.setText("");
        }
    }

    private void display_34(int number_34) {
        Button button_34 = (Button) findViewById(R.id.button_34);
        if (number_34 != 0) {
            button_34.setText(""+ number_34);
            if(button34.getLock() == true) {
                button_34.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button34.getLock() == false && number_34 != 0){
            button_34.setText(""+ number_34);
        }
        else {
            button_34.setText("");
        }
    }

    private void display_35(int number_35) {
        Button button_35 = (Button) findViewById(R.id.button_35);
        if (number_35 != 0) {
            button_35.setText(""+ number_35);
            if(button35.getLock() == true) {
                button_35.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button35.getLock() == false && number_35 != 0){
            button_35.setText(""+ number_35);
        }
        else {
            button_35.setText("");
        }
    }

    private void display_36(int number_36) {
        Button button_36 = (Button) findViewById(R.id.button_36);
        if (number_36 != 0) {
            button_36.setText(""+ number_36);
            if(button36.getLock() == true) {
                button_36.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button36.getLock() == false && number_36 != 0){
            button_36.setText(""+ number_36);
        }
        else {
            button_36.setText("");
        }
    }

    private void display_37(int number_37) {
        Button button_37 = (Button) findViewById(R.id.button_37);
        if (number_37 != 0) {
            button_37.setText(""+ number_37);
            if(button37.getLock() == true) {
                button_37.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button37.getLock() == false && number_37 != 0){
            button_37.setText(""+ number_37);
        }
        else {
            button_37.setText("");
        }
    }

    private void display_38(int number_38) {
        Button button_38 = (Button) findViewById(R.id.button_38);
        if (number_38 != 0) {
            button_38.setText(""+ number_38);
            if(button38.getLock() == true) {
                button_38.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button38.getLock() == false && number_38 != 0){
            button_38.setText(""+ number_38);
        }
        else {
            button_38.setText("");
        }
    }

    private void display_39(int number_39) {
        Button button_39 = (Button) findViewById(R.id.button_39);
        if (number_39 != 0) {
            button_39.setText(""+ number_39);
            if(button39.getLock() == true) {
                button_39.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button39.getLock() == false && number_39 != 0){
            button_39.setText(""+ number_39);
        }
        else {
            button_39.setText("");
        }
    }

    private void display_40(int number_40) {
        Button button_40 = (Button) findViewById(R.id.button_40);
        if (number_40 != 0) {
            button_40.setText(""+ number_40);
            if(button40.getLock() == true) {
                button_40.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button40.getLock() == false && number_40 != 0){
            button_40.setText(""+ number_40);
        }
        else {
            button_40.setText("");
        }
    }

    private void display_41(int number_41) {
        Button button_41 = (Button) findViewById(R.id.button_41);
        if (number_41 != 0) {
            button_41.setText(""+ number_41);
            if(button41.getLock() == true) {
                button_41.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button41.getLock() == false && number_41 != 0){
            button_41.setText(""+ number_41);
        }
        else {
            button_41.setText("");
        }
    }

    private void display_42(int number_42) {
        Button button_42 = (Button) findViewById(R.id.button_42);
        if (number_42 != 0) {
            button_42.setText(""+ number_42);
            if(button42.getLock() == true) {
                button_42.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button42.getLock() == false && number_42 != 0){
            button_42.setText(""+ number_42);
        }
        else {
            button_42.setText("");
        }
    }

    private void display_43(int number_43) {
        Button button_43 = (Button) findViewById(R.id.button_43);
        if (number_43 != 0) {
            button_43.setText(""+ number_43);
            if(button43.getLock() == true) {
                button_43.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button43.getLock() == false && number_43 != 0){
            button_43.setText(""+ number_43);
        }
        else {
            button_43.setText("");
        }
    }

    private void display_44(int number_44) {
        Button button_44 = (Button) findViewById(R.id.button_44);
        if (number_44 != 0) {
            button_44.setText(""+ number_44);
            if(button44.getLock() == true) {
                button_44.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button44.getLock() == false && number_44 != 0){
            button_44.setText(""+ number_44);
        }
        else {
            button_44.setText("");
        }
    }

    private void display_45(int number_45) {
        Button button_45 = (Button) findViewById(R.id.button_45);
        if (number_45 != 0) {
            button_45.setText(""+ number_45);
            if(button45.getLock() == true) {
                button_45.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button45.getLock() == false && number_45 != 0){
            button_45.setText(""+ number_45);
        }
        else {
            button_45.setText("");
        }
    }

    private void display_46(int number_46) {
        Button button_46 = (Button) findViewById(R.id.button_46);
        if (number_46 != 0) {
            button_46.setText(""+ number_46);
            if(button46.getLock() == true) {
                button_46.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button46.getLock() == false && number_46 != 0){
            button_46.setText(""+ number_46);
        }
        else {
            button_46.setText("");
        }
    }

    private void display_47(int number_47) {
        Button button_47 = (Button) findViewById(R.id.button_47);
        if (number_47 != 0) {
            button_47.setText(""+ number_47);
            if(button47.getLock() == true) {
                button_47.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button47.getLock() == false && number_47 != 0){
            button_47.setText(""+ number_47);
        }
        else {
            button_47.setText("");
        }
    }

    private void display_48(int number_48) {
        Button button_48 = (Button) findViewById(R.id.button_48);
        if (number_48 != 0) {
            button_48.setText(""+ number_48);
            if(button48.getLock() == true) {
                button_48.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button48.getLock() == false && number_48 != 0){
            button_48.setText(""+ number_48);
        }
        else {
            button_48.setText("");
        }
    }

    private void display_49(int number_49) {
        Button button_49 = (Button) findViewById(R.id.button_49);
        if (number_49 != 0) {
            button_49.setText(""+ number_49);
            if(button49.getLock() == true) {
                button_49.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button49.getLock() == false && number_49 != 0){
            button_49.setText(""+ number_49);
        }
        else {
            button_49.setText("");
        }
    }

    private void display_50(int number_50) {
        Button button_50 = (Button) findViewById(R.id.button_50);
        if (number_50 != 0) {
            button_50.setText(""+ number_50);
            if(button50.getLock() == true) {
                button_50.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button50.getLock() == false && number_50 != 0){
            button_50.setText(""+ number_50);
        }
        else {
            button_50.setText("");
        }
    }

    private void display_51(int number_51) {
        Button button_51 = (Button) findViewById(R.id.button_51);
        if (number_51 != 0) {
            button_51.setText(""+ number_51);
            if(button51.getLock() == true) {
                button_51.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button51.getLock() == false && number_51 != 0){
            button_51.setText(""+ number_51);
        }
        else {
            button_51.setText("");
        }
    }

    private void display_52(int number_52) {
        Button button_52 = (Button) findViewById(R.id.button_52);
        if (number_52 != 0) {
            button_52.setText(""+ number_52);
            if(button52.getLock() == true) {
                button_52.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button52.getLock() == false && number_52 != 0){
            button_52.setText(""+ number_52);
        }
        else {
            button_52.setText("");
        }
    }

    private void display_53(int number_53) {
        Button button_53 = (Button) findViewById(R.id.button_53);
        if (number_53 != 0) {
            button_53.setText(""+ number_53);
            if(button53.getLock() == true) {
                button_53.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button53.getLock() == false && number_53 != 0){
            button_53.setText(""+ number_53);
        }
        else {
            button_53.setText("");
        }
    }

    private void display_54(int number_54) {
        Button button_54 = (Button) findViewById(R.id.button_54);
        if (number_54 != 0) {
            button_54.setText(""+ number_54);
            if(button54.getLock() == true) {
                button_54.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button54.getLock() == false && number_54 != 0){
            button_54.setText(""+ number_54);
        }
        else {
            button_54.setText("");
        }
    }

    private void display_55(int number_55) {
        Button button_55 = (Button) findViewById(R.id.button_55);
        if (number_55 != 0) {
            button_55.setText(""+ number_55);
            if(button55.getLock() == true) {
                button_55.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button55.getLock() == false && number_55 != 0){
            button_55.setText(""+ number_55);
        }
        else {
            button_55.setText("");
        }
    }

    private void display_56(int number_56) {
        Button button_56 = (Button) findViewById(R.id.button_56);
        if (number_56 != 0) {
            button_56.setText(""+ number_56);
            if(button56.getLock() == true) {
                button_56.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button56.getLock() == false && number_56 != 0){
            button_56.setText(""+ number_56);
        }
        else {
            button_56.setText("");
        }
    }

    private void display_57(int number_57) {
        Button button_57 = (Button) findViewById(R.id.button_57);
        if (number_57 != 0) {
            button_57.setText(""+ number_57);
            if(button57.getLock() == true) {
                button_57.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button57.getLock() == false && number_57 != 0){
            button_57.setText(""+ number_57);
        }
        else {
            button_57.setText("");
        }
    }

    private void display_58(int number_58) {
        Button button_58 = (Button) findViewById(R.id.button_58);
        if (number_58 != 0) {
            button_58.setText(""+ number_58);
            if(button58.getLock() == true) {
                button_58.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button58.getLock() == false && number_58 != 0){
            button_58.setText(""+ number_58);
        }
        else {
            button_58.setText("");
        }
    }

    private void display_59(int number_59) {
        Button button_59 = (Button) findViewById(R.id.button_59);
        if (number_59 != 0) {
            button_59.setText(""+ number_59);
            if(button59.getLock() == true) {
                button_59.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button59.getLock() == false && number_59 != 0){
            button_59.setText(""+ number_59);
        }
        else {
            button_59.setText("");
        }
    }

    private void display_60(int number_60) {
        Button button_60 = (Button) findViewById(R.id.button_60);
        if (number_60 != 0) {
            button_60.setText(""+ number_60);
            if(button60.getLock() == true) {
                button_60.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button60.getLock() == false && number_60 != 0){
            button_60.setText(""+ number_60);
        }
        else {
            button_60.setText("");
        }
    }

    private void display_61(int number_61) {
        Button button_61 = (Button) findViewById(R.id.button_61);
        if (number_61 != 0) {
            button_61.setText(""+ number_61);
            if(button61.getLock() == true) {
                button_61.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button61.getLock() == false && number_61 != 0){
            button_61.setText(""+ number_61);
        }
        else {
            button_61.setText("");
        }
    }

    private void display_62(int number_62) {
        Button button_62 = (Button) findViewById(R.id.button_62);
        if (number_62 != 0) {
            button_62.setText(""+ number_62);
            if(button62.getLock() == true) {
                button_62.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button62.getLock() == false && number_62 != 0){
            button_62.setText(""+ number_62);
        }
        else {
            button_62.setText("");
        }
    }

    private void display_63(int number_63) {
        Button button_63 = (Button) findViewById(R.id.button_63);
        if (number_63 != 0) {
            button_63.setText(""+ number_63);
            if(button63.getLock() == true) {
                button_63.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button63.getLock() == false && number_63 != 0){
            button_63.setText(""+ number_63);
        }
        else {
            button_63.setText("");
        }
    }

    private void display_64(int number_64) {
        Button button_64 = (Button) findViewById(R.id.button_64);
        if (number_64 != 0) {
            button_64.setText(""+ number_64);
            if(button64.getLock() == true) {
                button_64.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button64.getLock() == false && number_64 != 0){
            button_64.setText(""+ number_64);
        }
        else {
            button_64.setText("");
        }
    }

    private void display_65(int number_65) {
        Button button_65 = (Button) findViewById(R.id.button_65);
        if (number_65 != 0) {
            button_65.setText(""+ number_65);
            if(button65.getLock() == true) {
                button_65.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button65.getLock() == false && number_65 != 0){
            button_65.setText(""+ number_65);
        }
        else {
            button_65.setText("");
        }
    }

    private void display_66(int number_66) {
        Button button_66 = (Button) findViewById(R.id.button_66);
        if (number_66 != 0) {
            button_66.setText(""+ number_66);
            if(button66.getLock() == true) {
                button_66.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button66.getLock() == false && number_66 != 0){
            button_66.setText(""+ number_66);
        }
        else {
            button_66.setText("");
        }
    }

    private void display_67(int number_67) {
        Button button_67 = (Button) findViewById(R.id.button_67);
        if (number_67 != 0) {
            button_67.setText(""+ number_67);
            if(button67.getLock() == true) {
                button_67.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button67.getLock() == false && number_67 != 0){
            button_67.setText(""+ number_67);
        }
        else {
            button_67.setText("");
        }
    }

    private void display_68(int number_68) {
        Button button_68 = (Button) findViewById(R.id.button_68);
        if (number_68 != 0) {
            button_68.setText(""+ number_68);
            if(button68.getLock() == true) {
                button_68.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button68.getLock() == false && number_68 != 0){
            button_68.setText(""+ number_68);
        }
        else {
            button_68.setText("");
        }
    }

    private void display_69(int number_69) {
        Button button_69 = (Button) findViewById(R.id.button_69);
        if (number_69 != 0) {
            button_69.setText(""+ number_69);
            if(button69.getLock() == true) {
                button_69.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button69.getLock() == false && number_69 != 0){
            button_69.setText(""+ number_69);
        }
        else {
            button_69.setText("");
        }
    }

    private void display_70(int number_70) {
        Button button_70 = (Button) findViewById(R.id.button_70);
        if (number_70 != 0) {
            button_70.setText(""+ number_70);
            if(button70.getLock() == true) {
                button_70.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button70.getLock() == false && number_70 != 0){
            button_70.setText(""+ number_70);
        }
        else {
            button_70.setText("");
        }
    }

    private void display_71(int number_71) {
        Button button_71 = (Button) findViewById(R.id.button_71);
        if (number_71 != 0) {
            button_71.setText(""+ number_71);
            if(button71.getLock() == true) {
                button_71.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button71.getLock() == false && number_71 != 0){
            button_71.setText(""+ number_71);
        }
        else {
            button_71.setText("");
        }
    }

    private void display_72(int number_72) {
        Button button_72 = (Button) findViewById(R.id.button_72);
        if (number_72 != 0) {
            button_72.setText(""+ number_72);
            if(button72.getLock() == true) {
                button_72.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button72.getLock() == false && number_72 != 0){
            button_72.setText(""+ number_72);
        }
        else {
            button_72.setText("");
        }
    }

    private void display_73(int number_73) {
        Button button_73 = (Button) findViewById(R.id.button_73);
        if (number_73 != 0) {
            button_73.setText(""+ number_73);
            if(button73.getLock() == true) {
                button_73.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button73.getLock() == false && number_73 != 0){
            button_73.setText(""+ number_73);
        }
        else {
            button_73.setText("");
        }
    }

    private void display_74(int number_74) {
        Button button_74 = (Button) findViewById(R.id.button_74);
        if (number_74 != 0) {
            button_74.setText(""+ number_74);
            if(button74.getLock() == true) {
                button_74.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button74.getLock() == false && number_74 != 0){
            button_74.setText(""+ number_74);
        }
        else {
            button_74.setText("");
        }
    }

    private void display_75(int number_75) {
        Button button_75 = (Button) findViewById(R.id.button_75);
        if (number_75 != 0) {
            button_75.setText(""+ number_75);
            if(button75.getLock() == true) {
                button_75.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button75.getLock() == false && number_75 != 0){
            button_75.setText(""+ number_75);
        }
        else {
            button_75.setText("");
        }
    }

    private void display_76(int number_76) {
        Button button_76 = (Button) findViewById(R.id.button_76);
        if (number_76 != 0) {
            button_76.setText(""+ number_76);
            if(button76.getLock() == true) {
                button_76.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button76.getLock() == false && number_76 != 0){
            button_76.setText(""+ number_76);
        }
        else {
            button_76.setText("");
        }
    }

    private void display_77(int number_77) {
        Button button_77 = (Button) findViewById(R.id.button_77);
        if (number_77 != 0) {
            button_77.setText(""+ number_77);
            if(button77.getLock() == true) {
                button_77.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button77.getLock() == false && number_77 != 0){
            button_77.setText(""+ number_77);
        }
        else {
            button_77.setText("");
        }
    }

    private void display_78(int number_78) {
        Button button_78 = (Button) findViewById(R.id.button_78);
        if (number_78 != 0) {
            button_78.setText(""+ number_78);
            if(button78.getLock() == true) {
                button_78.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button78.getLock() == false && number_78 != 0){
            button_78.setText(""+ number_78);
        }
        else {
            button_78.setText("");
        }
    }

    private void display_79(int number_79) {
        Button button_79 = (Button) findViewById(R.id.button_79);
        if (number_79 != 0) {
            button_79.setText(""+ number_79);
            if(button79.getLock() == true) {
                button_79.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button79.getLock() == false && number_79 != 0){
            button_79.setText(""+ number_79);
        }
        else {
            button_79.setText("");
        }
    }

    private void display_80(int number_80) {
        Button button_80 = (Button) findViewById(R.id.button_80);
        if (number_80 != 0) {
            button_80.setText(""+ number_80);
            if(button80.getLock() == true) {
                button_80.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button80.getLock() == false && number_80 != 0){
            button_80.setText(""+ number_80);
        }
        else {
            button_80.setText("");
        }
    }

    private void display_81(int number_81) {
        Button button_81 = (Button) findViewById(R.id.button_81);
        if (number_81 != 0) {
            button_81.setText(""+ number_81);
            if(button81.getLock() == true) {
                button_81.setBackgroundColor(Color.parseColor("#E0E0E0"));
            }
        }
        else if(button81.getLock() == false && number_81 != 0){
            button_81.setText(""+ number_81);
        }
        else {
            button_81.setText("");
        }
    }


    private int[][] createArray (int number_1, int number_2, int number_3, int number_4, int number_5,
                                 int number_6, int number_7, int number_8, int number_9, int number_10,
                                 int number_11, int number_12, int number_13, int number_14, int number_15,
                                 int number_16, int number_17, int number_18, int number_19, int number_20,
                                 int number_21, int number_22, int number_23, int number_24, int number_25,
                                 int number_26, int number_27, int number_28, int number_29, int number_30,
                                 int number_31, int number_32, int number_33, int number_34, int number_35,
                                 int number_36, int number_37, int number_38, int number_39, int number_40,
                                 int number_41, int number_42, int number_43, int number_44, int number_45,
                                 int number_46, int number_47, int number_48, int number_49, int number_50,
                                 int number_51, int number_52, int number_53, int number_54, int number_55,
                                 int number_56, int number_57, int number_58, int number_59, int number_60,
                                 int number_61, int number_62, int number_63, int number_64, int number_65,
                                 int number_66, int number_67, int number_68, int number_69, int number_70,
                                 int number_71, int number_72, int number_73, int number_74, int number_75,
                                 int number_76, int number_77, int number_78, int number_79, int number_80,
                                 int number_81){
        int [][] solution = {
                {number_1,number_2,number_3,number_4,number_5,
                        number_6,number_7,number_8,number_9}
                ,{number_10,
                number_11,number_12,number_13,number_14,number_15,
                number_16,number_17,number_18}
                ,{number_19,number_20,
                number_21,number_22,number_23,number_24,number_25,
                number_26,number_27}
                ,{number_28,number_29,number_30,
                number_31,number_32,number_33,number_34,number_35,
                number_36}
                ,{number_37,number_38,number_39,number_40,
                number_41,number_42,number_43,number_44,number_45}
                ,{number_46,number_47,number_48,number_49,number_50,
                number_51,number_52,number_53,number_54},
                {number_55,
                        number_56, number_57, number_58, number_59, number_60,
                        number_61, number_62, number_63},
                {number_64,number_65,number_66,number_67,number_68,number_69,number_70,
                        number_71,number_72},
                {number_73,number_74,number_75,number_76,number_77,number_78,number_79,number_80,
                        number_81} };
        return solution;

    }
    public void submitSolution (View view) {
        if (checkBoard() == false) {
            startActivity(new Intent(HardSoduku.this,AnswerPop.class));
        }
        else if(checkBoard() == true) {
            time.stop();
            startActivity(new Intent(HardSoduku.this,WinPop.class));
        }

    }

    private boolean checkBoard(){
        boolean correctAnswer = true;
        int[][] playerSolution = createArray(button1.getNumber(),
                button2.getNumber(),
                button3.getNumber(),
                button4.getNumber(),
                button5.getNumber(),
                button6.getNumber(),
                button7.getNumber(),
                button8.getNumber(),
                button9.getNumber(),
                button10.getNumber(),
                button11.getNumber(),
                button12.getNumber(),
                button13.getNumber(),
                button14.getNumber(),
                button15.getNumber(),
                button16.getNumber(),
                button17.getNumber(),
                button18.getNumber(),
                button19.getNumber(),
                button20.getNumber(),
                button21.getNumber(),
                button22.getNumber(),
                button23.getNumber(),
                button24.getNumber(),
                button25.getNumber(),
                button26.getNumber(),
                button27.getNumber(),
                button28.getNumber(),
                button29.getNumber(),
                button30.getNumber(),
                button31.getNumber(),
                button32.getNumber(),
                button33.getNumber(),
                button34.getNumber(),
                button35.getNumber(),
                button36.getNumber(),
                button37.getNumber(),
                button38.getNumber(),
                button39.getNumber(),
                button40.getNumber(),
                button41.getNumber(),
                button42.getNumber(),
                button43.getNumber(),
                button44.getNumber(),
                button45.getNumber(),
                button46.getNumber(),
                button47.getNumber(),
                button48.getNumber(),
                button49.getNumber(),
                button50.getNumber(),
                button51.getNumber(),
                button52.getNumber(),
                button53.getNumber(),
                button54.getNumber(),
                button55.getNumber(),
                button56.getNumber(),
                button57.getNumber(),
                button58.getNumber(),
                button59.getNumber(),
                button60.getNumber(),
                button61.getNumber(),
                button62.getNumber(),
                button63.getNumber(),
                button64.getNumber(),
                button65.getNumber(),
                button66.getNumber(),
                button67.getNumber(),
                button68.getNumber(),
                button69.getNumber(),
                button70.getNumber(),
                button71.getNumber(),
                button72.getNumber(),
                button73.getNumber(),
                button74.getNumber(),
                button75.getNumber(),
                button76.getNumber(),
                button77.getNumber(),
                button78.getNumber(),
                button79.getNumber(),
                button80.getNumber(),
                button81.getNumber());
        for (int a = 0; a < playerSolution.length; a++){
            for (int b = 0; b < playerSolution[a].length; b++){
                if (playerSolution[a][b] == 0) {
                    correctAnswer = false;
                    break;
                }
                boolean checkerV = false;
                boolean  checkerB = false;
                boolean  checkerH = false;
                checkerV = SudokuBoard.checkVerticalTwo(b,playerSolution,playerSolution[a][b],checkerV);
                checkerH = SudokuBoard.checkHorizontalTwo(a,playerSolution,playerSolution[a][b],checkerH);
                checkerB = SudokuBoard.checkBoxTwo(a,b,playerSolution,playerSolution[a][b],checkerB);
                if(checkerB == false || checkerH == false || checkerV == false) {
                    correctAnswer = false;
                    break;
                }
            }
        }
        return correctAnswer;
    }


}





