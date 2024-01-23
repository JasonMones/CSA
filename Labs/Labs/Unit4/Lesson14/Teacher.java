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

class Teacher extends Person {
    protected String mySubject;   //subject teacher teaches
    protected double mySalary;    //teacher salary

    // constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        // use the super class' constructor
        super(name, age, gender);

        // initialize what's new to Teacher
        mySubject = subject;
        mySalary = salary;
    }
    //setter name
    public void setSubject(String subject) {
        mySubject = subject;
    }
    public void setSalary(double salary) {
        mySalary = salary;
    }
    //getter methods
    public String getSubject() {
        return mySubject;
    }
    public double getSalary() {
        return mySalary;
    }
    
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
}