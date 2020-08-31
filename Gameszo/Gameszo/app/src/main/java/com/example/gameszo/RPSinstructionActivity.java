package com.example.gameszo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RPSinstructionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_p_sinstruction);
        TextView tv1 = findViewById(R.id.instruction);
        TextView tv2 = findViewById(R.id.rules);
        TextView tv3 = findViewById(R.id.help);
        tv1.setText("Just click on the button that you want to choose...winning depends on opp choice.");
        tv2.setText("1.If u choose Rock ,you will win if computer choice is paper and lose if computer choice is scissor.\n 2.If u choose Paper ,you will win if computer choice is Rock and lose if computer choice is Scissor.\n 3.If u choose Scissor ,you will win if computer choice is Paper and lose if computer choice is Rock.");
        tv3.setText("Believe in luck.");

        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RPSinstructionActivity.this, RpsActivity.class));
            }
        });

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RPSinstructionActivity.this, MainActivity.class));
            }
        });
    }
}