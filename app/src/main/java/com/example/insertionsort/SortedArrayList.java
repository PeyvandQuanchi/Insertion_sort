package com.example.insertionsort;

public class SortedArrayList extends integerList{

    public SortedArrayList(int maxItems) {
        super(maxItems);
    }

    public boolean isThere(int item) {
        int compareResult;
        int midPoint;
        int first = 0;
        int last = numItems - 1;
        boolean moreToSearch = (first <= last);
        boolean found = false;
        while (moreToSearch && !found)
        {
            midPoint = (first + last) / 2;

            if (item == list[midPoint])
                found = true;
            else if (item < list[midPoint])
            {
                last = midPoint - 1;
                moreToSearch = (first <= last);
            }
            else
            {
                first = midPoint + 1;
                moreToSearch = (first <= last);
            }
        }
        return found;
    }

    public void insert(int item){
        int location = 0;
        boolean moreToSearch = (location < numItems);

        while (moreToSearch){
            if (item < list[location]){
                moreToSearch = false;
            }else{
                location++;
                moreToSearch = (location<numItems);
            }
        }
        for (int index = numItems; index > location; index--) {
            list[index] = list[index - 1];
        }
        list[location] = item;
        numItems++;
    }


    public void delete(int item) {
    int location = 0;
        while (item != list[location]) {
            location++;
        }

        for (int index = location + 1; index < numItems; index++) {
            list[index - 1] = list[index];
        }
        numItems--;
    }

}
