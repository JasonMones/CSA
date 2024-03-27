package Unit6.Lesson29_2;



public class Circle extends Shape
{
private double myRadius;
public Circle (String name, double radius) {
super(name);
myRadius = radius;
}
public void calcPerimeter() {
myPerimeter = 2*Math.PI*myRadius;
}
public void calcArea() {
myArea = Math.PI*Math.pow(myRadius,2);
}
}