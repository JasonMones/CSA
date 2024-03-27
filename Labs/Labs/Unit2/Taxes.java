package Unit2;


/**
*Author:      Mason Jones
*Date:        9/12/2023
*Lab:         5.1 Taxes
*Description: A program that takes an input of the hours worked and their hourly rates and calculates their income before and after taxes
*Purpose:     Learn to multiply decimal values and output them in a meaningful manner that can be used by the user, learn how to create and define constants with the use of the 
*             the keyword 'final'
*/
import chn.util.*;         //import consoleIO
import apcslib.*;          //import formatting
public class Taxes
{
//define tax rates
final static double FTAX = 0.15;
final static double FICA = 0.0765;
final static double STAX = 0.04;
public static void main()
{
ConsoleIO kb = new ConsoleIO();      //create an instance of the ConsoleIO class
   //prompt user to input how many hours they worked and store their input in a variable
System.out.println("How many hours did you work this week?");         
int hours = kb.readInt();
   //prompt user to input their houry wage and store their input in a variable
System.out.println("What is your hourly rate?");
double rate = kb.readDouble();
  //find users income before taxes
double gross = hours*rate;
  //find tax deductibles
double ftax = gross*FTAX;
double fica = gross*FICA;
double stax = gross*STAX;
  //calculate actual income after taxes
double net = gross-ftax-fica-stax;

  //output what user inputted, amount of tax collected per type, and their income after taxes are collected
System.out.println("Hours worked" + Format.right(hours,13));
System.out.println("Hourly rate" + Format.right(rate,14,2) + "\n");
System.out.println("Gross pay" + Format.right(gross,16,2) + "\n");
System.out.println("Federal tax (15%)" + Format.right(ftax,8,2));
System.out.println("FICA (7.65%)" + Format.right(fica,13,2));
System.out.println("State tax (4%)" + Format.right(stax,11,2) + "\n");
System.out.println("Net pay" + Format.right(net,18,2));




}
}
