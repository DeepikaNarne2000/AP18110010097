package com.example.gameszo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class FishInstructionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fish_instruction);

        TextView tv1 = findViewById(R.id.instruction);
        TextView tv3 = findViewById(R.id.help);
        tv1.setText("1.Fight with gravity and get as many as Blue balls and YELLOW balls.");
        tv3.setText("1.Focus on the gravity and blue and yellow balls.");


        findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FishInstructionActivity.this, FishActivity.class));
            }
        });

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FishInstructionActivity.this, MainActivity.class));
            }
        });
    }
}