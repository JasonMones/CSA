package Unit5.Lesson16;

/**
 * Author:      Mason Jones
 * Lab:         16.1 Squeeze
 * Date:        12/18/2023
 * Description: A program that takes an input file, intended for source code, and outputs a file that removes the indentation and prints the number of spaces 
 *              the indentation had at the start
 * Purpose:     learn the file input and output objects of the chn.util library
 */

import chn.util.*;
public class Squeeze
{
   public static void main(String[] args) {
       String inPATH = "H:\\Java\\Labs\\Labs\\Unit5\\Lesson16\\getbeter.txt";        //path for input file
       String outPATH = "H:\\Java\\Labs\\Labs\\Unit5\\Lesson16\\squeezedFile.txt";   //path for output file
       FileInput inFile = new FileInput(inPATH);
       FileOutput outFile = new FileOutput(outPATH);
       
       int spaceCount;
       String nextLine;
       while (inFile.hasMoreLines()) {
          spaceCount = 0;
          nextLine = inFile.readLine();
          if (nextLine.length() > 0) {
             for (int i = 0; i < nextLine.length() && nextLine.charAt(i) == ' ';i++) {  //checks to see if string is finished or first spaces are iterated over
                 spaceCount++;
             }    
          }
          outFile.println(spaceCount + " " + nextLine.trim());
          }
       outFile.close();
       inFile.close();
       }   
   }
