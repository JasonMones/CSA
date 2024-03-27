package Unit2;

/**  
* Author:      Mason Jones
* Date:        09/29/2023
* Lab:         7.3 Rectangle Methods
* Description: Improves the Rectangle class in lab 6.2 and adds several methods to retrieve information about the objects and change information and redraw it
* Purpose:     Get more familiar with calling methods from an object and creating more complex classes that can be instantiated as objects
*/

import apcslib.*;
import java.awt.geom.Point2D.Double;

public class Rectangle
{
private double myX;                                         //x coordinate of left corner of rectangle
private double myY;                                         //y coordinate of left corner of rectangle
private double myWidth;                                     //width of rectangle
private double myHeight;                                    //height of rectangle
private double myDirection;

public static SketchPad rectangleScreen = new SketchPad(500,500);   //instantiate sketch pad object
private DrawingTool trtl = new DrawingTool(rectangleScreen);  //instantiate drawing tool object

public Rectangle()
{
myX = 0;                             //set x to 0
myY = 0;                             //set y to 0
myWidth = 0;                         //set width to 0
myHeight = 0;                        //set height to 0
myDirection = 0;                     //set direction to face due right
}  
public Rectangle(double x,double y,double width,double height)
{
myX = x;                             //set xcoord to user input
myY= y;                              //set ycoord to use input
myWidth = width;                     //set width to user input
myHeight = height;                   //set height to user input
myDirection = 0;                     //set direction to face due right
}
public Rectangle(Rectangle rect)
{
myX = rect.getXPos();               //set x to inputted rectangles x
myY = rect.getYPos();               //set y to inputted rectangles y
myWidth = rect.getWidth();          //set width to inputted rectangles width
myHeight = rect.getHeight();        //set height to inputted rectangles height
myDirection = rect.getDirection();  //set direction to inputted rectangles direction
}
public double getXPos()
{
Double pos = trtl.getPosition();
return pos.x;
}
public double getYPos()
{
Double pos = trtl.getPosition();
return pos.y;
}
public double getWidth()
{
return myWidth;
}
public double getHeight() 
{
return myHeight;
}
public double getDirection()
{
return myDirection;
}
public double getArea()
{
return myWidth*myHeight;            //calculate area
}
public double getPerimeter()
{
return (2*myHeight) + (2*myWidth);    //calculate perimeter
}
public void setXPos(double x)
{
myX = x;
}
public void setYPos(double y) 
{
myY = y;
}
public void setWidth(double width)
{
myWidth = width;
}
public void setHeight(double height)
{
myHeight = height;
}
public void setDirection(double direction)
{
myDirection = direction;
}
public void drawString(String str, double x, double y)
{
trtl.up();
trtl.move(x,y);
trtl.setDirection(myDirection);
trtl.down();
trtl.drawString(str);
}
public void draw()
{
trtl.up();               //disable drawing mode
trtl.move(myX,myY);      //move to bottom left corner of rectangle
trtl.down();             //enable drawing mode
trtl.setDirection(myDirection);
trtl.move(myHeight);     //draw left side
trtl.turnRight(90);      //turn right
trtl.move(myWidth);      //draw top
trtl.turnRight(90);      //turn right
trtl.move(myHeight);     //draw right side
trtl.turnRight(90);      //turn right
trtl.move(myWidth);      //draw bottom
trtl.setDirection(myDirection);
}
}

