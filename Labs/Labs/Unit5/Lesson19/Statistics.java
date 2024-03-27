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
public class Statistics
{
private int[] nums;
public Statistics(int[] data) {
nums = data;
}

public double average() {
int sum = 0;
for (int i = 0; i < nums.length;i++) {
sum += nums[i]; 
}
return (double) sum/(double)nums.length;
}
public double sDev() {
double[] differences = new double[nums.length];
for (int i =0; i < nums.length;i++) {
differences[i] = Math.pow((nums[i]-average()),2);
}
int sum = 0;
for (int i =0;i<nums.length;i++) {
sum+=differences[i];
}
return Math.sqrt((double) sum/((double) (nums.length-1.0)));
}
private int[] increaseCapacity(int[] array) {
int[] tempArray = new int[array.length+1];
for (int i = 0; i < array.length; i++) {
tempArray[i] = array[i];
}
return tempArray;
}
private int[] decreaseCapacity(int[] array) {
int[] tempArray = new int[array.length-1];
for (int i=0;i<array.length-1;i++) {
tempArray[i] = array[i];
}
return tempArray;
}
public int[] sort() {
int[] sortedList = new int[2];
sortedList[0] = nums[0];

boolean biggest = false;
int lastIndex;
for (int i = 1;i<nums.length;i++) {
for (int j = 0; j < sortedList.length; j++) {
biggest = false;
if (nums[i] <= sortedList[j]) {
for (int k = sortedList.length-1; k > j; k--) {
sortedList[k] = sortedList[k-1];
}
sortedList[j] = nums[i];
biggest = false;
sortedList = increaseCapacity(sortedList);
break;
}
biggest = true;
}
if (biggest) {
sortedList[sortedList.length-1] = nums[i];
sortedList = increaseCapacity(sortedList);
}
}
return sortedList;
}
public int[] mode(int[] array) {
int currentHighestFrequency = 1; 
int iteratingFrequency = 0;

int nextNumber = -1;
int currentNumber = array[0];
for (int i = 1; i < array.length; i++) {
if(array[i] == currentNumber) {
currentHighestFrequency++;
}
else if (nextNumber == -1) {
nextNumber = array[i];
}
else if (array[i] == nextNumber) {
iteratingFrequency++;
}
else {
nextNumber = array[i];
iteratingFrequency = 0;
}
if (iteratingFrequency > currentHighestFrequency) {
currentHighestFrequency = iteratingFrequency;
iteratingFrequency = 0;
currentNumber = array[i];
}
}
int frequency = 0;
int newCurrentNumber = array[0];
int[] modeList = new int[1];
for (int j = 1;j<array.length;j++) {
if (array[j] == newCurrentNumber) {
frequency++;
if (frequency == currentHighestFrequency) {
modeList[modeList.length-1] = array[j];
modeList = increaseCapacity(modeList);
}
}
else {
frequency = 0;
newCurrentNumber = array[j];
}
}

return decreaseCapacity(modeList);
}
}
