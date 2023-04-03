package com.example.quizapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        int score = getIntent().getIntExtra("score",0);
        TextView textView = findViewById(R.id.total_score);
        textView.setText("Total Score :" +score);
    }
}
