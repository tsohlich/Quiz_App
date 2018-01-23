package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    /*
      Methods to start new activity
    */
    public void btnFlags(View view) {
        startActivity(new Intent(Start.this, FlagQuiz.class));
    }

    public void btnSounds(View view) {
        startActivity(new Intent(Start.this, SoundQuiz.class));
    }
}
