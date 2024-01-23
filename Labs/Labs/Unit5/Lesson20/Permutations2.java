package Unit5.Lesson20;

/**
 * Author:      Mason Jones
 * Date:        1/19/2024
 * Lab:         20.2 Permutations
 * Description: A program that creates 10 random permutations of an arraylist with the numbers 1-10
 *              and sums up the first and last numbers in the arraylist
 * Purpose:     Learn how to use the methods in arraylist
 */

import java.util.ArrayList;
import apcslib.*;

public class Permutations2
{
    public static void main (String[] args) {
        ArrayList<Integer> list = firstList();
        for (int i = 1; i<=10;i++) {
            list = nextPermutation(list);
            System.out.print("List ");
            System.out.print(Format.right(i + ":", 3));
            System.out.print(Format.center(list.toString(),40));
            System.out.print("Sum of first and last: " + (list.get(0)+list.get(9)));
            System.out.println();
        }
    }
    private static ArrayList<Integer> firstList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i<=10; i++) {
            list.add(i);
        }
        return list;
    }
    private static ArrayList<Integer> nextPermutation (ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int randIndex;
        for (int i = 0; i<10;i++) {
            do {
               randIndex = (int) (Math.random()*(10.0));
               }
             while (list.get(randIndex) == 0);
            newList.add(list.get(randIndex));
            list.set(randIndex,0);
        }
        return newList;
    }
}
