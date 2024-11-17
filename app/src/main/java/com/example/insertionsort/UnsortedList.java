package com.example.insertionsort;

public class UnsortedList extends integerList{
    public UnsortedList(int maxItems)

    {
        super(maxItems);
    }
    public UnsortedList()

    {
        super(10);

    }

    public boolean isThere (int item)
    {
        boolean moreToSearch;
        int location = 0;
        boolean found = false;
        moreToSearch = (location < numItems);
        while (moreToSearch && !found)
        {
            if (item == 0) // if they match
                found = true;
            else
            {
                location++;
                moreToSearch = (location < numItems);
            }
        }
        return found;
    }
    public void insert (int item)
// Adds a copy of item to this list
    {
        list[numItems] = item;
        numItems++;
    }
    public void delete (int item)
    {
        int location = 0;
        while (item != list[location]) {
            location++;
        }
        list[location] = list[numItems - 1];
        numItems--;
    }
}
