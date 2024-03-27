package Unit3.Lesson11;

/**
* Author:      Mason Jones
* Date:        10/17/2023
* Lab:         11.1 Grades
* Description: A program that inputs a student's report gard and outputs their GPA and whether
*              they are eligible for sports and extracirriculars or not
* Purpose:     Learn how to use switch statements to test cases of the possible values of a variable
*/
import chn.util.*;
public class Grades {
public static void main(String[] args) {
ConsoleIO kb = new ConsoleIO();
System.out.print("Input grades: ");
String letterGrades = kb.readLine();

char specInd;
int numGrades = 0;
double totalPoints = 0;
boolean fGrade = false;
for (int i=0;i <= letterGrades.length(); i+=2) {
specInd = letterGrades.toUpperCase().charAt(i);                //first uppercase to make more efficient, then find specific characters for each grade
switch (specInd) {
case 'A':                                                  //case of having grade A
totalPoints += 4;                                       //has value of 4, adds for GPA calc
numGrades++;                                            //number of grades for GPA calc                        
break;                                                  //breaks when case is true
case 'B':                                                  //repeat for each letter grade
totalPoints += 3;
numGrades++;
break;
case 'C':
totalPoints += 2;
numGrades++;
break;
case 'D':
totalPoints += 1;
numGrades++;
break;
case 'F':
numGrades++;
fGrade = true;                                       //to make ineligible if f grade
break;
}
}
double GPA = totalPoints/numGrades;
GradesMethods.checkEligibility(numGrades, fGrade, GPA);
}
}