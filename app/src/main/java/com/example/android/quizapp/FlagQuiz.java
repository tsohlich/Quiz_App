package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FlagQuiz extends AppCompatActivity {
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_quiz);
    }

    // methods to check every single question
    public void checkAnswerOne() {
        RadioGroup ans1 = findViewById(R.id.radio_gr_q1);
        int radioButtonId = ans1.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a2_q1) {
            points++;
        }
    }

    public void checkAnswerTwo() {
        RadioGroup ans2 = findViewById(R.id.radio_gr_q2);
        int radioButtonId = ans2.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a1_q2) {
            points++;
        }
    }

    public void checkAnswerThree() {
        RadioGroup ans3 = findViewById(R.id.radio_gr_q3);
        int radioButtonId = ans3.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a2_q3) {
            points++;
        }
    }

    public void checkAnswerFour() {
        RadioGroup ans4 = findViewById(R.id.radio_gr_q4);
        int radioButtonId = ans4.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a2_q4) {
            points++;
        }
    }

    public void checkAnswerFive() {
        RadioGroup ans5 = findViewById(R.id.radio_gr_q5);
        int radioButtonId = ans5.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a1_q5) {
            points++;
        }
    }

    public void checkAnswerSix() {
        RadioGroup ans6 = findViewById(R.id.radio_gr_q6);
        int radioButtonId = ans6.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a4_q6) {
            points++;
        }
    }

    public void checkAnswerSeven() {
        RadioGroup ans7 = findViewById(R.id.radio_gr_q7);
        int radioButtonId = ans7.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a1_q7) {
            points++;
        }
    }

    public void checkAnswerEight() {
        RadioGroup ans8 = findViewById(R.id.radio_gr_q8);
        int radioButtonId = ans8.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a3_q8) {
            points++;
        }
    }

    public void checkAnswerNine() {
        RadioGroup ans9 = findViewById(R.id.radio_gr_q9);
        int radioButtonId = ans9.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a3_q9) {
            points++;
        }
    }

    public void checkAnswerTen() {
        RadioGroup ans10 = findViewById(R.id.radio_gr_q10);
        int radioButtonId = ans10.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a4_q10) {
            points++;
        }
    }

    //method to display results
    public void displayResult(View view){
        countPoints();
        String quantity;
        String player;
        boolean checked = ((CheckBox) findViewById(R.id.nickname)).isChecked();

        if (checked == true) {
            player = "Anonymous";
        } else {
            player = ((EditText) findViewById(R.id.name)).getText().toString();
        }
        /*
        method to show toast message with result
        */
        if (points > 1) {
            quantity = " points!";
        } else {
            quantity = " point!";
        }
        Toast.makeText(FlagQuiz.this, player + ", your score is: " + points + quantity, Toast.LENGTH_LONG).show();
    }

    /*
    method to check results and count points
    */
    public void countPoints() {
        points = 0;
        checkAnswerOne();
        checkAnswerTwo();
        checkAnswerThree();
        checkAnswerFour();
        checkAnswerFive();
        checkAnswerSix();
        checkAnswerSeven();
        checkAnswerEight();
        checkAnswerNine();
        checkAnswerTen();
    }
}
