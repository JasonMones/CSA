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

public class BackToSchoolMain
{
   public static void main(String[] args) {
       Person bob = new Person("Coach Bob", 27, "M");
       System.out.println(bob);
       
       Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
       System.out.println(lynne);
       
       Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
       System.out.println(mrJava);
       
       CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
       System.out.println(ima);
   }
}
