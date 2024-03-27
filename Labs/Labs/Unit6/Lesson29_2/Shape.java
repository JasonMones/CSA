package Unit6.Lesson29_2;



public abstract class Shape
{
protected String myName;
protected double myPerimeter;
protected double myArea;

public Shape(String name) {
myName = name;
}
public String getName() {
return myName;
}
public double getPerimeter() {
return myPerimeter;
}
public double getArea() {
return myArea;
}

public abstract void calcPerimeter();
public abstract void calcArea();
}
