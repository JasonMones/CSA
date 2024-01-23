/**
 * Author:       Mason Jones
 * Date:         9/14/2023
 * Description:  A program that draws a pumpkin with the use of the DrawingTool class
 */
import apcslib.*;
public class q2
{
    public static void main(String[] args)
    {
       SketchPad screen = new SketchPad(400,400);         //initialize SketchPad object
       DrawingTool trtl = new DrawingTool(screen);        //initialize DrawingTool object
       
       System.out.println(trtl.getColor());     
       
       trtl.drawCircle(50);                               //draw the head of the pumpkin
                     //move to the first vertice of the left eye
       trtl.up();
       trtl.move(-30,10);
       trtl.down();
                     //create triangular left eye
       trtl.move(-10,10);
       trtl.move(-20,30);
       trtl.move(-30,10);
                    //move to the first vertice of the right eye
       trtl.up();
       trtl.move(30,10);
       trtl.down();
                    //create the triangular right eye
       trtl.move(10,10);
       trtl.move(20,30);
       trtl.move(30,10);
                    //move to center of the mouth
       trtl.up();
       trtl.move(0,-20);
       trtl.down();
                    //draw the mouth of radius 10
       trtl.drawCircle(10);
                    //move to start of text
       trtl.up();
       trtl.move(-55,-70);
       trtl.down();
                    //write text
       trtl.drawString("Halloween in 46 days!");
    }
}
