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

class CollegeStudent extends Student {
protected String myMajor;
protected int myYear;
// constructor
public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
// use the super class' constructor
super(name, age, gender, idNum, gpa);
myMajor = major;
myYear = year;
}
//setter methods
public void setMajor(String major) {
myMajor = major;
}
public void setYear(int year) {
myYear = year;
}
//getter methods
public String getMajor() {
return myMajor;
}
public int getYear() {
return myYear;
}

public String toString() {
return super.toString() + ", major: " + myMajor + ", year: " + myYear;
}
}