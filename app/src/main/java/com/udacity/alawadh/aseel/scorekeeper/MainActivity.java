package com.udacity.alawadh.aseel.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaration variables to counts
    public int scoreMadrid = 0;
    public int scoreBarcelona = 0;
    public int foulMadrid = 0;
    public int foulBarcelona = 0;

    // Declaration objects of TextView
    public TextView scoreViewMadrid;
    public TextView scoreViewBarcelona;
    public TextView foulViewBMadrid;
    public TextView foulViewBarcelona;

    // Declaration keys to save and delete states of rotate
    private static final String SCORRE_MADRID_TAG = "SCORRE_MADRID_TAG";
    private static final String SCORRE_BARCELONA_TAG = "SCORRE_BARCELONA_TAG";
    private static final String FOUL_MADRID_TAG = "FOUL_MADRID_TAG";
    private static final String FOUL_BARCELONA_TAG = "FOUL_BARCELONA_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.scoreViewMadrid = findViewById(R.id.score_madrid);
        this.displayForMadrid(scoreMadrid);
        this.scoreViewBarcelona = findViewById(R.id.score_barcelona);
        this.displayForBarcelona(this.scoreBarcelona);
        this.foulViewBMadrid = findViewById(R.id.foul_madrid);
        this.displayFoulForMadrid(this.foulMadrid);
        this.foulViewBarcelona = findViewById(R.id.foul_barcelona);
        this.displayFoulForBarcelona(this.foulBarcelona);
    }

    // This method will help to save the state of vars before rotation
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORRE_MADRID_TAG, scoreMadrid);
        outState.putInt(SCORRE_BARCELONA_TAG, scoreBarcelona);
        outState.putInt(FOUL_MADRID_TAG, foulMadrid);
        outState.putInt(FOUL_BARCELONA_TAG, foulBarcelona);
    }

    // This method will help to retrieve values for vars
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        this.scoreMadrid = savedInstanceState.getInt(SCORRE_MADRID_TAG);
        this.scoreBarcelona = savedInstanceState.getInt(SCORRE_BARCELONA_TAG);
        this.foulMadrid = savedInstanceState.getInt(FOUL_MADRID_TAG);
        this.foulBarcelona = savedInstanceState.getInt(FOUL_BARCELONA_TAG);
        this.displayForBarcelona(this.scoreBarcelona);
        this.displayFoulForBarcelona(this.foulBarcelona);
        this.displayForMadrid(this.scoreMadrid);
        this.displayFoulForMadrid(this.foulMadrid);
    }


    public void addOneForTeamMadrid(View v) {
        this.scoreMadrid = scoreMadrid + 1;
        displayForMadrid(scoreMadrid);
    }

    public void addFoulForTeamMadrid(View v) {
        this.foulMadrid = foulMadrid + 1;
        displayFoulForMadrid(foulMadrid);
    }

    public void addOneForTeamBarcelona(View v) {
        this.scoreBarcelona = scoreBarcelona + 1;
        displayForBarcelona(scoreBarcelona);
    }

    public void addFoulForTeamBarcelona(View v) {
        this.foulBarcelona = foulBarcelona + 1;
        displayFoulForBarcelona(foulBarcelona);
    }

    public void Rest(View v) {
        this.scoreMadrid = 0;
        this.scoreBarcelona = 0;
        this.foulMadrid = 0;
        this.foulBarcelona = 0;
        this.displayForBarcelona(this.scoreBarcelona);
        this.displayFoulForBarcelona(this.foulBarcelona);
        this.displayForMadrid(this.scoreMadrid);
        this.displayFoulForMadrid(this.foulMadrid);
    }

    public void displayForMadrid(int score) {

        this.scoreViewMadrid.setText(String.valueOf(score));
    }

    public void displayFoulForMadrid(int score) {

        this.foulViewBMadrid.setText(String.valueOf(score));
    }

    public void displayForBarcelona(int score) {

        this.scoreViewBarcelona.setText(String.valueOf(score));
    }

    public void displayFoulForBarcelona(int score) {

        this.foulViewBarcelona.setText(String.valueOf(score));
    }


}
