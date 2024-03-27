package Unit3.Lesson10;

/**
* Author:      Mason Jones
* Date:        10/18/2023
* Lab:         10.2 PaymentsInvestments
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
public class PaymentsInvestments {
public static void main(String[] args) {
double principal, monAddPay,monReturnRate, addition, initPrincipal, totalReturnCounter;
int annReturnRate, month, monthTerm;
final double twelve = 12;
final double hundred = 100;
ConsoleIO kb = new ConsoleIO();

System.out.print("Input principal: ");
principal = kb.readDouble();
System.out.print("Input monthly additional payment: ");
monAddPay = kb.readDouble();
System.out.print("Input number of months: ");
monthTerm = kb.readInt();
System.out.print("Input annual rate of return: ");
annReturnRate = kb.readInt();
monReturnRate = annReturnRate/twelve;
System.out.println("Month" + Format.right("Principal",20)+Format.right("Return",20) + Format.right("Payment",20) + Format.right("New Balance",20)+"\n");

month = 1;
totalReturnCounter = 0;
for (month = 1; month <= monthTerm; month++) {
initPrincipal = principal;
addition = monReturnRate*initPrincipal/hundred;
totalReturnCounter += addition;
principal = initPrincipal + addition + monAddPay;
System.out.println(Format.right(month,3)+Format.right(initPrincipal,22,2)+Format.right(addition,20,2)+Format.right(monAddPay,20,2)+Format.right(principal,20,2));

}
System.out.println("\n" + Format.right(totalReturnCounter,45,2) + "  total interest");
}
}
