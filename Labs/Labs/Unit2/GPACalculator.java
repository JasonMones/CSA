package Unit2;

/**
 * Author:      Mason Jones
 * Date:        9/22/2023
 * Lab:         6.1 StudentGPA
 * Description: Creates a class 'student' that takes the students name and ID number and has methods that can be used to calculate the students GPA given individual grades they have 
 * Purpose:     Learn to create classes that you can then instantiate as an object in another class and use the methods defined inside
 */
import apcslib.*;         //import apcslib for formatting
import chn.util.*;        //import chn.util for consoleIO
public class GPACalculator {
    public static void main(String[] args)
    {
        ConsoleIO kb = new ConsoleIO();                                      //instantiate a new ConsoleIO object

        System.out.print("Student's name: ");                                //prompt user to input their name
        String studentName = kb.readLine();                                 //read user input

        System.out.print("Student's ID: ");                                  //prompt user to input ID
        String studentID = kb.readToken();                                   //read user input

        Student stud = new Student(studentName, studentID);                  //instantiate the class Student as an object

        double studentGPA = stud.getGPA();                                   //get initial GPA (should be 0) and store it in studentGPA
        System.out.println("\n" + "Initial GPA: " + studentGPA + "\n");      //print initial GPA

        System.out.print("Enter a grade: ");                                 //prompt user to enter their first grade
        int grade = kb.readInt();                                            //store user input in the variable grade
        stud.addGrade(grade);                                                //add grade to total points and number of grades added
        studentGPA = stud.getGPA();                                          //get updated GPA and store it in studentGPA variable
        System.out.println("GPA: " + Format.left(studentGPA,1,2) + "\n");    //print GPA and format

        //repeat last 5 lines 3 more times
        System.out.print("Enter a grade: ");
        grade = kb.readInt();
        stud.addGrade(grade);
        studentGPA = stud.getGPA();
        System.out.println("GPA: " + Format.left(studentGPA,1,2) + "\n");

        System.out.print("Enter a grade: ");
        grade = kb.readInt();
        stud.addGrade(grade);
        studentGPA = stud.getGPA();
        System.out.println("GPA: " + Format.left(studentGPA,1,2) + "\n");

        System.out.print("Enter a grade: ");
        grade = kb.readInt();
        stud.addGrade(grade);
        studentGPA = stud.getGPA();
        System.out.println("GPA: " + Format.left(studentGPA,1,2) + "\n");
    }
}

