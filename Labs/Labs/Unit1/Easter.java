package Unit1;


/**
 * Author:      Mason Jones
 * Date:        8/30/2023
 * Lab:         3.2 Easter
 * Description: Creates a program that inputs a year and performs mathmatical operations
 *              on the year to figure out what day and month Easter falls on for that year
 * Purpose:     To learn how datatypes and constants work and how to store data in a variable,
 *              how to concatenate strings and variables together for an output, how to print
 *              
 */
import java.lang.Integer;
public class Easter
{
    public static void main(int y)
    {
      int a = y%19;                                         //Divide y by 19 and call the remainder a                                            
      int b = y/100;                                        //Divide y by 100 and get a quotient b
      int c = y%100;                                        //Divide y by 100 and get a remainder c
      int d = b/4;                                          //Divide b by 4 and get a quotient d
      int e = b%4;                                          //Divide b by 4 and get a remainder e
      int f = (b+8)/25;                                     //Divide b + 8 by 25 and get a quotient f
      int g = (b-f+1)/3;                                    //Divide b - f + 1 by 3 and get a quotient g
      int h = ((19*a)+b-d-g+15)%30;                         //Divide 19 * a + b - d - g + 15 by 30 and get a remainder h
      int i = c/4;                                          //Divide c by 4 and get a quotient i
      int k = c%4;                                          //Divide c by 4 and get a remainder k
      int r = (32+(2*e)+(2*i)-h-k)%7;                       //Divide 32 + 2 * e + 2 * i - h - k by 7 and get a remainder r
      int m = (a+(11*h)+(22*r))/451;                        //Divide a + 11 * h + 22 * r by 451 and get a quotient m
      int n = (h+r-(7*m)+114)/31;                           //Divide h + r - 7 * m + 114 by 31 and get a quotient n
      int p = (h+r-(7*m)+114)%31;                           //Divide h + r - 7 * m + 114 by 31 and get a remainder p
      System.out.println("Year: " + y + "\n" + "a = " + a + "\n" + "b = " + b + "\n" + "c = " + c + "\n" + "d = " + d + "\n" + "e = " + e + "\n" + "f = " + f + "\n" + "g = " + g + "\n" + "h = " + h + "\n" + "i = " + i 
      + "\n" + "k = " + k + "\n" + "r = " + r + "\n" + "m = " + m + "\n" + "n = " + n + "\n" + "p = " + p + "\n");         //prints out all variables used in the program and their values
      String month = "";                                    //declare a string month
      //detect whether n equals 3 or 4
      if (n==3) {                                                                                 //have this code run only if n equals 3
           month = "March";                                                                       //make month be March
      }
      else if (n==4) {                                                                            //have this code run only if n equals 4
           month = "April";                                                                       //make month be April
      }
      String day = Integer.toString(p+1);                                                         //define day to be the string of the number p+1
      if (p+1 == 11 | p+1 == 12 | p+1 == 13) {
          day += "th";                                                                       //concatenate th to the end of day

      }
      
      if ((p+1)%10 == 1) {                                                             //run this code only the last character of day is 1
          day += "st";                                                                       //concatenate st to the end of day
      }
      else if ((p+1)%10 == 2) {                                                                   //run this code only the last character of day is 2
          day += "nd";                                                                       //concatenate nd to the end of day
      }
      else if ((p+1)%10 == 3) {                                                                   //run this code only the last character of day is 1
          day += "rd";                                                                       //concatenate rd to the end of day
      }
      else  {                                                                                     //if other conditions are not met, run this code
          day += "th";                                                                       //concatenate th to the end of day
      }
      System.out.println("Easter in " + y + " falls on " + month + " " + day);                    //prints what month and day Easter falls on for the given year
    }
}
