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

class Compact {
private int[] arr;
public Compact() {
}
private int[] increaseCapacity(int[] array) {
int[] tempArray = new int[array.length+1];
for (int i=0;i<array.length;i++) {
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
public int[] shiftZeros(int[] arr) {
for (int i =0;i<arr.length;i++) {
if (arr[i] == 0) {
arr = increaseCapacity(arr);
for (int j = arr.length-1;j>0;j--) {
arr[j] = arr[j-1];
} 
arr[0] = 0;
for (int j = i+1; j < arr.length-1; j++) {
arr[j] = arr[j+1]; 
} 
arr = decreaseCapacity(arr);
}
}
return arr;
}
public int[] removeZeroes(int[] arr) {
int zeroCount = 0;
int orgLength = arr.length;
for (int i = 0; i < arr.length; i++) {
if (arr[i] == 0) {
zeroCount++;
}
}
for (int i = 0; i < arr.length-zeroCount; i++) {
arr[i] = arr[i+zeroCount];
}
for (int i = 0; i < orgLength-zeroCount+1; i++) {
arr = decreaseCapacity(arr);
}
return arr;
}
private void printArray(int[] array) {
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
}
}
