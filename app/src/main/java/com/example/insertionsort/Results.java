package com.example.insertionsort;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import org.w3c.dom.Text;


public class Results extends AppCompatActivity {

public SortedArrayList sortedArrayList = new SortedArrayList(6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        //Colors
        int lightYellow = getResources().getColor(R.color.lightYellow);
        int lightGreen = getResources().getColor(R.color.lightGreen);
        int grey = getResources().getColor(R.color.grey);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            openCheckRotation();
        }
        //sakhte class ba moshakhas kardane toolesh
        TextViewList textViewList = new TextViewList(6);

        textViewList.setTextViews(0,(TextView) findViewById(R.id.numTxt1));
        textViewList.setTextViews(1,(TextView) findViewById(R.id.numTxt2));
        textViewList.setTextViews(2,(TextView) findViewById(R.id.numTxt3));
        textViewList.setTextViews(3,(TextView) findViewById(R.id.numTxt4));
        textViewList.setTextViews(4,(TextView) findViewById(R.id.numTxt5));
        textViewList.setTextViews(5,(TextView) findViewById(R.id.numTxt6));
        for (int i = 0;i<textViewList.getlength();i++){
            textViewList.insert(MainActivity.numbers[i]);
        }


   /*     numbersTxt[0] = (TextView) findViewById(R.id.numTxt1);
        numbersTxt[1] = (TextView) findViewById(R.id.numTxt2);
        numbersTxt[2] = (TextView) findViewById(R.id.numTxt3);
        numbersTxt[3] = (TextView) findViewById(R.id.numTxt4);
        numbersTxt[4] = (TextView) findViewById(R.id.numTxt5);
        numbersTxt[5] = (TextView) findViewById(R.id.numTxt6);
        for (int i = 0;i<numbersTxt.length;i++){
            numbersTxt[i].setText(MainActivity.numbers[i] + "");
        }*/
        TextView resultTxt;
        resultTxt = (TextView)findViewById(R.id.resultTextView);



        Button nextBtn = (Button) findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            int temp;
            int num1,num2;
            int i =0;
            int j = 0;

            @Override
            public void onClick(View v) {
                int result = textViewList.insertionSort();
                //check kardane avvalin onsor
                if (result == 0){
                    textViewList.setColor(0,lightGreen);
                    resultTxt.setText("doesn't need checking\nTo the next one");
                    nextBtn.setText("Next");
                    //moghey ke check kardane yek adad be etmam reside
                }else if (result==1){
                    for (int i = 0;i<textViewList.getPosition();i++){
                        textViewList.setColor(i,lightGreen);
                    }
                    resultTxt.setText(String.format("To the next number"));
                    //moghei ke kholle list check shode ast
                }else if (result == 2){
                    for (int i = 0;i<textViewList.getlength();i++){
                        textViewList.setColor(i,lightGreen);
                    }
                    resultTxt.setText("the list is all sorted\nHope you enjoyed the show :D");
                    nextBtn.setEnabled(false);
                    nextBtn.setBackgroundColor(grey);
                    //moghei ke do adad tahte barresi hastand
                }else if (result == 3){
                    textViewList.setColor(textViewList.getCounter(),lightYellow);
                    textViewList.setColor(textViewList.getCounter() + 1,lightYellow);
                    for (int i = textViewList.getCounter()+2;i<=textViewList.getPosition();i++){
                        textViewList.setColor(i,lightGreen);
                    }
                    resultTxt.setText(textViewList.getReport());
                    //bug
                    if (textViewList.getIschecked() == true){
                        textViewList.setCounter(0);
                        textViewList.setIsChecked(false);
                    }
                }

              /*  if (result == 0){
                    //numbersTxt[0].setBackgroundColor(lightGreen);

                    resultTxt.setText("doesn't need checking\nTo the next one");
                   // i++;
                    //j = i;
                    nextBtn.setText("Next");
                }else if (i < numbersTxt.length ){
                    if (j == 0 && i != numbersTxt.length - 1){
                        for (int z = 0;z<i + 1;z++){
                            numbersTxt[z].setBackgroundColor(lightGreen);
                        }
                        resultTxt.setText(String.format("To the next number"));
                        i++;
                        j = i;

                    }else if (j == 0 && i == numbersTxt.length - 1 ){
                        for (int z = 0;z<i + 1;z++){
                            numbersTxt[z].setBackgroundColor(lightGreen);
                        }
                        resultTxt.setText("the list is all sorted\nHope you enjoyed the show :D");
                        nextBtn.setEnabled(false);
                        nextBtn.setBackgroundColor(grey);
                    }else if (j < numbersTxt.length) {

                        numbersTxt[j -1].setBackgroundColor(lightYellow);
                        numbersTxt[j].setBackgroundColor(lightYellow);
                        for (int q = j + 1;q<=i;q++){
                            numbersTxt[q].setBackgroundColor(lightGreen);
                        }



                        if (Integer.parseInt(numbersTxt[j].getText().toString()) < Integer.parseInt(numbersTxt[j-1].getText().toString())) {
                            resultTxt.setText(String.format("%s is smaller than %s\nReplace",numbersTxt[j].getText(),numbersTxt[j-1].getText()));



                            temp = Integer.parseInt(numbersTxt[j].getText().toString());
                            numbersTxt[j].setText(numbersTxt[j -1].getText());
                            numbersTxt[j -1].setText(temp + "");
                            j--;




                        }else if (Integer.parseInt(numbersTxt[j].getText().toString()) > Integer.parseInt(numbersTxt[j-1].getText().toString())){
                            resultTxt.setText(String.format("%s is bigger than %s\nDon't Replace",numbersTxt[j].getText(),numbersTxt[j-1].getText()));
                            j = 0;
                        }else{
                            resultTxt.setText(String.format("Both are Equal\nDon't Replace"));
                            j = 0;
                        }

                    }
                }*/


            }

        });


    }
    public void openCheckRotation(){
        Intent intent = new Intent(this,checkRotation.class);
        startActivity(intent);
    }

}