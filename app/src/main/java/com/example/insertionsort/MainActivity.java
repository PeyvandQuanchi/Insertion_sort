package com.example.insertionsort;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //estefade az an dar kod haye digar
    public static int[] numbers = new int[6];



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sortButton = (Button) findViewById(R.id.sortButton);
        sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //tarife moteghayer ha
                EditText NumEditText1 = (EditText) findViewById(R.id.numEdit1);
                EditText NumEditText2 = (EditText) findViewById(R.id.numEdit2);
                EditText NumEditText3 = (EditText) findViewById(R.id.numEdit3);
                EditText NumEditText4 = (EditText) findViewById(R.id.numEdit4);
                EditText NumEditText5 = (EditText) findViewById(R.id.numEdit5);
                EditText NumEditText6 = (EditText) findViewById(R.id.numEdit6);






                int temp = 0;
                //meghdar dehi bar asase vorudiye karbar
                numbers[0] = Integer.parseInt(NumEditText1.getText().toString());
                numbers[1] = Integer.parseInt(NumEditText2.getText().toString());
                numbers[2] = Integer.parseInt(NumEditText3.getText().toString());
                numbers[3] = Integer.parseInt(NumEditText4.getText().toString());
                numbers[4] = Integer.parseInt(NumEditText5.getText().toString());
                numbers[5] = Integer.parseInt(NumEditText6.getText().toString());

                openCheckRotation();





            }

        });


    }
    public void openCheckRotation(){
        Intent intent = new Intent(this,checkRotation.class);
        startActivity(intent);
    }
}