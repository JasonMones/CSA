package Unit2;

/**
* Author:      Mason Jones
* Date:        9/25/2023
* Lab:         7.1 Fun
* Description: Creates a class with 4 user defined functions that convert celsius to fahrenheit, fahrenheit to celsius, finds the volume of a sphere given its radius, and finds the
*              hypotenuse of a right triangle given its side lengths and runs test outputs for each method
* Purpose:     Learn to use static methods than can be accessed from another class without the instantiation of an object
*/

import apcslib.*;

public class FunMain {
public static void main(String[] args)
{
System.out.println("\n" + "Fahrenheit to Celsius: ");                           //Test outputs and formatting for fahrenheit to celsius
System.out.println("212 F --> " + Format.left(Fun.fToC(212), 10, 2));
System.out.println("98.6 F --> " + Format.left(Fun.fToC(98.6), 10, 2));
System.out.println("10 F --> " + Format.left(Fun.fToC(10), 10, 2));

System.out.println("\n" + "Celsius to Fahrenheit: ");                           //Test outputs and formatting for celsius to fahrenheit
System.out.println("-15 C --> " + Format.left(Fun.cToF(-15), 10, 2));
System.out.println("0 C --> " + Format.left(Fun.cToF(0), 10, 2));
System.out.println("70 C --> " + Format.left(Fun.cToF(70), 10, 2));

System.out.println("\n" + "Radius of sphere to volume: ");                      //Test outputs and formatting for radius to volume of a sphere
System.out.println("1 R --> " + Format.left(Fun.sphereVolume(1), 10, 2));
System.out.println("2.25 R --> " + Format.left(Fun.sphereVolume(2.25), 10, 2));
System.out.println("7.5 R --> " + Format.left(Fun.sphereVolume(7.5), 10, 2));

System.out.println("\n" + "Legs of a right triangle to hypotenuse: ");          //Test outputs and formatting for side lengths to hypotenuse
System.out.println("3 A, 4 B --> " + Format.left(Fun.hypotenuse(3,4), 10, 2));
System.out.println("6.75 A, 12.31 B --> " + Format.left(Fun.hypotenuse(6.75,12.31), 10, 2));

} 
}