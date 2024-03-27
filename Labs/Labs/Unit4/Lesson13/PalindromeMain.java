package Unit4.Lesson13;

/**
* Author:      Mason Jones
* Lab:         13.1 Palindrome
* Date:        10/26/2023
* Description: A program that checks whether the string input is a palindrome or not and outputs the state of the string as a palindrome or not
*              the program only looks at alphanumeric characters in the string when comparing and a single character is not a palindrome
* Purpose:     Learn to use string methods such as toLowercase, length, adding characters, using for loops with strings, and basic algorithim scripting
*/

import chn.util.*;
public class PalindromeMain
{
public static void main(String[] args) {
String input;
String q = "q";
ConsoleIO kb = new ConsoleIO();
while (true) {
System.out.print("Enter a string: ");
input = kb.readLine();
if (input.toLowerCase().equals(q)) {                                       //if user inputs q or Q
break;
}
Palindrome pald = new Palindrome(input);
pald.removeNonAlpNum();                                                    //removes non alphanumeric characters
if (pald.isPalindrome()) {
System.out.println("Yes, the string you entered is a palindrome.");
}
else {
System.out.println("No, the string you entered is NOT a palindrome.");
}
}
}
}
