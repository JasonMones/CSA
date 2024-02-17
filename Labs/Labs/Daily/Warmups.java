package Daily;

import java.util.ArrayList;
import chn.util.*;
public class Warmups
{   
    public static void main(String[] args)
    {
       boolean active;
       String yesNo;
       int warmup;
       boolean againMessage;
       final int MULTITABLE = 1;
       final int STARPLOT = 2;
       final int REVERSESTRING = 3;
       final int CHANGECASE = 4;
       final int FINDVOWEL = 5;
       final int REVERSEWORDS = 6;
       final int FLIPHALVES = 7;
       final int FLIPTHIRDS = 8;
       final int PRINTARRAY = 9;
       final int LARGESTINARRAY = 10;
       final int SMALLESTINARRAY = 11;
       final int CLEARZEROES = 12;
       final int CHECKNEIGHBORS = 13;
       final int GUESSER = 14;
       String string = "";
       int[] array = {0,6,13,0,0,76,33,0,0,0,4,29,21,0,86,0,32,66,0,0};
       ArrayList<Integer> list = new ArrayList<Integer>();
       int[][] bioMatrix = { {0,0,0,0},
                             {1,0,1,1},  
                             {1,1,1,1},
                             {0,1,1,0}};
                             
       ConsoleIO kb = new ConsoleIO();
       WarmupMethods warm = new WarmupMethods();
       
       againMessage = false;
       active = true;
       yesNo = "";
        while (active) {
           if (againMessage){
              System.out.print("\nDo you wish to continue doing warmups? (y/n): ");
              yesNo = kb.readToken();
           }
           
           if (againMessage == false || yesNo.toLowerCase().charAt(0) == 'y') {
             System.out.println("\n\t1-Multiplication Table");
             System.out.println("\n\t2-Star tree");
             System.out.println("\n\t3-Reverse string");
             System.out.println("\n\t4-Change case");
             System.out.println("\n\t5-Find vowel");
             System.out.println("\n\t6-Reverse words");
             System.out.println("\n\t7-String Flipper");
             System.out.println("\n\t8-String Thirder");
             System.out.println("\n\t9-Array Print");
             System.out.println("\n\t10-Find Largest Number");
             System.out.println("\n\t11-Find Smallest Number");
             System.out.println("\n\t12-Removes Zeroes");
             System.out.println("\n\t13-Check for Neighbors");
             System.out.println("\n\t14-Guessing Game");
             System.out.print("\nWhich warmup would you like to do? ");
             warmup = kb.readInt();
           
             switch (warmup) {
                 case MULTITABLE:
                    System.out.print("\nHow many rows and columns do you want? ");
                    int rows = kb.readInt();
                    int columns = kb.readInt();
                    warm.multiTable(rows, columns);
                    break;
                 case STARPLOT:
                    System.out.print("\nHow many lines? ");
                    int lines = kb.readInt();
                    warm.pyramid(lines);
                    break;
                 case REVERSESTRING:
                    System.out.print("\nInput a string: ");
                    string = kb.readLine();
                    warm.reverseString(string);
                    break;
                 case CHANGECASE:
                    System.out.print("\nInput a word: ");
                    string = kb.readToken();
                    warm.changeCase(string);
                    break;
                 case FINDVOWEL:
                     System.out.print("\nInput a string: ");
                     string = kb.readLine();
                     if (warm.findVowel(string) == -1) {
                         System.out.println("No vowel found!");
                     } else {
                         System.out.println("First vowel at: " + warm.findVowel(string));
                     }
                     break;
                 case REVERSEWORDS:
                     System.out.print("\nInput a string: ");
                     System.out.println(warm.reverseWords(kb.readLine()));
                     break;
                 case FLIPHALVES:
                     System.out.print("\nInput a string: ");
                     warm.flipHalves(kb.readLine());
                     break;
                 case FLIPTHIRDS:
                     System.out.print("\nInput a string: ");
                     warm.flipThirds(kb.readLine());
                     break;
                 case PRINTARRAY:
                     warm.printArray(array);
                     break;
                 case LARGESTINARRAY:
                     warm.largestNumber(array);
                     break;
                 case SMALLESTINARRAY:
                     warm.smallestNumber(array);
                     break;
                 case CLEARZEROES:
                     warm.printArray(array);
                     System.out.println(
                                    "Numbers in ArrayList: " 
                                    + warm.clearZeroes(
                                    warm.arrayTransferList(array, list))
                                    .toString());
                     break;
                 case CHECKNEIGHBORS:
                     int neighbor = warm.checkForNeighbors(bioMatrix,2,2);
                     System.out.println("\nNumber of Neighbors in matrix = " + neighbor);
                     break;
                 case GUESSER:
                     warm.guessingGame();
                 default:
                     System.out.println("Invalid input");
                }
           }
           else if (yesNo.toLowerCase().charAt(0) == 'n') {
              active = false;
           }
           else {
             System.out.println("Not a valid input, try again.");
           }
           againMessage = true;
       }
    
    }
}
