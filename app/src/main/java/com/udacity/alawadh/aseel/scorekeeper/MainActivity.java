package com.udacity.alawadh.aseel.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreMadrid = 0;
    int scoreBarcelona = 0;
    int foulMadrid = 0;
    int foulBarcelona = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamMadrid(View v) {
        scoreMadrid = scoreMadrid + 1;
         displayForMadrid(scoreMadrid);
    }
    public void addFoulForTeamMadrid(View v) {
        foulMadrid = foulMadrid + 1;
        displayFoulForMadrid(foulMadrid);

    }

    public void addOneForTeamBarcelona(View v) {
        scoreBarcelona = scoreBarcelona + 1;
        displayForBarcelona(scoreBarcelona);
    }

    public void addFoulForTeamBarcelona(View v) {
        foulBarcelona = foulBarcelona+ 1;
        displayFoulForBarcelona(foulBarcelona);
    }

    public void Rest(View v) {
        displayForMadrid(0);
        displayFoulForMadrid(0);
        displayForBarcelona(0);
        displayFoulForBarcelona(0);
    }

    public void displayForMadrid(int score) {
        TextView scoreView = findViewById(R.id.score_madrid);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForMadrid(int score) {
        TextView scoreView = findViewById(R.id.foul_madrid);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBarcelona(int score) {
        TextView scoreView = findViewById(R.id.score_barcelona);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForBarcelona(int score) {
        TextView scoreView = findViewById(R.id.foul_barcelona);
        scoreView.setText(String.valueOf(score));
    }


}
