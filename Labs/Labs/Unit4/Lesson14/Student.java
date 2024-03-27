package Unit4.Lesson14;

/**
* Author:      Mason Jones
* Lab:         14.1 BackToSchool
* Date:        12/01/2023
* Description: A program that creates mutiple classes that stores information about specefic people
*              a parent class Person, which is extended by student and teacher, and college student
*              which extends student, which all contain their superclasses information with extra
*              information pertaining to that class
* Purpose:     Learn about inheritance and how subclasses inherit data for their parent classes, and 
*              how to optimize time and memory by not repeating information
*/

class Student extends Person {
protected String myIdNum;    // Student Id Number
protected double myGPA;      // grade point average

// constructor
public Student(String name, int age, String gender, String idNum, double gpa) {
// use the super class' constructor
super(name, age, gender);

// initialize what's new to Student
myIdNum = idNum;
myGPA = gpa;
}
//setter methods
public void setId (String idNum) {
myIdNum = idNum;
}
public void setGPA(double GPA) {
myGPA = GPA;
}
//getter methods
public String getId() {
return myIdNum;
}
public double getGPA() {
return myGPA;
}

public String toString() {
return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
}
}