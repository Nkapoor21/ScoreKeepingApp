package com.example.android.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int score1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {

        score = score + 1;
        display(score);
    }
    public void increment1(View view) {

        score = score + 2;
        display(score);
    }
    public void increment2(View view) {

        score = score + 3;
        display(score);
    }
    public void increment3(View view) {

        score = score + 4;
        display(score);
    }
    public void increment4(View view) {

        score = score + 6;
        display(score);
    }
    public void decrement(View view) {
if(score!=0) {
    score = score - 1;

    display(score);
} else
    return;
    }
    public void Reset(View view) {

        score = 0 ;
        display(score);
    }
    public void inc(View view) {

        score1 = score1 + 1;
        display1(score1);
    }
    public void inc1(View view) {

        score1 = score1 + 2;
        display1(score1);
    }
    public void inc2(View view) {

        score1 = score1 + 3;
        display1(score1);
    }
    public void inc3(View view) {

        score1 = score1 + 4;
        display1(score1);
    }
    public void inc4(View view) {

        score1 = score1 + 6;
        display1(score1);
    }
    public void dec(View view) {
if(score1!=0) {
    score1 = score1 - 1;
    display1(score1);
}
        else
        return;
    }
    public void Reset1(View view) {
        score1 = 0 ;
        display1(score1);
    }
    private void display(int number) {
        TextView scoreTextView = (TextView) findViewById(
                R.id.Score_text_view);

        scoreTextView.setText("" + number);

    }
    private void display1(int number) {

        TextView score1TextView = (TextView) findViewById(
                R.id.Score1_text_view);

        score1TextView.setText("" + number);
    }

}