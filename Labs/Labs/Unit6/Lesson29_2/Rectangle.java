package Unit6.Lesson29_2;



public class Rectangle extends Shape
{
private double myWidth;
private double myLength;
public Rectangle (String name, double length, double width) {
super(name);
myLength = length;
myWidth = width;
}
public void calcPerimeter() {
myPerimeter = (2*myLength)+(2*myWidth);
}
public void calcArea() {
myArea = myLength*myWidth;
}
}