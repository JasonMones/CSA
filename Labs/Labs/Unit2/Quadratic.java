package Unit2;


/**
* Author:      Mason Jones
* Date:        9/20/2023
* Lab:         5.2 Quadratic
* Description: This program inputs the coefficients of a second degree polynomial and outputs the roots using the quadratic formula
* Purpose:     Learn to use the Math class to use operations such as exponents and square roots 
*/

import chn.util.*;         //import chn.util to use ConsoleIO
import apcslib.*;          //import apcslib for the Format class
public class Quadratic
{
public static void main(String[] args) {
ConsoleIO kb = new ConsoleIO();                                       //instantiate an instance of the ConsoleIO class as kb
System.out.println("Input a,b,c (ax^2+bx+c): ");                      //prompt user to input a b and c values of a quadratic
                        //read the 3 numbers the user inputs
double a = kb.readDouble(); 
double b = kb.readDouble();
double c = kb.readDouble();

double x1 = (-b)/(2*a)+(Math.sqrt(Math.pow(b,2)-(4*a*c))/(2*a));     //find the root when adding 
double x2 = (-b)/(2*a)-(Math.sqrt(Math.pow(b,2)-(4*a*c))/(2*a));     //find the root when subtracting

System.out.println("x1 = " + Format.left(x1,1,4));                   //print the value of the root when adding
System.out.println("x2 = " + Format.left(x2,1,4));                   //print the value of the root when subtracting
}
}
