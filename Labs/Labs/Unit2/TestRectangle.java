package Unit2;

/**
 * Author:      Mason Jones
 * Date:        9/22/2023
 * Lab:         6.2 Rectangle
 * Description: Create a rectangle class that has arguments of x coordinate, y coordinate, width, and height that you can then instantiate, and has methods to get the perimeter,
 *              get the area, and draw the rectangle
 * Purpose:     Learn to make a class that can then be instantiated as an object, and use arguments that can be used in the object
 */ 

public class TestRectangle
{
    public static void main(String[] args)
    {
      Rectangle square = new Rectangle(-200,-200,300,300);                 //instantiate a rectangle with left corner at (-200,-200), width of 300, height of 300
      Rectangle row = new Rectangle(-200,-100,300,100);                    //instantiate a rectangle with left corner at (-200,-100), width of 300, height of 100
      Rectangle column = new Rectangle(-100,-200,100,300);                 //instantiate a rectangle with left corner at (-100,-200), width of 100, height of 300
      
      square.draw();                                                       //draw the first rectangle
      row.draw();                                                          //draw the second rectangle
      column.draw();                                                       //draw the third rectangle
      
      System.out.println("Area = " + square.getArea());                    //print area of first rectangle
      System.out.println("Perimeter = " + square.getPerimeter() + "\n");   //print perimeter of first rectangle
      
      System.out.println("Area = " + row.getArea());                       //print area of second rectangle
      System.out.println("Perimeter = " + row.getPerimeter() + "\n");      //print perimeter of second rectangle
      
      System.out.println("Area = " + column.getArea());                    //print area of third rectangle
      System.out.println("Perimeter = " + column.getPerimeter());          //print perimeter of third rectangle
    }
}
