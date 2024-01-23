package Unit4.Lesson15;

/**
 * Author:      Mason Jones
 * Lab:         15.2 StringReverse
 * Date:        12/07/2023
 * Description: A program that uses recursion to reverse a strings characters
 * Purpose:     Learn how to use recursion, especially base cases, and understand that a problem
 *              can be solved in multiple ways, especially with recursion
 */

import chn.util.*;
public class StringReverseMain
{
    public static void main(String[] args) {
        while (true) { 
            StringReverse sr = new StringReverse();
            ConsoleIO kb = new ConsoleIO();
            System.out.println("Input a string: ((Q/q) to quit) ");
            String string = kb.readLine();
            if (string.equals("Q") || string.equals("q")) {
                break;
            }
            System.out.println(sr.reverseString(string));
        }
    }
}
