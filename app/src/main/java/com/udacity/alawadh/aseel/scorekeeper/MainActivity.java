package com.udacity.alawadh.aseel.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreMadrid = 0;
    int scoreBarcelona = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamMadrid(View v) {
        scoreMadrid = scoreMadrid + 1;
         displayForMadrid(scoreMadrid);
    }

    public void addOneForTeamBarcelona(View v) {
        scoreBarcelona = scoreBarcelona + 1;
        displayForBarcelona(scoreBarcelona);
    }

    public void Rest(View v) {
        displayForMadrid(0);
        displayForBarcelona(0);
    }

    public void displayForMadrid(int score) {
        TextView scoreView = findViewById(R.id.score_madrid);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBarcelona(int score) {
        TextView scoreView = findViewById(R.id.score_barcelona);
        scoreView.setText(String.valueOf(score));
    }


}
