package Unit4.Lesson15;

/**
 * Author:      Mason Jones
 * Lab:         15.2 StringReverse
 * Date:        12/07/2023
 * Description: A program that uses recursion to reverse a strings characters
 * Purpose:     Learn how to use recursion, especially base cases, and understand that a problem
 *              can be solved in multiple ways, especially with recursion
 */

public class StringReverse
{
    public StringReverse() {
    }
    public String reverseString(String string) {
        if (string.length() == 0) { //base case
            return "";
        }               //takes last character out front                  rest of string, process repeats
        return string.substring(string.length()-1)+reverseString(string.substring(0,string.length()-1));
    }
}
