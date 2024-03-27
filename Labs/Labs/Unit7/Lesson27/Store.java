package Unit7.Lesson27;

import chn.util.*;
import apcslib.*;

public class Store
{
    private Item[] myStore;
    private int nOfItems;
    private static FileInput input;
    public Store(String fileName) {
        input = new FileInput(fileName);
        nOfItems = input.readInt();
        myStore = new Item[nOfItems];

        for (int i = 0; i < nOfItems; i++) {
            myStore[i] = new Item(input.readInt(), input.readInt());
        }
        input.close();
    }        

    public void displayStore() {
        Item current;
        System.out.println(Format.right("Id", 13) + Format.right("Inv", 10));
        for (int i = 0; i < nOfItems; i++) { //include numbers and newline at % 10
            if (i % 10 == 0) {
                System.out.println();
            }
            current = myStore[i];
            System.out.print(Format.left(i+1,2));
            System.out.println(current.toString());
        }
    }                // displays the data
    public void doSort()                    // public method that calls 'quickSort' of 'myStore'
    {
        quickSort(myStore, 0, myStore.length - 1);    // code as shown
    }

    private void quickSort(Item[] list, int first, int last){
        int g = first, h = last;
        int midIndex = (first + last) / 2;
        Item dividingValue = list[midIndex];
        do
        {
            while (list[g].compareTo(dividingValue) == -1) {
                g++;
            }
            while (list[h].compareTo(dividingValue) == 1) {
                h--;
            }
            if (g <= h)
            {
                //swap(list[g], list[h]);
                Item temp = list[g];
                list[g] = list[h];
                list[h] = temp;
                g++;
                h--;
            }
        }
        while (g < h);
        if (h > first) {
            quickSort (list,first,h);
        }
        if (g < last) {
            quickSort (list,g,last);
        }
    }    // private method
}