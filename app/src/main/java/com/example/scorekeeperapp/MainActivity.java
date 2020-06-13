package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Member variables
    TextView scoreTeam1;
    TextView scoreTeam2;
    Button goalTeam1;
    Button goalTeam2;
    int score1 = 0;
    int score2 = 0;
    Button resetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeam1 = findViewById(R.id.scoreTeam1);
        scoreTeam2 = findViewById(R.id.scoreTeam2);
        goalTeam1 = findViewById(R.id.goalTeam1);
        goalTeam2 = findViewById(R.id.goalTeam2);
        resetButton = findViewById(R.id.resetButton);


        goalTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1++;
                 scoreTeam1.setText(String.valueOf(score1));

            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetMethod();
            }
        });


        goalTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score2++;
                scoreTeam2.setText(String.valueOf(score2));

            }
        });
    }

    private void resetMethod() {
        score1 = 0;
        score2 = 0;

        scoreTeam1.setText("0");
        scoreTeam2.setText("0");
    }
}
