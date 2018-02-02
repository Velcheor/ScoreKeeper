package com.example.android.americanfootballscore;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a_team, score_b_team, mCountA, mCountB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            score_a_team = savedInstanceState.getInt("score_a");
            score_b_team = savedInstanceState.getInt("score_b");
        }
        displayForTeam(score_a_team, R.id.team_a_score);
        displayForTeam(score_b_team, R.id.team_b_score);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score_a", score_a_team);
        outState.putInt("score_b", score_b_team);
    }

    private void displayForTeam(int score, int id){
        TextView scoreText = findViewById(id);
        scoreText.setText(String.valueOf(score));
    }

    private void textColorForTeamA(){
        Button twoPointAButton = findViewById(R.id.twoPointButtonA);
        Button patButtonA = findViewById(R.id.patButtonA);
        if (mCountA == 1){
            twoPointAButton.setTextColor(Color.parseColor("#000000"));
            patButtonA.setTextColor(Color.parseColor("#000000"));
        } else {
            twoPointAButton.setTextColor(Color.parseColor("#9E9E9E"));
            patButtonA.setTextColor(Color.parseColor("#9E9E9E"));
        }
    }

    private void textColorForTeamB(){
        Button twoPointBButton = findViewById(R.id.twoPointButtonB);
        Button patButtonB = findViewById(R.id.patButtonB);
        if (mCountA == 1){
            twoPointBButton.setTextColor(Color.parseColor("#000000"));
            patButtonB.setTextColor(Color.parseColor("#000000"));
        } else {
            twoPointBButton.setTextColor(Color.parseColor("#9E9E9E"));
            patButtonB.setTextColor(Color.parseColor("#9E9E9E"));
        }
    }

    public void addTouchDownForTeamA(View view) {
        score_a_team = score_a_team + 6;
        mCountA = 1;
        textColorForTeamA();
        displayForTeam(score_a_team, R.id.team_a_score);
    }

    public void addTwoForTeamA(View view) {
        if (mCountA == 1) {
            score_a_team = score_a_team + 2;
            displayForTeam(score_a_team, R.id.team_a_score);
            mCountA = 0;
            textColorForTeamA();
        }
    }

    public void addPatForTeamA(View view) {
        if (mCountA == 1) {
            score_a_team = score_a_team + 1;
            displayForTeam(score_a_team, R.id.team_a_score);
            mCountA = 0;
            textColorForTeamA();
        }
    }

    public void addFieldGoalForTeamA(View view) {
        score_a_team = score_a_team + 3;
        displayForTeam(score_a_team, R.id.team_a_score);
        mCountA = 0;
        textColorForTeamA();
    }

    public void addSafetyForTeamA(View view) {
        score_a_team = score_a_team + 2;
        displayForTeam(score_a_team, R.id.team_a_score);
        mCountA = 0;
        textColorForTeamA();
    }

    public void resetScore(View view) {
        score_a_team = 0;
        score_b_team = 0;
        mCountA = 0;
        mCountB = 0;
        textColorForTeamA();
        textColorForTeamB();
        displayForTeam(score_a_team, R.id.team_a_score);
        displayForTeam(score_b_team, R.id.team_b_score);
    }

    public void addTouchDownForTeamB(View view) {
        score_b_team = score_b_team + 6;
        mCountB = 1;
        textColorForTeamB();
        displayForTeam(score_b_team, R.id.team_b_score);
    }

    public void addTwoForTeamB(View view) {
        if (mCountB == 1) {
            score_b_team = score_b_team + 2;
            displayForTeam(score_b_team, R.id.team_b_score);
            mCountB = 0;
            textColorForTeamB();
        }
    }

    public void addPatForTeamB(View view) {
        if (mCountB == 1) {
            score_b_team = score_b_team + 1;
            displayForTeam(score_b_team, R.id.team_b_score);
            mCountB = 0;
            textColorForTeamB();
        }
    }

    public void addFieldGoalForTeamB(View view) {
        score_b_team = score_b_team + 3;
        displayForTeam(score_b_team, R.id.team_b_score);
        mCountB = 0;
        textColorForTeamB();
    }

    public void addSafetyForTeamB(View view) {
        score_b_team = score_b_team + 2;
        displayForTeam(score_b_team, R.id.team_b_score);
        mCountB = 0;
        textColorForTeamB();
    }
}
