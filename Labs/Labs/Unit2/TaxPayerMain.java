package Unit2;

/** 
* Author:      Mason Jones
* Date:        10/02/2023
* Lab:         8.1 IRS
* Description: A program that calculates the federal tax an individual or married couple have to pay every year 
* Purpose:     Learn how to use the logical if, if else, and else statements to create functional code based off cases and use the and (&&) and or(||) operators to create 
*              additional functionality for more complex cases
*/

import chn.util.*;
import apcslib.*;
public class TaxPayerMain
{
public static void main(String[] args) {
String martialStatus;
double income;

ConsoleIO kb = new ConsoleIO();                   //intialize ConsoleIO object
System.out.print("Martial Status: ");
martialStatus = kb.readToken().toLowerCase();     //read token and make all letters in the string lowercase
System.out.print("Taxable Income: ");
income = kb.readDouble();

TaxPayer tp = new TaxPayer(income, martialStatus); //create an instance of the class I defined with the user input


System.out.println("\n" + martialStatus.substring(0,1).toUpperCase() + martialStatus.substring(1));      //make first character of martial status uppercase and keep rest of string lowercase
System.out.println("Taxable income = $ " + Format.left(income,1,2));                                     //round taxable income to 2 decimal places and print
System.out.println("Federal tax = $ " + Format.left(tp.calculateTax(),1,2));                             /**call method from class that calculates the tax for the martial status and 
                                                                                             *tax bracket */
}
}
