package com.example.login_register_pages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        String s =getIntent().getStringExtra("mydata");
        TextView tv = findViewById(R.id.welcome);
        tv.setText("Welcome "+s+"!");
    }
}