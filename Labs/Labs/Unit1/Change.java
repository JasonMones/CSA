package Unit1;


/**
* Author:      Mason Jones
* Date:        09/06/2023
* Lab:         4.1 Change
* Description: Takes input on the total price of a purchase and how much cash is tendered and finds how many coins to give back as change and details how many
*              quarters, dimes, nickels, and pennies, and formats it with the apcslib module Format
* Purpose:     Learn how to use the ConsoleIO module and use information that is inputted by a user, and learn to use the format package in apcslib, use typecasting
*              to change the datatypes of variables to compatible datatypes that work for methods used
 */
import chn.util.ConsoleIO;
import apcslib.*;
import java.lang.Math;
public class Change
{
    public static void change()
    {
      ConsoleIO kb = new ConsoleIO();                                 //create an instance of an object that can detect input
      System.out.println("Amount of purchase: ");                     //prompt to input the price of the purchase
      double price = kb.readDouble();                                 //define variable price as the user input
      
      System.out.println("Amount of cash tendered: ");                //prompt to input the amount of cash used to pay
      double paid = kb.readDouble();                                  //define variable paid as the user input
      
      
      double coins = ((paid-price) - Math.floor(paid-price))*100;     //mathematical expression used to give the amount of coins that need to be paid back
      int quarters = (int) coins/25;                                  //find how many quarters that need to be paid back and typecast it to an int
      int remainder = (int) coins%25;                                 //find how many coins left that need to be paid back after quarters
      
      int dimes = remainder/10;                                       //find how many dimes that need to be paid back and typecast it to an int
      remainder = remainder%10;                                       //find how many coins left that need to be paid back after dimes
      
      int nickels = remainder/5;                                      //find how many nickels that need to be paid back and typecast it to an int
      int pennies = remainder%5;                                      //find how many coins left that need to be paid back after nickels
      
      int coin = (int) coins;                                         //typecast the double coins to an int variable
      
      System.out.println("Amount of purchase = " + price + "\n");     //print how much the purchase was and skip a line
      System.out.println("Cash tendered = " + paid + "\n");           //print how much you paid and skip a line
      System.out.println("Amount of coins needed:" + "\n");           //print the header of coins to pay back and skip a line
      System.out.println(Format.right(coin, 4) + " cents = " + "\n"); //print total amount of cents and skip a line
      System.out.println(Format.right(quarters, 5) + " quarters");    //print how many quarters needed and formatting
      System.out.println(Format.right(dimes, 5) + " dimes");          //print how many dimes needed and formatting
      System.out.println(Format.right(nickels, 5) + " nickels");      //print how many nickels needed and formatting
      System.out.println(Format.right(pennies, 5) + " pennies");      //print how many pennies needed and formatting
      
    }
}
