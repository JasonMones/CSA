package Unit1;


/**
 *Author:      Mason Jones
 *Date:        9/8/2023
 *Lab:         4.2 Car Rental
 *Description: Uses the ConsoleIO package to read a correctly formatted, inputted license plate and converts the letters and numbers 
 *             into ASCII character values for a car rental number
 *Purpose:     Learn how to use the datatype char, learn how ASCII characters work, read tokens, 
 */
import chn.util.ConsoleIO;
import apcslib.*;
public class CarRental
{
    public static void carRental()
    {
       ConsoleIO kb = new ConsoleIO();                                          //create an instance of the ConsoleIO object
                                     //prompt input of car make and store user input in a variable
       System.out.println("Input car make:");
       String make = kb.readToken();
                                     //prompt input of car model and store user input in a variable
       System.out.println("Input car model:");
       String model = kb.readToken();
       
       System.out.println("Input car license plate (3 letters - 3 numbers):");  //prompt input license plate 
       String letters = kb.readToken();                                         //store letters of the license plate 
       int numbers = kb.readInt();                                              //store numbers of the license plate 
       
                                   //put individual ASCII values into individual variables for the letters of the license plate
       int letterASCII1 = letters.charAt(0);
       int letterASCII2 = letters.charAt(1);
       int letterASCII3 = letters.charAt(2);
    
       int ASCII = letterASCII1 + letterASCII2 + letterASCII3 + numbers;                //add up the ASCII values of the letters and numbers
       
       char initLetter = (char) ((ASCII%26) + 'A');                                     //store character at the start of rental tag 
                                         //print out user inputted information about car
       System.out.println("Make = " + make);                                            //print make
       System.out.println("Model = "+ model);                                           //print model
                                                        
       System.out.println(letters + " " + numbers + " = " + initLetter+ASCII);          //format print that license plate equals rental tag
       
           
    }
}
