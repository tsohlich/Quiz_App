package com.example.android.quizapp;

import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.lang.reflect.Method;


public class SoundQuiz extends AppCompatActivity {
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_quiz);
        new AlertDialog.Builder(this)
                .setMessage("Click on the speaker to listen to the sound and answer the questions.")
                .setPositiveButton("OK", null)
                .show();
    }

    //Methods to check answers in SoundQuiz

    public void checkAnswerOneSound() {
        RadioGroup ans1 = findViewById(R.id.radio_gr_q1);
        int radioButtonId = ans1.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a4_q1) {
            points++;
        }
    }

    public void checkAnswerTwoSound() {
        RadioGroup ans2 = findViewById(R.id.radio_gr_q2);
        int radioButtonId = ans2.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a2_q2) {
            points++;
        }
    }

    public void checkAnswerThreeSound() {
        RadioGroup ans3 = findViewById(R.id.radio_gr_q3);
        int radioButtonId = ans3.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a4_q3) {
            points++;
        }
    }

    public void checkAnswerFourSound() {
        RadioGroup ans4 = findViewById(R.id.radio_gr_q4);
        int radioButtonId = ans4.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a4_q4) {
            points++;
        }
    }

    public void checkAnswerFiveSound() {
        RadioGroup ans5 = findViewById(R.id.radio_gr_q5);
        int radioButtonId = ans5.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a1_q5) {
            points++;
        }
    }

    public void checkAnswerSixSound() {
        RadioGroup ans6 = findViewById(R.id.radio_gr_q6);
        int radioButtonId = ans6.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a1_q6) {
            points++;
        }
    }

    public void checkAnswerSevenSound() {
        RadioGroup ans7 = findViewById(R.id.radio_gr_q7);
        int radioButtonId = ans7.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a3_q7) {
            points++;
        }
    }

    public void checkAnswerEightSound() {
        RadioGroup ans8 = findViewById(R.id.radio_gr_q8);
        int radioButtonId = ans8.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a1_q8) {
            points++;
        }
    }

    public void checkAnswerNineSound() {
        RadioGroup ans9 = findViewById(R.id.radio_gr_q9);
        int radioButtonId = ans9.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a1_q9) {
            points++;
        }
    }

    public void checkAnswerTenSound() {
        RadioGroup ans10 = findViewById(R.id.radio_gr_q10);
        int radioButtonId = ans10.getCheckedRadioButtonId();

        if (radioButtonId == R.id.a1_q10) {
            points++;
        }
    }


    //Methods to play sounds in SoundQuiz

    public void playGuitar(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.guitar);
        mediaPlayer.start();
    }

    public void playPiano(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.piano);
        mediaPlayer.start();
    }

    public void playViolin(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.violin);
        mediaPlayer.start();
    }

    public void playDrum(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.drum);
        mediaPlayer.start();
    }

    public void playAccordion(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.accordion);
        mediaPlayer.start();
    }

    public void playHarmonica(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.harmonica);
        mediaPlayer.start();
    }

    public void playSaxophone(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.saxophone);
        mediaPlayer.start();
    }

    public void playTrumpet(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.trumpet);
        mediaPlayer.start();
    }

    public void playTriangle(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.triangle);
        mediaPlayer.start();
    }

    public void playCimbalom(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cimbalom);
        mediaPlayer.start();
    }

    /*
    // Method which calls countPointsSoundQuiz methods to count points and display result
    */
    public void checkAnswers(View view) {
        String player;
        String quantity;
        points = 0;
        countPointsSoundQuiz();
        /*
        //method to set variable player name or "anonymous" as a player name
        */
        boolean checked = ((CheckBox) findViewById(R.id.nickname_sound)).isChecked();

        if (checked == true) {
            player = "Anonymous";
        } else {
            player = ((EditText) findViewById(R.id.player_name)).getText().toString();
        }
        /*
        //method to show toast message with result
        */
        if (points > 1) {
            quantity = " points!";
        } else {
            quantity = " point!";
        }
        Toast.makeText(SoundQuiz.this, player + ", your score is: " + points + quantity, Toast.LENGTH_LONG).show();
    }

    /*
    // Method to count points
    */
    private void countPointsSoundQuiz() {
        checkAnswerOneSound();
        checkAnswerTwoSound();
        checkAnswerThreeSound();
        checkAnswerFourSound();
        checkAnswerFiveSound();
        checkAnswerSixSound();
        checkAnswerSevenSound();
        checkAnswerEightSound();
        checkAnswerNineSound();
        checkAnswerTenSound();
    }
}
