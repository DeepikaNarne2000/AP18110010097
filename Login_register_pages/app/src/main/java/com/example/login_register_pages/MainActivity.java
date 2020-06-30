package com.example.login_register_pages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.email);
        et2 = findViewById(R.id.pass);
    }
    public void submit(View view) {
        String data = et1.getText().toString();
        String pass = et2.getText().toString();
        if(data.isEmpty() && pass.isEmpty()){
            Toast.makeText(this, "Enter Email ID and Password", Toast.LENGTH_SHORT).show();
        }
        else if(data.isEmpty()){
            Toast.makeText(this, "Enter Email ID", Toast.LENGTH_SHORT).show();
        }
        else if(pass.isEmpty()){
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(MainActivity.this, Welcome.class);
            i.putExtra("mydata", data);
            i.putExtra("mypassword",pass);
            startActivity(i);
        }
    }
    public void register(View view){
        Intent i=new Intent(MainActivity.this,Register.class);
        startActivity(i);
    }

}