package Unit4.Lesson15;

/**
 * Author:      Mason Jones
 * Lab:         15.1 Fibonacci
 * Date:        12/06/2023
 * Description: Creates a program that finds the value of the fibonacci series at a specified index,
 *              both recursively and non-recursively, and creates a recursive method that multiplies
 *              two numbers together
 * Purpose:     Learn how to create recursive functions and solve problems
 */

public class FibonacciTester
{
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println("The recursively defined Fibonacci series at index 0 is " + fib.fib(0));
        System.out.println("The recursively defined Fibonacci series at index 3 is " + fib.fib(3));
        System.out.println("The recursively defined Fibonacci series at index 11 is " + fib.fib(11));
        System.out.println("The non-recursively defined Fibonacci series at index 1 is " + fib.nonRecFib(1));
        System.out.println("The non-recursively defined Fibonacci series at index 5 is " + fib.nonRecFib(5));
        System.out.println("The non-recursively defined Fibonacci series at index 14 is " + fib.nonRecFib(14));
        System.out.println("The recursively defined function multiplies two numbers 0 and 4 to get " +fib.mult(0,4));
        System.out.println("The recursively defined function multiplies two numbers 3 and 1 to get " +fib.mult(3,1));
        System.out.println("The recursively defined function multiplies two numbers 7 and 8 to get " +fib.mult(7,8));
        System.out.println("The recursively defined function multiplies two numbers 5 and 0 to get " +fib.mult(5,0));
    }
}
