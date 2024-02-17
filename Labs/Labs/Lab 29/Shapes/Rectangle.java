
/**
 * Description: Prints out the shape, perimeter, and area
 * Purpose: To continue to learn how to use abstract classes
 * Author: Kevin Dunkel
 * Version: 2/15/24
 * Lab: 29.2
 */
public class Rectangle extends Shape
{
    private double myLength, myWidth;	// length, width

    // initializes myName, myLength, myWidth
    public Rectangle (String name, double length, double width){
        super(name);
        myLength = length;
        myWidth = width;
    }

    public void calcPerimeter(){
        myPerimeter = myLength + myLength + myWidth + myWidth;
    }

    public void calcArea(){
        myArea = myLength * myWidth;
    }
}
