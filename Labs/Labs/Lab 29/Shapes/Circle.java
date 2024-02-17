
/**
 * Description: Prints out the shape, perimeter, and area
 * Purpose: To continue to learn how to use abstract classes
 * Author: Kevin Dunkel
 * Version: 2/15/24
 * Lab: 29.2
 */

public class Circle extends Shape
{
    private double myRadius;	// length of radius

    // initializes myName and myRadius
    public Circle (String name, double Radius){
    super(name);
    myRadius = Radius;
    }

    public void calcPerimeter(){
    myPerimeter = (Math.PI * 2 * myRadius);
    }

    public void calcArea(){
    myArea = (Math.PI * (Math.pow(myRadius, 2)));
    }
}
