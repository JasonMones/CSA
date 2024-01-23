package Unit4.Lesson18;

/**
 * Author:      Mason Jones
 * Lab:         18.1 Rolling
 * Date:        12/08/2023
 * Description: A program that simulates the roll of three 6-sided die and keeps
 *              rolling until all die are different values from each other
 * Purpose:     Learn how boolean algebra works and use DeMorgan's law 
 */
import java.lang.Math;
import apcslib.*;
public class Rolling
{
   public static void main(String[] args) {
       int randInt1, randInt2, randInt3;
       int count = 0;
       
       while (true) {
           count++;
           randInt1 = randNum();
           randInt2 = randNum();
           randInt3 = randNum();
           System.out.println(randInt1 + Format.right(randInt2,3)+Format.right(randInt3,3));
           //true if all expressions are false
           if (!(randInt1 == randInt2 || randInt1 == randInt3 || randInt2 == randInt3)) {
               System.out.println("count = "+ count);
               break;
           }
       }
   }
   private static int randNum() {
        return (int) (Math.random()*6)+ 1; //random integer from a range of 1-6
    }
}

