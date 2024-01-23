package Unit5.Lesson20;

import java.util.ArrayList;
import apcslib.*;

public class Permutations
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
        ArrayList<Integer> orgCopy = list;
        int randIndex;
        int counter = 0;
        int ensureCompletion;
        boolean outerBreak;
        
        for (int i = 0; i<10;i++) {
            ensureCompletion = 0;
            outerBreak = false;
            do {
               randIndex = (int) (Math.random()*(10.0));
               ensureCompletion++;
               if (ensureCompletion == 100) {
                   outerBreak = true;
                   while (true) {
                       int j = 0;
                       if (newList.get(j) != list.get(9)) {
                           newList.add(newList.get(j));
                           newList.set(j,list.get(9));
                           break;
                       }
                       j++;
                   }
                   break;
               }
            } while (list.get(randIndex) == 0 || list.get(counter) == list.get(randIndex));
            if (outerBreak) {
                break;
            }
            newList.add(list.get(randIndex));
            list.set(randIndex,0);
            if (list.size()>5) {
                counter++;
            } else {
                counter--;
            }
        }
        return newList;
    }
}

