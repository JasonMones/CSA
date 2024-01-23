package Daily;

import java.util.ArrayList;
import apcslib.*;
public class WarmupMethods {
    double numa,numb;
    public WarmupMethods() {
        numa = 0;
        numb = 0;
    }
    public WarmupMethods(double paramA, double paramB) {
        numa = paramA;
        numb = paramB;
    }
    public double product() {
        return numa*numb;
    }
    public double sum() {
        return numa + numb;
    }
    public double quotient() {
        return numa/numb;
    }
    public double difference() {
        return numa-numb;
    }
    public void makeSquare(int size) {
       for (int k = 0; k<=size;k++) {
           System.out.print("* ");
       }
       System.out.println();
       for (int j = 0; j < size-1; j++) {
            System.out.print("*" + Format.right("*",size*2));
            System.out.println();
        }
       for (int l = 0; l<=size;l++) {
           System.out.print("* ");
       }
    }
    public void multiTable(int rows, int columns) {
        System.out.print("  ");
        
        for (int i = 1; i <= columns; i++) {
            System.out.print(Format.right(i,5));
        }
        for (int i = 1; i <= rows; i++) {
            System.out.print("\n" + Format.right(i,2));
            for (int j = 1; j<=columns; j++) {
                System.out.print(Format.right(i*j,5));
            }
        }
        }
        public void pyramid(int lines) {
        int k = 0;
        for (int i = 1; i<=lines;i++, k=0) {  //loop for each line in the pyramid
            for (int j = 0;j<=lines-i;j++) {  //loop for printing spaces per line
                System.out.print("  ");
            }
            while (k!= 2*i - 1) {              //loop for printing asterisks
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }
        public static void reverseString(String string) {
        String reversedString = "";
        for (int i = string.length()-1;i>=0;i--) {
         reversedString+= string.charAt(i);
        }
        System.out.println(reversedString);
    }
        public static void changeCase(String string) {
         if (string.charAt(0) < 'Z' && string.charAt(0) > 'A') {
          System.out.println(string.toLowerCase().charAt(0) + string.substring(1));
         }
         else System.out.println(string.toUpperCase().charAt(0) + string.substring(1));  
    }
        public static int findVowel(String str) {
           for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || 
           str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
               return i;
            }
         }
         return -1;
    }
    public static String reverseWords(String msg) {
        int startWord = 0;
        String word = "";
        
        if (msg. length()==0) {
            return word;
        }
        else if (msg.indexOf(" ")==-1) {
            return msg;
        }
        else {
            int endWord = msg.indexOf(" ");
            word += reverseWords(msg.substring(endWord+1))+" "+msg.substring(startWord,endWord);
        }
        return word;
    }
    public String flipHalves(String line) {
       if (line.length() % 2 == 1) {
        return line.substring((line.length()-1)/2) + line.substring(0,line.length()/2);
       }
       else {
        return line.substring(line.length()/2) + line.substring(0,line.length()/2);

       }
    }
    public void flipThirds(String str) {
        int third = str.length()/3;
        System.out.println("The third third is: " +str.substring(third*2+2));
        System.out.println("The first third is: " + str.substring(0,third+1));
    }
    public void printArray(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i<array.length;i++){
            if (i % 10 == 0) {
                System.out.print("\nNumbers in array: ");
            }
            if (i == array.length-1) {
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("\n");
    }
    public void largestNumber(int[] array) {
        int largestNumber = 0;
        for (int i = 0; i<array.length;i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }
        System.out.println("\nBiggest Number: "+largestNumber);
    }
    public void smallestNumber(int[] array) {
        int smallestNumber = 100;
        for (int i = 0; i<array.length;i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        System.out.println("\nSmallest number: "+smallestNumber);
    }
    public ArrayList<Integer> arrayTransferList(int[] array, ArrayList<Integer> list) {
        for (int i = 0; i<array.length;i++) {
            list.add(array[i]);
        }
        return list;
    }
    public ArrayList<Integer> clearZeroes(ArrayList<Integer> list) {
        for (int j = 0; j<list.size();j++) {
            if (list.get(j)==0) {
                list.remove(j);
                j--;
            }
        }
        return list;
    }
    public int checkForNeighbors(int[][] myGrid, int row, int column) {
        int neighbors = 0;
        if (row > 0 && column > 0 && myGrid[row-1][column-1] == 1) {
            neighbors++;
        }
        if (row > 0 && myGrid[row-1][column] == 1) {
            neighbors++;
        }
        if (row > 0 && column < 4 && myGrid[row-1][column+1] == 1) {
            neighbors++;
        }
        if (column > 0 && myGrid[row][column-1] == 1) {
            neighbors++;
        }
        if (column < 4 && myGrid[row][column+1] == 1) {
            neighbors++;
        }
        if (row < 4 && column > 0 && myGrid[row+1][column-1] == 1) {
            neighbors++;
        }
        if (row < 4 && myGrid[row+1][column] == 1) {
            neighbors++;
        }
        if (row < 4 && column < 19 && myGrid[row+1][column+1] == 1) {
            neighbors++;
        }
        return neighbors;
    }
}
