package Unit2;

 
import apcslib.*;
import java.awt.geom.Point2D.Double;

public class Rectangle
{
      private double myX;                                         //x coordinate of left corner of rectangle
      private double myY;                                         //y coordinate of left corner of rectangle
      private double myWidth;                                     //width of rectangle
      private double myHeight;                                    //height of rectangle
      private double myDirection;

      private static SketchPad screen = new SketchPad(500,500);   //instantiate sketch pad object
      private static DrawingTool trtl = new DrawingTool(screen);  //instantiate drawing tool object

    public Rectangle()
    {
        myX = 0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
        myDirection = 0;
    }  
    public Rectangle(double x,double y,double width,double height)
    {
       myX = x;                 //set xcoord to user input
       myY= y;                  //set ycoord to use input
       myWidth = width;         //set width to user input
       myHeight = height;       //set height to user input
       myDirection = 0;
    }
    public Rectangle(Rectangle rect)
    {
        myX = rect.getXPos();
        myY = rect.getYPos();
        myWidth = rect.getWidth();
        myheight = rect.getHeight();
        myDirection = rect.getDirection();
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
