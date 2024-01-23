package Unit3.Lesson9;

/**
 * Author:      Mason Jones
 * Date:        10/9/2023
 * Lab:         9.1 LoanTable
 * Description: A program that inputs the principal, how many years it takes to pay off the loan, and a high and low interest rate to print the monthly payments at an increment of 0.25%
 *              between low and high rates
 * Purpose:     Learn to use while loops to loop through a code block while a condition is true
 */
import chn.util.*;
import apcslib.*;
public class LoanTable {
    public static void main() {
        double principal, interestRate;
        int years, lowRate, highRate;
                            //initialize variables with user input
        ConsoleIO kb = new ConsoleIO();
        System.out.print("Input principal: ");
        principal = kb.readDouble();
        System.out.print("Input length of the loan in years: ");
        years = kb.readInt();
        
        do {                                                         //test to see if user inputted valid low and high interest rates
            System.out.print("Input lowest interest rate: ");
            lowRate = kb.readInt();
            System.out.print("Input highest interest rate: ");
            highRate = kb.readInt();
            if (lowRate > highRate) {                                //if low rate i shigher than highest rate, iterate loop again until user inputs a rate lower than high rate
                System.out.println("Lowest interest rate is higher than highest interest rate, reinput.");
            }
        } while(lowRate > highRate);
        System.out.println("\n" + Format.left("Annual Interest Rate",0) + Format.right("Monthly Payment", 19)+ "\n");                   //formating for headers of table
        interestRate = (double) lowRate;                             //typecast to do operations with doubles
        while (interestRate <= highRate) {
            System.out.println(Format.right(interestRate,10,2) + Format.right(monthlyPayment(interestRate, principal, years),26,2));    //formats the main body of table 
            interestRate += 0.25;
        }
    }
    private static double monthlyPayment(double interestRate, double loanAmount, int years) {
        double currentRate = interestRate/100;                               //change to a percent
        double monthlyRate = currentRate/12;                                 //annual to monthly rate
        int numMonthlyPayments = years*12;                                   
        double expression = Math.pow(1+monthlyRate, numMonthlyPayments);     //expression used in terms of monthly rate and number of monthly payments
        
        return ((loanAmount*monthlyRate*expression)/(expression-1));         //return the formula defined in the lesson
    }
}
