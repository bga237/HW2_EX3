package com.example.homework2e3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.BreakIterator;

public class MainActivity<buttonCount> extends AppCompatActivity {

    String[] message={"Stop","Go","Wait"};
    int[] colors ={0xe30b1a,0x2fe30b,0xdfe30b};
    int buttonCount=0;


    View signal;
    Button button;


        public void ChangeSignal(View view)
    {
        buttonCount +=1;
        buttonCount = buttonCount %3;

            }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}