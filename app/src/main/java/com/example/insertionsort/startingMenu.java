package com.example.insertionsort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startingMenu extends AppCompatActivity {

    @Override
    //moghe sakht run mishavand
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_menu);
        //tarife moteghayer ha
        Button startBtn = (Button) findViewById(R.id.startBtn);
        Button aboutBtn = (Button) findViewById(R.id.aboutBtn);
        Button exitBtn = (Button) findViewById(R.id.exitBtn);
        // moghe zade shodane dokme tavvasote karbar
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutActivity();
            }
        });
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
                finish();
            }
        });
    }
    public void openMainActivity(){
        // az yek activity be yek activitie dige mire
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void openAboutActivity(){
        Intent intent = new Intent(this,aboutActivity.class);
        startActivity(intent);
    }
}