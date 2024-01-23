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

class Person {
    protected String myName ;   // name of the person
    protected int myAge;        // person's age
    protected String myGender;  // "M" for male, "F" for female

    // constructor
    public Person(String name, int age, String gender) {
        myName = name; 
        myAge = age ; 
        myGender = gender; 
    }

    // toString method for the generic person class
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " +myGender;
    }
    
    // Setter methods for Name, Age, and Gender
    public void setName(String name) {
        myName = name;
    }
    public void setAge(int age) {
        myAge = age;
    }
    public void setGender(String gender) {
        myGender = gender;
    }
    
    // Getter methods for Name, Age, and Gender
    public String getName() {
        return myName;
    }
    public int getAge() {
        return myAge;
    }
    public String getGender() {
        return myGender;
    }
}