package Unit3.Lesson11;

/**
* Author:      Mason Jones
* Date:        10/17/2023
* Lab:         11.1 Grades
* Description: A program that inputs a student's report gard and outputs their GPA and whether
*              they are eligible for sports and extracirriculars or not
* Purpose:     Learn how to use switch statements to test cases of the possible values of a variable
*/

import apcslib.*;
public class GradesMethods
{     public static void checkEligibility(int numGrades,boolean fGrade,double GPA) {
if (numGrades < 4) {                  //if not taking enough classes
System.out.println("GPA = " + Format.right(GPA,1,2) + "     Ineligible, taking less than 4 classes.");
} else if (GPA < 2 && fGrade) {       //if GPA less than 2.00 and a grade of f
System.out.println("GPA = " + Format.right(GPA,1,2) + "     Ineligible, gpa below 2.0 and has F grade");
} else if (GPA < 2) {                 //if GPA less than 2.00 but no f grade
System.out.println("GPA = " + Format.right(GPA,1,2) + "     Ineligible, gpa below 2.0");
} else if (fGrade) {                  //if GPA greater than 2.00 but a grade of f
System.out.println("GPA = " + Format.right(GPA,1,2) + "     Ineligible, gpa above 2.0 but has F grade");
} else {                              //if 4 or more classes, GPA greater than 2.00 and no grade of f
System.out.println("GPA = " + Format.right(GPA,1,2) + "     Eligible");
}
}

}
