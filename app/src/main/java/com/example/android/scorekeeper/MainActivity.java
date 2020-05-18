package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void touchDownA(View v) {
        scoreA = scoreA + 6;
        displayScoreTeamA(scoreA);
        Toast.makeText(this, "Hurrayy ! +6 to Team A", Toast.LENGTH_LONG).show();
    }

    public void touchDownB(View v) {
        scoreB = scoreB + 6;
        displayScoreTeamB(scoreB);
        Toast.makeText(this, "Hurrayy ! +6 to Team B", Toast.LENGTH_LONG).show();

    }

    public void fieldGoalA(View v) {
        scoreA = scoreA + 3;
        displayScoreTeamA(scoreA);
        Toast.makeText(this, "+3 to Team A", Toast.LENGTH_LONG).show();

    }

    public void fieldGoalB(View v) {
        scoreB = scoreB + 3;
        displayScoreTeamB(scoreB);
        Toast.makeText(this, "+3 to Team B", Toast.LENGTH_LONG).show();

    }

    public void safetyA(View v) {
        scoreA = scoreA + 2;
        displayScoreTeamA(scoreA);
        Toast.makeText(this, "+2 to Team A", Toast.LENGTH_LONG).show();

    }

    public void safetyB(View v) {
        scoreB = scoreB + 2;
        displayScoreTeamB(scoreB);
        Toast.makeText(this, "+2 to Team B", Toast.LENGTH_LONG).show();
    }

    public void aExtraPoint1(View v) {
        scoreA = scoreA + 1;
        displayScoreTeamA(scoreA);
        Toast.makeText(this, "+1 to Team A", Toast.LENGTH_LONG).show();
    }

    public void bExtraPoint1(View v) {
        scoreB = scoreB + 1;
        displayScoreTeamB(scoreB);
        Toast.makeText(this, "+1 to Team B", Toast.LENGTH_LONG).show();
    }

    public void aExtraPoint2(View v) {
        scoreA = scoreA + 2;
        displayScoreTeamA(scoreA);
        Toast.makeText(this, "+2 to Team A", Toast.LENGTH_LONG).show();
    }

    public void bExtraPoint2(View v) {
        scoreB = scoreB + 2;
        displayScoreTeamB(scoreB);
        Toast.makeText(this, "+2 to Team B", Toast.LENGTH_LONG).show();
    }

    public void displayScoreTeamA(int score) {
        TextView scoreTeamA = (TextView) findViewById(R.id.score_team1);
        scoreTeamA.setText(String.valueOf(score));

    }

    public void displayScoreTeamB(int score) {
        TextView scoreTeamB = (TextView) findViewById(R.id.score_team2);
        scoreTeamB.setText(String.valueOf(score));
    }

    public void resetGame(View v) {
        scoreA = 0;
        scoreB = 0;
        displayScoreTeamA(scoreA);
        displayScoreTeamB(scoreB);
        Toast.makeText(this, "Game is Reset", Toast.LENGTH_LONG).show();
    }
}
