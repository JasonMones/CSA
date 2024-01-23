package Unit4.Lesson13;

import java.util.Scanner;
import chn.util.*;
/**
 * Author:      Mason Jones
 * Lab:         13.3 Piglatinator
 * Date:        11/29/2023
 * Description: A program that translates several strings into piglatin. First, the program iterates through the string to check for breaks and non-alphanumeric characters
 *              and substrings the main string into individual tokens where it is then translated into piglatin and added to a string of translated tokens
 * Purpose:     Utilizes string methods such as replace and substring as well as a convential for loop to manipulate strings in a way where they can be used
 */
public class PiglatinatorMain {
    public static void main() {
        //System.out.println("ඞ: " + Piglatinator.translate(new Scanner(System.in).nextLine()));
        ConsoleIO kb = new ConsoleIO();
        String yesOrNo = "";
        boolean active = true;
        do {
           System.out.println("Input a string to translate to piglatin: ");
           String str = kb.readLine();
           Piglatinator pig = new Piglatinator(str);
           System.out.println(pig.translate());
           System.out.print("Would you like to translate another string? (y/n) ");
           yesOrNo = kb.readLine();
           if (yesOrNo.equals("y") || yesOrNo.equals("Y")) {        //if user inputs a variation of y
               active = true;
           }
           else if (yesOrNo.equals("n") || yesOrNo.equals("N")) {   //if user inputs a variation of n
               active = false;
           } 
           else {                                                   //if user inputs neither
               System.out.println("Invalid input");
               active = false;
           }
        } while (active == true);
    }
}
