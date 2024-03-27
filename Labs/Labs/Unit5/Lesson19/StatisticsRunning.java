package Unit5.Lesson19;

/**
* Author:      Mason Jones
* Lab:         19.1 Statistics
* Date:        12/22/2023
* Description: Program that reads a file and iterates through the array to find the average, stand deviation,
*              a numerically sorted array, and the mode(s) of the data set
* Purpose:     Learn how to manipulate big arrays to gather informaiton about the numbers inside the data
*/

import chn.util.*;
import apcslib.*;
public class StatisticsRunning 
{
public static void main(String[] args) {
String PATH  = "H:\\Java\\Labs\\Labs\\Unit5\\Lesson19\\numbers.txt";
int[] nums = readFile(PATH);
Statistics stat = new Statistics(nums);

int[] sortedList = stat.sort();
int[] modeList = stat.mode(sortedList);
System.out.println("Average: " + Format.right(stat.average(),0,2));
System.out.println("Standard Deviation: " + Format.right(stat.sDev(),0,2));
System.out.print("Mode(s): ");
for (int i=0;i<modeList.length;i++) {
if (modeList[i] == modeList[modeList.length-1]) {
System.out.print(modeList[i]);
}
else {
System.out.print(modeList[i] + ", ");
}
}
}
private static int[] readFile(String PATH) {
FileInput inFile = new FileInput(PATH);

int[] nums = new int[1];
int counter = 0;
while (inFile.hasMoreLines()) {
nums[counter] = inFile.readInt();
nums = increaseCapacity(nums,nums.length+1);
counter++;
}
inFile.close();
return nums;
}
private static int[] increaseCapacity(int[] array, int length) {
int[] tempArray = new int[length];
for (int i = 0; i < array.length; i++) {
tempArray[i] = array[i];
}
return tempArray;
}
}
