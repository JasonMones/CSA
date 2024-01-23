package Unit3.Lesson10;

/**
 * Author:      Mason Jones
 * Date:        10/16/2023
 * Lab:         9.1 TaxPayer
 * Description: Creates a program with two static methods, one that inputs the rows and columns
 *              of a multiplication table and prints out the content of the table, and another
 *              that inputs the height of a pyramid and prints out that pyramid in asterisks
 * Purpose:     Learn how to use for loops so that a code block is continously ran until the
 *              terminating condition defined int he header of the for loop is met
 */

import chn.util.*;
public class Pictures {
    public static void main(String[] args) {
        ConsoleIO keyboard = new ConsoleIO();     //instantiate a ConsoleIO object
        String get;

        PictureMethods.multiTable(4,6);
        get = keyboard.readLine();                // freezes the output screen to see the picture
        PictureMethods.multiTable(11,12);
        get = keyboard.readLine();
        PictureMethods.pyramid(10);
        get = keyboard.readLine();
        PictureMethods.pyramid(25);
        get = keyboard.readLine() ;
    }
}