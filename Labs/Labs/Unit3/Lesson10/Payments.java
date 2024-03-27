package Unit3.Lesson10;

/**
* Author:      Mason Jones
* Date:        10/18/2023
* Lab:         10.2 Payments
* Description: A program that inputs the starting principal, how much you pay
*              per month, and the annual interest rate and outputs a table
*              that gives you the month, the principal for that month,
*              the extra interest paid that month, the monthly payment, and the
*              new balanace after the payment until you are able to finish paying
*              it off on that month
* Purpose:     learn how to use do while loops, which iterate through the loop
*              once and then keeps looping through it until the condition is false
*/
import apcslib.*;
import chn.util.*;
public class Payments {
public static void main(String[] args) {
double principal, monPay,monIntRate, intrst, initPrincipal, intrstCounter;
int annIntRate, month;
ConsoleIO kb = new ConsoleIO();

System.out.print("Input principal: ");
principal = kb.readDouble();
System.out.print("Input monthly payment: ");
monPay = kb.readDouble();
System.out.print("Input annual interest: ");
annIntRate = kb.readInt();
monIntRate = annIntRate/12.0;
System.out.println("Month" + Format.right("Principal",20)+Format.right("Interest",20) + Format.right("Payment",20) + Format.right("New Balance",20)+"\n");

month = 1;
intrstCounter = 0;
do {
initPrincipal = principal;
intrst = monIntRate*initPrincipal/100.0;
intrstCounter += intrst;
principal += intrst - monPay;
System.out.println(Format.right(month,3)+Format.right(initPrincipal,22,2)+Format.right(intrst,20,2)+Format.right(monPay,20,2)+Format.right(principal,20,2));
month++;
} while (principal > monPay);
System.out.println("\n" + Format.right(intrstCounter,45,2) + "  total interest");
}
}
