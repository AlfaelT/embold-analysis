package com.example.jeffrey.sodukugame;

        import android.view.View;
        import android.widget.Button;

        import static android.R.attr.button;
        import static com.example.jeffrey.sodukugame.R.id.button_1;


/**
 * Created by jeffrey on 1/27/2017.
 */

public class SudokuButton{
     static private int button_number = 0 ;
    private int number = 0 ;
    private boolean lock = false;
    private static boolean buttonLock = false;

   static public void setButtonNumber(int buttonNumber) {
        if (buttonLock == true) {

        } else {
            button_number = buttonNumber;
        }
    }
    public void setNumber(int buttonNumber) {
        if (lock == true) {

        } else {
            number = buttonNumber;
        }
    }
    public int getNumber(){
        return number;
    }
    static public int getNewNumber(){
        return button_number;
    }

   public void isLock() {
        lock = true;

    }

    public boolean getLock(){
        return lock;
    }
}
