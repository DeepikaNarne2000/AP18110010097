package com.example.gameszo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private Button StartGameAgain;

    private TextView DisplayScore;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_over);

        score = getIntent().getExtras().get("score").toString();

        StartGameAgain = (Button) findViewById(R.id.replay);
        DisplayScore = (TextView) findViewById(R.id.displayScore);


        StartGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainIntent = new Intent(GameOverActivity.this, FishActivity.class);
                startActivity(mainIntent);
            }
        });

        findViewById(R.id.home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GameOverActivity.this, MainActivity.class));
            }
        });

        DisplayScore.setText("Score= " + score);
    }
}