
/**
 * Description: Prints out the shape, perimeter, and area
 * Purpose: To continue to learn how to use abstract classes
 * Author: Kevin Dunkel
 * Version: 2/15/24
 * Lab: 29.2
 */
import apcslib.*;
import chn.util.*;
public class ShapeTester{
    public static void main(String[] args) {
        // instantiate Shapes array
        Shape[] shapes = new Shape[3];

        // construct each Shape object
        // 	Square with side length 3
        shapes[0] = new Square("square", 3);
        //	Circle with radius 3
        shapes[1] = new Circle("circle", 3);		
        // 	Rectangle with length 3 and width 4
        shapes[2] = new Rectangle("rectangle", 3, 4);

        // calculate and print information for each shape
        System.out.println(Format.left("Shape", 12) + Format.left("Perimeter", 12) + Format.left("Area", 12));
        System.out.println();
        for (Shape s : shapes)
        {
            s.calcPerimeter();
            s.calcArea();
            System.out.println(Format.left(s.getName(), 12) + 
                Format.left(s.getPerimeter(), 11, 2) + " " + Format.left(s.getArea(), 12, 2));
        }
    }
}