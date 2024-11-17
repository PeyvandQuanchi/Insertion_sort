package com.example.insertionsort;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class checkRotation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_rotation);
        //check kardane charkheshe gooshi
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            openResults();
        }

    }
    public void openResults(){
        //raftan be activity digar
        Intent intent = new Intent(this,Results.class);
        startActivity(intent);
    }

}