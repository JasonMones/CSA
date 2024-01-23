/** 
*  Author:      Mason Jones
*  Date:        9/14/2023
*  Description: A program that asks for the input of a 3 letter word and outputs the individual ASCII codes of each character, the sum of the ASCII codes, and the average of the ASCII codes
**/

import chn.util.*;
import apcslib.*;
public class q1
{
    public static void main(String[] args)
    {
        ConsoleIO kb = new ConsoleIO();                     //initialize the ConsoleIO object
       System.out.println("Enter a 3-letter word:");        //prompt user to input a 3 letter word
       String word = kb.readToken();                        //assign the token inputted to a variable
                              //seperate characters in the inputted word
       char c1 = word.charAt(0);
       char c2 = word.charAt(1);
       char c3 = word.charAt(2);
                              //typecast characters to integer values
       int ASCII1 = (int) c1;
       int ASCII2 = (int) c2;
       int ASCII3 = (int) c3;
                            
       int sum = c1+c2+c3;                                  //add up the ASCII values
        
       double average = (double) sum / 3;                   //find the average of the ASCII values
       
                                      
       System.out.println("The ASCII codes of the 3 letters in " + word + " are " + ASCII1 + " " + ASCII2 + " " + ASCII3);          
       System.out.println("The sum of those numbers is " + sum);
       System.out.println("The average of those numbers is " + Format.left(average,2,2));
       
    }
}
