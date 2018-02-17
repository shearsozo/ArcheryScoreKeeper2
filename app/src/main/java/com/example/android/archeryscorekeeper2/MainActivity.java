package com.example.android.archeryscorekeeper2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.archeryscorekeeper2.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    /**
     * score track for team A
     */
    int scoreTeamA = 0;
    /**
     * score track for team B
     */
    int scoreTeamB = 0;
    /**
     * missed arrow count for team A
     */
    int missedCountTeamA = 0;
    /**
     * missed arrow count for team B
     */
    int missedCountTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayMissedCountTeamA(0);
        displayForTeamB(0);
        displayMissedCountTeamB(0);

    }
    /**
     * increase score by 10 for Team A
     */
    public void addTenForTeamA(View v) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase score by 7 for Team A
     */
    public void addSevenForTeamA(View v) {
        scoreTeamA = scoreTeamA + 7;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase score by 5 for Team A
     */
    public void addFiveForTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase score by 3 for Team A
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * increase score by 1 for Team A
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * decrease score by 1 for Team A
     */
    public void subtractOneForTeamA(View v) {
        scoreTeamA = scoreTeamA - 1;
        missedCountTeamA = missedCountTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayMissedCountTeamA(missedCountTeamA);
    }

    /**
     * display the given count for missed arrows for Team A
     */
    public void displayMissedCountTeamA(int count)
    {
        TextView scoreView = (TextView) findViewById(R.id.missedCountTeamA);
        scoreView.setText(String.valueOf(count));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * increase score by 10 for Team B
     */
    public void addTenForTeamB(View v) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase score by 7 for Team B
     */
    public void addSevenForTeamB(View v) {
        scoreTeamB = scoreTeamB + 7;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase score by 5 for Team B
     */
    public void addFiveForTeamB(View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase score by 3 for Team B
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * increase score by 1 for Team B
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * decrease score by 1 for Team A
     */
    public void subtractOneForTeamB(View v) {
        scoreTeamB = scoreTeamB - 1;
        missedCountTeamB = missedCountTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayMissedCountTeamB(missedCountTeamB);
    }

    /**
     * display the given count for missed arrows for Team B
     */
    public void displayMissedCountTeamB(int count)
    {
        TextView scoreView = (TextView) findViewById(R.id.missedCountTeamB);
        scoreView.setText(String.valueOf(count));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * reset both team score to zero
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
