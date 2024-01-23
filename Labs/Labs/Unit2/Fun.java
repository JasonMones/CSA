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
public class Fun {
    public static double fToC(double fahrenheit)
     {
        return (5*(fahrenheit -32))/9;                                             //fahrenheit to celsius formula
    }
    public static double cToF(double celsius)
     {
        return (9*celsius)/5 +32;                                                  //celsius to fahrenheit formula
    }
    public static double sphereVolume(double radius)
     {
        return (4*Math.PI*Math.pow(radius,3))/3;                                  //volume of a sphere formula
    }
    public static double hypotenuse(double sideA, double sideB) 
    {
        return Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));                    //pythagorean theorm
    }
}
