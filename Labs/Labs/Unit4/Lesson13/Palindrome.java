package Unit4.Lesson13;

/**
* Author:      Mason Jones
* Lab:         13.1 Palindrome
* Date:        10/26/2023
* Description: A program that checks whether the string input is a palindrome or not and outputs the state of the string as a palindrome or not
*              the program only looks at alphanumeric characters in the string when comparing and a single character is not a palindrome
* Purpose:     Learn to use string methods such as toLowercase, length, adding characters, using for loops with strings, and basic algorithim scripting
*/

public class Palindrome
{
String myInput; 
String myAlpNum;
char ch;
public Palindrome(String input) {
myInput = input.toLowerCase();
myAlpNum = "";
}
public void removeNonAlpNum() {
for (int i = 0;i<myInput.length();i++) {
ch = myInput.charAt(i);                                       //selects an indexed character 
if ((ch >= 'a' && ch <='z') || (ch >= '0' && ch <= '9')) {    //alphanumeric only
myAlpNum += ch;                                           //adds back to an empty string
}
}
}
public Boolean isPalindrome()
{ 
if (myAlpNum.length()%2 == 1) {                                               //if string is odd
for (int i=0; i<=(myAlpNum.length()-1)/2;i++) {                           //iterates through half of the string minus the middle character
if (myAlpNum.charAt(i) == myAlpNum.charAt(myAlpNum.length() -1-i)) {  //checks to see if first half matches the second half
} else {
return false;
}
}
}
else if (myAlpNum.length()%2==0) {                                              //if string is even
for (int i=0; i<=myAlpNum.length()/2;i++) {                                 //iterates through half the string
if (myAlpNum.charAt(i) == myAlpNum.charAt(myAlpNum.length() - 1 - i)) { //checks to see if first half matches the second half
} else {
return false;
}
}
} 
if (myAlpNum.length() == 1 || myAlpNum.length() == 0) {                         //checks to see if the string is more than one character
return false;
}
return true;
}    
}

