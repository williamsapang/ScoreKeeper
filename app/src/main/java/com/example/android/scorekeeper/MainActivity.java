package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreJuventus = 0;
    int scoreBarcelona = 0;
    int kartuKuningJuventus = 0;
    int kartuMerahJuventus = 0;
    int kartuKuningBarcelona = 0;
    int kartuMerahBarcelona = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goalJuventus(View view) {
        scoreJuventus = scoreJuventus + 1;
        displayForJuve(scoreJuventus);
    }

    private void displayForJuve(int scoreJuventus) {
        TextView scoreJuventusView = (TextView) findViewById(R.id.score_juventus);
        scoreJuventusView.setText("" + scoreJuventus);
    }

    public void goalBarcelona(View view) {
        scoreBarcelona = scoreBarcelona + 1;
        displayForBarca(scoreBarcelona);
    }

    private void displayForBarca(int scoreBarcelona) {
        TextView scoreBarcelonaView = (TextView) findViewById(R.id.score_barcelona);
        scoreBarcelonaView.setText("" + scoreBarcelona);
    }


    public void yellowJuventus(View view) {
        kartuKuningJuventus = kartuKuningJuventus + 1;
        displayForKuningJuve(kartuKuningJuventus);
    }

    private void displayForKuningJuve(int kartuKuningJuventus) {
        TextView kartuKuningJuventusView = (TextView) findViewById(R.id.kuning_juventus);
        kartuKuningJuventusView.setText("" + kartuKuningJuventus);
    }


    public void redJuventus(View view) {
        kartuMerahJuventus = kartuMerahJuventus + 1;
        displayForMerahJuve(kartuMerahJuventus);
    }

    private void displayForMerahJuve(int kartuMerahJuventus) {
        TextView kartuMerahJuventusView = (TextView) findViewById(R.id.merah_juventus);
        kartuMerahJuventusView.setText("" + kartuMerahJuventus);
    }

    public void yellowBarcelona(View view) {
        kartuKuningBarcelona = kartuKuningBarcelona + 1;
        displayForKuningBarca(kartuKuningBarcelona);
    }

    private void displayForKuningBarca(int kartuKuningBarcelona) {
        TextView kartuKuningBarcelonaView = (TextView) findViewById(R.id.kuning_barcelona);
        kartuKuningBarcelonaView.setText("" + kartuKuningBarcelona);
    }

    public void redBarcelona(View view) {
        kartuMerahBarcelona = kartuMerahBarcelona + 1;
        displayForMerahBarca(kartuMerahBarcelona);
    }

    private void displayForMerahBarca(int kartuMerahBarcelona) {
        TextView kartuMerahBarcelonaView = (TextView) findViewById(R.id.merah_barcelona);
        kartuMerahBarcelonaView.setText("" + kartuMerahBarcelona);
    }

    public void resetButton(View view) {
        scoreJuventus = 0;
        scoreBarcelona = 0;
        displayForJuve(0);
        displayForBarca(0);
        displayForKuningJuve(0);
        displayForKuningBarca(0);
        displayForMerahJuve(0);
        displayForMerahBarca(0);
    }
}
