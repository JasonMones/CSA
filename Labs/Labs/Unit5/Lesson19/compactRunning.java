package Unit5.Lesson19;


/**
 * Author:      Mason Jones
 * Lab:         19.2 Compact
 * Date:        12/23/2023
 * Description: Program that reads a text file storing integer values and stores these
 *              values in an integer array, and 'compacting' this array by removing 
 *              the zero values while keeping the order of the non-zero values the same
 *              through means of left shifting 
 * Purpose:     Learn to manipulate arrays in a way that puts numerical information in an
 *              easier to read format
 */

import chn.util.*;
class compactRunning {
  public static void main(String[] args) {
    Compact comp = new Compact();
    final String PATH = "H:\\Java\\Labs\\Labs\\Unit5\\Lesson19\\compact.txt";
    
    int[] uncompactArray = readFile(PATH);
    System.out.print("Uncompacted Array: ");
    printArray(uncompactArray);
    
    int[] compactArray = comp.removeZeroes(comp.shiftZeros(uncompactArray));
    System.out.print("\nCompacted Array: ");
    printArray(compactArray);
  }
  private static int[] increaseCapacity(int[] array) {
    int[] tempArray = new int[array.length+1];
    for (int i=0;i<array.length;i++) {
      tempArray[i] = array[i];
    }
    return tempArray;
  }
  private static int[] readFile(String PATH) {
    FileInput inFile = new FileInput(PATH);
    int[] tempArray = new int[1];
    int counter = 0;
    while (inFile.hasMoreTokens()) {
        tempArray[counter] = inFile.readInt();
        tempArray = increaseCapacity(tempArray);
        counter++;
    }
    inFile.close();
    return tempArray;
  }
  private static void printArray(int[] array) {
      for (int i = 0; i<array.length;i++) {
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
      System.out.println();
  }
}
