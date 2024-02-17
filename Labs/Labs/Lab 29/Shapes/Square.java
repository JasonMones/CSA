
/**
 * Description: Prints out the shape, perimeter, and area
 * Purpose: To continue to learn how to use abstract classes
 * Author: Kevin Dunkel
 * Version: 2/15/24
 * Lab: 29.2
 */
public class Square extends Shape
{
    private double mySide;	// length of side

    // initializes myName and mySide
    public Square (String name, double side ){
        super(name);
        mySide = side;
    }

    public void calcPerimeter(){
        myPerimeter = mySide + mySide + mySide + mySide;
    }

    public void calcArea(){
        myArea = mySide * mySide;
    }
}