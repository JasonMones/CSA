package Unit2;

/** 
* Author:      Mason Jones
* Date:        10/02/2023
* Lab:         8.1 IRS
* Description: A program that calculates the federal tax an individual or married couple have to pay every year 
* Purpose:     Learn how to use the logical if, if else, and else statements to create functional code based off cases and use the and (&&) and or(||) operators to create 
*              additional functionality for more complex cases
*/


public class TaxPayer
{
private double myIncome;
private String myStatus;
public TaxPayer(double income, String martialStatus)
{
myIncome = income;
myStatus = martialStatus.toLowerCase();               //makes entire string lower case
}
public double getIncome() {
return myIncome;
}
public String getStatus() {
return myStatus;
}
public double calculateTax() {
char firstChar = myStatus.charAt(0);                //finds first letter of string
if (firstChar == 's') {                             //s for single
return singleTax();
}
else if (firstChar == 'm') {                        //m for married
return marriedTax();
}
else return 0;
}
private double singleTax() {
double percentageAmount;                            
if (myIncome > 297350) {
percentageAmount = myIncome-297350;             //finds amount to be deducted by a percentage     
return 93374 + percentageAmount*(0.391);        //return initial tax and percent of income over a certain amount
}
else if (myIncome > 136750 && myIncome < 297350) {   //repeat for each tax bracket
percentageAmount = myIncome-136750;
return 36361 + percentageAmount*(0.355);
}
else if (myIncome > 65550 && myIncome < 136750) {
percentageAmount = myIncome-65550;
return 36361 + percentageAmount*(0.305);
}
else if (myIncome > 27050 && myIncome < 65550) {
percentageAmount = myIncome-27050;
return 36361 + percentageAmount*(0.275);
}
else {
return myIncome*(0.15);
}
}
private double marriedTax() {
double percentageAmount;
if (myIncome > 297350) {
percentageAmount = myIncome-297350;           //finds amount to be deducted by a percentage  
return 88306 + percentageAmount*(0.391);      //return initial tax and percent of income over a certain amount
}
else if (myIncome > 166500 && myIncome < 297350) { //repeat for each tax bracket
percentageAmount = myIncome-166500; 
return 41855 + percentageAmount*(0.355);
}
else if (myIncome > 109250 && myIncome < 166500) {
percentageAmount = myIncome-109250;
return 24393.75 + percentageAmount*(0.305);
}
else if (myIncome > 45200 && myIncome < 109250) {
percentageAmount = myIncome-45200;
return 6780 + percentageAmount*(0.275);
}
else {
return myIncome*(0.15);
}
}
}
