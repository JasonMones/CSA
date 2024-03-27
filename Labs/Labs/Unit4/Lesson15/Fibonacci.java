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
public class Fibonacci{
public Fibonacci(){  
}
public int fib(int x){ 
if (x == 0){ 
return 0; 
}else if( x <= 2){ 
return 1; 
}else{ 
return fib(x-1) + fib(x-2);     //returns last two indexes until it reaches 0
}
}
public int nonRecFib(int x){  
if (x == 0) { //explicit definition
return 0; 
}
else if (x == 1 || x == 2) { //explicit definition
return 1; 
}
int fibVal = 1; //index 2 of fib series
int fibInc = 1; //index 1 of fib series
int prevVal = 1; //index 1 of fib series
for (int count = 2; count < x; count++) { 
fibVal += fibInc; //adds inc 
fibInc = prevVal; //sets inc to the previous index
prevVal = fibVal; //sets prev val to current val
}
return fibVal; 
}
public int mult(int a, int b){ 
//Solves for ( a * b ) by recursively adding a, b times.
//Precondition: 0 <= a <= 10; 0 <= b <=10.
if ((0 < a) && (a <= 10) && (0 < b) && (b <= 10)){ 
return a + mult(a, b - 1); 
}
return 0; 
}
}
