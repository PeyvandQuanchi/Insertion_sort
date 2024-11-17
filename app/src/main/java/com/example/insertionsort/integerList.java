package com.example.insertionsort;

public abstract class integerList {
    protected int[] list;
    protected int numItems;
    protected int currentPos;
    public integerList(int maxItems)

    {
        numItems = 0;
        list = new int[maxItems];
    }
    public boolean isFull(){
        return (list.length == numItems);
    }
    public boolean isEmpty(){
        return (numItems == 0);
    }
    public abstract boolean isThere (int item);
    public abstract void insert (int item);

    public abstract void delete (int item);
    public void reset()
    {
        currentPos = 0;
    }
    public int getNextItem () {
        int next = list[currentPos];
        if (currentPos == numItems - 1) {
            currentPos = 0;
        }
        else {
            currentPos++;
        }
        return next;
    }
}
