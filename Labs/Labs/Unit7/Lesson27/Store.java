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
            while (list[g].compareTo(dividingValue) == 1) {
                g++;
            }
            while (list[h].compareTo(dividingValue) == -1) {
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
    } 

    public void testSearch()
    {
        int idToFind;
        int invReturn;
        int index;
        ConsoleIO console = new ConsoleIO();

        System.out.println("Testing search algorithm\n");
        System.out.print("Enter Id value to search for (-1 to quit) ---> ");
        idToFind = console.readInt();
        while (idToFind >= 0)
        {
            // calling iterative version of binary search  
            index = bsearch(new Item(idToFind, 0));
            System.out.print("Iterative binary search: Id # " + idToFind);
            if (index == -1)
                System.out.println("     No such part in stock");
            else
                System.out.println("     Inventory = " + myStore[index].getInv());

            // calling recursive version of binary search
            index = bsearch (new Item(idToFind, 0), 0, myStore.length-1);
            System.out.print("Recursive binary search: Id # " + idToFind);
            if (index == -1)
                System.out.println("     No such part in stock");
            else
                System.out.println("     Inventory = " + myStore[index].getInv());	

            System.out.print("\nEnter Id value to search for (-1 to quit) ---> ");
            idToFind = console.readInt();
        }
    }

    /**
     *  Searches the myStore array of Item Objects for the specified
     *  item object using a iterative binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for
     * @return             index of Item if found, -1 if not found
     */
    int bsearch(Item idToSearch)
    {
        int lowest = 0;
        int highest = nOfItems-1;
        int middle = nOfItems/2;
        int compare;
        while (true) {
            compare = idToSearch.compareTo(myStore[middle]);
            if (compare == 0) {
                return middle;
            }
            else if (highest-lowest == 0 || highest-lowest == 1 ) {
                return -1;
            }
            else if (compare == -1) {
                  lowest = middle;
            }
            else {
                highest = middle; 
            }
            middle = (highest-lowest)/2 + lowest;
        }
    }

    /**
     *  Searches the specified array of Item Objects for the specified
     *  item object using a recursive binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for
     * @param  first       Starting index of search range
     * @param  last        Ending index of search range
     * @return             index of Item if found, -1 if not found
     */ 
    int bsearch (Item idToSearch, int first, int last)
    {
         int middle = (last-first)/2+first;
         int compare = idToSearch.compareTo(myStore[middle]);
         if (compare == 0) {
             return middle;
         }
         else if (last-first == 0 || last-first == 1) {
             return -1;
         }
         else if (compare == -1) {
             return bsearch(idToSearch, middle, last);
         }
         else {
             return bsearch(idToSearch, first, middle);
         }
    }
}