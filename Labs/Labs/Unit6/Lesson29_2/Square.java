package Unit6.Lesson29_2;



public class Square extends Shape
{
    private double mySide;
    public Square (String name, double side) {
        super(name);
        mySide = side;
    }
    public void calcPerimeter() {
        myPerimeter = mySide*4;
    }
    public void calcArea() {
        myArea = mySide*mySide;
    }
}
