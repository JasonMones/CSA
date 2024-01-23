
package Unit2;

import chn.util.*;
public class Student
{
        private String myName;             // student's name 
        private String myID;               // student's ID
        private double myTotalPoints;      // sum of all grades entered
        private double myNumGrades;        // number of grades entered
        private double myGPA;              // student's GPA
    public Student()
    {
        myName = "";                           //set name of student to an empty string
        myID = "";                             //set ID of student to an empty string
        myGPA = 0;                             //set initial GPA
        myNumGrades = 0;                       //set initial number of grades
        myTotalPoints = 0;                     //set initial number of point scores
    }
    public Student(String name, String id) {
        myName = name;                         //set name to input
        myID = id;                             //set id to input
        myGPA = 0;                             //set initial GPA
        myNumGrades = 0;                       //set initial number of grades
        myTotalPoints = 0;                     //set initial number of point scores
    }
    public double getGPA() {
        if(myNumGrades == 0) return 0;              //initial values give division by zero error
        
        myGPA = myTotalPoints/myNumGrades;          //calculate GPA
        return myGPA;                               //return value of GPA
    }
    public void addGrade (int grade) 
    { 
        myNumGrades++;                              //increment number of grades inputted
        myTotalPoints += grade;                     //add inputted grade to total points
    }
}