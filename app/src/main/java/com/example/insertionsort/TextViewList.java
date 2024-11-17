package com.example.insertionsort;

import android.graphics.Color;
import android.widget.TextView;
import android.content.res.Configuration;
import androidx.annotation.ColorInt;
//import java.awt.colors;

public class TextViewList{

//t lightYellow = getResources().getColor(R.color.lightYellow);
//int lightGreen = getResources().getColor(R.color.lightGreen);



    private TextView[] textViews;
    protected int[] numbersList;
    protected int numItems;
    protected int currentPos;
    private boolean isSorted = false;

    private String Report;



    //constructor
    public TextViewList(int maxItems){
        textViews = new TextView[maxItems];
    }
    public TextViewList(){
        textViews = new TextView[10];
    }


    //check mikone ke aya list por ast
    public boolean isFull(){
        return (textViews.length == numItems);
    }
    public boolean isEmpty(){
        return (numItems == 0);
    }

    //check kardane boodane adad dar list
    public boolean isThere (int item){
        boolean moreToSearch;
        int location = 0;
        boolean found = false;
        moreToSearch = (location < numItems);
        while (moreToSearch && !found)
        {
            if (item == Integer.parseInt(textViews[location].getText().toString())) // if they match
                found = true;
            else
            {
                location++;
                moreToSearch = (location < numItems);
            }
        }
        return found;
    }
        //gharar dadane adade vorudy dar list
        public void insert (int item)
        {
            textViews[numItems].setText(item+"");
            numItems++;
        }


    public void delete(int item) {
        int location = 0;
        while (item != Integer.parseInt(textViews[location].getText().toString())) {
            location++;
        }

        for (int index = location + 1; index < numItems; index++) {
            textViews[index - 1].setText(textViews[index].getText());
        }
        numItems--;
    }
    public void reset()
    {
        currentPos = 0;
    }
    public int getNextItem () {
        int next = Integer.parseInt(textViews[currentPos].getText().toString());
        if (currentPos == numItems - 1) {
            currentPos = 0;
        }
        else {
            currentPos++;
        }
        return next;
    }

    //gereftane meghdar bar asase index
    public int getValue(int index){
        return(Integer.parseInt(textViews[index].getText().toString()));
    }
    //gereftane maghdare TextView
    public int getValueByTextView(TextView textView){
        return (Integer.parseInt(textView.getText().toString()));
    }


    //set kardane textView (bar asase ID)
    public void setTextViews(int index,TextView textView){
        textViews[index] = textView;

    }

    //meghdar dehi be textview bar asase adad
    public void setValue(TextView textView,int value){
        textView.setText(value + "");
    }
    //gereftane toole araye' textView
    public int getlength(){
        return textViews.length;
    }

    //taghire rang
    public void setColor(int index,int code) {
        textViews[index].setBackgroundColor(code);
    }

    private int position = 0;
    private int counter = 0;
    boolean ischecked = false;
    public int insertionSort() {

        //0 baraye avvalin bar
        if (position == 0) {

            position++;
            counter = position;
            return 0;

            //be payan nareside
        } else if (position < getlength() ) {

            //moghei ke adad ba chap tarin noghte mirese
            if (counter == 0 && position != getlength() - 1) {
                position++;
                counter = position;
                return 1;
                //kolle list be payan reside
            } else if (counter == 0 && position == getlength() - 1) {

                return 2;
//agar do adad niaz be barresi dashtand
            } else if (counter < getlength()) {

                //
                if (getValue(counter) < getValue(counter - 1)) {


                    setReport(String.format("%d is smaller than %d\nReplace", getValue(counter), getValue(counter - 1)));
                    swap(textViews[counter],textViews[counter - 1]);
                    counter--;

                }else if (getValue(counter) > getValue(counter - 1)){
                    setReport(String.format("%d is bigger than %d\nDon't Replace",getValue(counter),getValue(counter - 1)));
                    counter--;
                    ischecked = true;

                }else{
                    setReport(String.format("Both are Equal\nDon't Replace"));
                    counter--;
                    ischecked = true;

                }
return 3;
            }
        }
return 100;
    }

    //jabejaeie adade do textview
    public void swap(TextView textView1,TextView textView2){
        int temp;
        temp = getValueByTextView(textView1);
        setValue(textView1,getValueByTextView(textView2));
        setValue(textView2,temp);

    }

    public void setReport(String report){
        Report = report;
    }

public String getReport(){
        return Report;
}
public int getCounter(){
return counter;
}
public int getPosition(){
        return position;
}
    public void setCounter(int inputCounter){
        counter = inputCounter;
    }
public boolean getIschecked(){
        return ischecked;
    }
    public void setIsChecked(boolean input){
        ischecked = input;
    }
}

