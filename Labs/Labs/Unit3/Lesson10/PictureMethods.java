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
import apcslib.*;
public class PictureMethods {
public static void multiTable(int rows, int columns) {
if (rows >= 10) {
System.out.print("  ");
}
else if (rows < 10) {
System.out.print(" ");

}

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
public static void pyramid(int lines) {
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
}
