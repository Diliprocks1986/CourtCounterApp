package com.dilip_pashi.courtcounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {
    TextView CB,BC,ChicagoBulls,BostonCeltics;
    // Tracks the score for Team Chicago Bulls
    int scoreTeamCB = 0;

    // Tracks the score for Team Boston Celtics
    int scoreTeamBC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ChicagoBulls = (TextView) findViewById(R.id.ChicagoBulls);
       CB = (TextView) findViewById(R.id.team_CB_score);
       BostonCeltics = (TextView) findViewById(R.id.BostonCeltics);
       BC = (TextView) findViewById(R.id.team_BC_score);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team Chicago Bulls by 1 point.
     */
    public void addOneForTeamCB(View v) {
        scoreTeamCB = scoreTeamCB + 1;
        displayForTeamCB(scoreTeamCB);
    }

    /**
     * Increase the score for Team Chicago Bulls by 2 points.
     */
    public void addTwoForTeamCB(View v) {
        scoreTeamCB = scoreTeamCB + 2;
        displayForTeamCB(scoreTeamCB);
    }

    /**
     * Increase the score for Team Chicago Bulls by 3 points.
     */
    public void addThreeForTeamCB(View v) {
        scoreTeamCB = scoreTeamCB + 3;
        displayForTeamCB(scoreTeamCB);
    }

    /**
     * Increase the score for Team Boston Celtics by 1 point.
     */
    public void addOneForTeamBC(View v) {
        scoreTeamBC = scoreTeamBC + 1;
        displayForTeamBC(scoreTeamBC);
    }

    /**
     * Increase the score for Team Boston Celtics by 2 points.
     */
    public void addTwoForTeamBC(View v) {
        scoreTeamBC = scoreTeamBC + 2;
        displayForTeamBC(scoreTeamBC);
    }

    /**
     * Increase the score for Team Boston Celtics by 3 points.
     */
    public void addThreeForTeamBC(View v) {
        scoreTeamBC = scoreTeamBC + 3;
        displayForTeamBC(scoreTeamBC);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamCB = 0;
        scoreTeamBC = 0;
        CB.setTextColor(BLACK);
        ChicagoBulls.setTextColor(BLACK);
        BC.setTextColor(BLACK);
        BostonCeltics.setTextColor(BLACK);
        displayForTeamCB(scoreTeamCB);
        displayForTeamBC(scoreTeamBC);

    }
    /**
     * Decide which team has win the game.
     */
    public void submitScore(View v) {
        if (scoreTeamCB > scoreTeamBC) {
            CB.setTextColor(GREEN);
            ChicagoBulls.setTextColor(GREEN);
            BC.setTextColor(RED);
            BostonCeltics.setTextColor(RED);
        } else if (scoreTeamCB < scoreTeamBC) {
            CB.setTextColor(RED);
            ChicagoBulls.setTextColor(RED);
            BC.setTextColor(GREEN);
            BostonCeltics.setTextColor(GREEN);
        } else if (scoreTeamCB == scoreTeamBC) {
            CB.setTextColor(BLACK);
            ChicagoBulls.setTextColor(BLACK);
            BC.setTextColor(BLACK);
            BostonCeltics.setTextColor(BLACK);
        }
    }


    /**
     * Displays the given score for Team Chicago Bulls.
     */
    public void displayForTeamCB(int score) {
        CB.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team Boston Celtics.
     */
    public void displayForTeamBC(int score) {
        BC.setText(String.valueOf(score));
    }
}