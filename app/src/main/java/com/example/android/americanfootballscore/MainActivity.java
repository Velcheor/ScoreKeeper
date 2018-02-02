package com.example.android.americanfootballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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


    public void addTouchDownForTeamA(View view) {
        score_a_team = score_a_team + 6;
        mCountA = 1;
        displayForTeam(score_a_team, R.id.team_a_score);
    }

    public void addTwoForTeamA(View view) {
        if (mCountA == 1) {
            score_a_team = score_a_team + 2;
            displayForTeam(score_a_team, R.id.team_a_score);
            mCountA = 0;
        }
    }

    public void addPatForTeamA(View view) {
        if (mCountA == 1) {
            score_a_team = score_a_team + 1;
            displayForTeam(score_a_team, R.id.team_a_score);
            mCountA = 0;
        }
    }

    public void addFieldGoalForTeamA(View view) {
        score_a_team = score_a_team + 3;
        displayForTeam(score_a_team, R.id.team_a_score);
        mCountA = 0;
    }

    public void addSafetyForTeamA(View view) {
        score_a_team = score_a_team + 2;
        displayForTeam(score_a_team, R.id.team_a_score);
        mCountA = 0;
    }

    public void resetScore(View view) {
        score_a_team = 0;
        score_b_team = 0;
        displayForTeam(score_a_team, R.id.team_a_score);
        displayForTeam(score_b_team, R.id.team_b_score);
    }

    public void addTouchDownForTeamB(View view) {
        score_b_team = score_b_team + 6;
        mCountB = 1;
        displayForTeam(score_b_team, R.id.team_b_score);
    }

    public void addTwoForTeamB(View view) {
        if (mCountB == 1) {
            score_b_team = score_b_team + 2;
            displayForTeam(score_b_team, R.id.team_b_score);
            mCountB = 0;
        }
    }

    public void addPatForTeamB(View view) {
        if (mCountB == 1) {
            score_b_team = score_b_team + 1;
            displayForTeam(score_b_team, R.id.team_b_score);
            mCountB = 0;
        }
    }

    public void addFieldGoalForTeamB(View view) {
        score_b_team = score_b_team + 3;
        displayForTeam(score_b_team, R.id.team_b_score);
        mCountB = 0;
    }

    public void addSafetyForTeamB(View view) {
        score_b_team = score_b_team + 2;
        displayForTeam(score_b_team, R.id.team_b_score);
        mCountB = 0;
    }
}
