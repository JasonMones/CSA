package Unit2;

/**  
 * Author:      Mason Jones
 * Date:        09/29/2023
 * Lab:         7.3 Rectangle Methods
 * Description: Improves the Rectangle class in lab 6.2 and adds several methods to retrieve information about the objects and change information and redraw it
 * Purpose:     Get more familiar with calling methods from an object and creating more complex classes that can be instantiated as objects
 */

public class TestRectangleLab7
{
    public static void main(String[] args) {
        Rectangle rectA = new Rectangle(0,0,200,50);                                //instantiate a Rectangle object 
        rectA.setDirection(90);                                                     //orientate rectangle preferred direction
        Rectangle rectB = new Rectangle(rectA);                                     //Make a copy of rectA
        
        int xRectB = -200;                                                          //initialize a variable that will be the reference point of text around rectB
        int yRectB = 150;                                                            //same
        
        rectB.setXPos(xRectB);
        rectB.setYPos(yRectB);
        rectB.draw();
        rectB.drawString("Width = "+rectB.getWidth(),xRectB+30,yRectB+55);           //draw string around rectB
        rectB.drawString("Height = "+rectB.getHeight(),xRectB+210,yRectB+20);
        rectB.drawString("Perimeter = "+rectB.getPerimeter(),xRectB+30,yRectB-15);
        rectB.drawString("Area = "+rectB.getArea(),xRectB+25,yRectB+15);

        final int turn = 30;                                                         //how many degrees next rectangle will be from previous
        final int widthDec = 10;                                                     //how much each rectnagle decreases by
        rectA.draw();                                                                //draws initial rectangle

                                                   //turn clockwise by turn decrement and decrease width by width decrement and draw repeat 10 times
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection()-turn);
        rectA.setWidth(rectA.getWidth()-widthDec);
        rectA.draw();
    }
}
