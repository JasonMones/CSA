
/**
 * Description: Prints out the shape, perimeter, and area
 * Purpose: To continue to learn how to use abstract classes
 * Author: Kevin Dunkel
 * Version: 2/15/24
 * Lab: 29.2
 */
public abstract class Shape
{
    protected String myName;
    protected double myPerimeter;
    protected double myArea;

    public Shape(String name) {
         myName = name;
    }

    // returns myName
    public String getName(){
        return myName;
    }

    // returns myPerimeter

    public double getPerimeter(){
        return myPerimeter;
    }

    // returns myArea

    public double getArea(){
        return myArea;
    }

    // abstract method - calculates perimeter and stores in myPerimeter

    public abstract void calcPerimeter();

    // abstract method - calculates area and stores in myArea

    public abstract void calcArea();

}
