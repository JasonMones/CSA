package Unit5.Lesson16;

/**
* Author:      Mason Jones
* Lab:         16.2 Average
* Date:        12/18/2023
* Description: Program that reads a file filled with numbers valued at 100 or less and outputs the average at the end of the file
* Purpose:     Learn how to use the input and output objects of the chn.util library
*/

import chn.util.*;
import apcslib.*;
public class Average
{
public static void main(String[] args) {
String inPATH = "H:\\Java\\Labs\\Labs\\Unit5\\Lesson16\\numbers.txt";
FileInput inFile = new FileInput(inPATH);
FileOutput outFile = new FileOutput(inPATH, "append");

int num; int total = 0; int numCount = 0;
while (inFile.hasMoreLines()) {
num = inFile.readInt();
total += num;
numCount++;
}
outFile.println("\nAverage: " + Format.right((double) total / (double) numCount,0,2));
outFile.close();
inFile.close();
}
}
