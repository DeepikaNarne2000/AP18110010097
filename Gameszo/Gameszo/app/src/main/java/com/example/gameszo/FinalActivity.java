package com.example.gameszo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_final);


        findViewById(R.id.replay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FinalActivity.this, GameActivity.class));
            }
        });

        findViewById(R.id.home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FinalActivity.this, MainActivity.class));
            }
        });

        TextView highScoreTxt = findViewById(R.id.highscore);
        TextView ScoreTxt = findViewById(R.id.score);

        final SharedPreferences prefs = getSharedPreferences("game", MODE_PRIVATE);
        highScoreTxt.setText("HighScore: " + prefs.getInt("highscore", 0));

        final SharedPreferences sharedPreferences = getSharedPreferences("score", MODE_PRIVATE);
        ScoreTxt.setText("Score: " + prefs.getInt("score", 0));

        if (prefs.contains("highscore")) {
            int highscore = prefs.getInt("highscore", 0);
            int score = prefs.getInt("score", 0);
            TextView tv = findViewById(R.id.msgTxt);
            if (highscore > score) {
                tv.setText("OOPS!You lost");
            } else {
                tv.setText("New High score");
            }
        }

    }
}