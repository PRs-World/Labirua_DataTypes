package com.example.labirua_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display =  findViewById(R.id.displayTxt);

        String firstName = "Pat Ramses";
        char middleIntial = 'R';
        String lastname = "Labirua,";
        int myaAge = 18;
        float myDreamTVL3Grade = 85.0f;
        double myMoney =999999.99;




        //String.valueof(myMoney);
        display.setText("My name is "+firstName+ " "
                +String.valueOf(middleIntial)+ " "
                +lastname+ "\nand my age is "
                +myaAge+ "\nI want my grade in TVL3 to be "
                +String.valueOf(myDreamTVL3Grade));



    }
}