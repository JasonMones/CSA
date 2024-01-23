package Unit1;


/**
 * Author:      Mason Jones
 * Date:        26/08/2023
 * Lab:         LA2.1 Benzene
 * Description: Benzene is an organic compound that is represented by
 *              a circle centered within a hexagon. This program draws
 *              this compound with the apcslib library
 * Purpose:     Utilize apcslib to draw precise shapes and use more methods
 *              defined in the documentation of apcslib
 */
import apcslib.*;                       //imports the apcslib library 
import java.lang.Math;                  //import the math library
import java.awt.geom.Point2D.Double;    //import the Double object
public class DrawBenzene
{
    static SketchPad screen = new SketchPad(800,800);      //create an object to output a drawing space
    static DrawingTool trtl = new DrawingTool(screen);     //create an object that can output onto the drawing space object
       public static void main(int sideLength) {
            drawBenzene(sideLength);                //call the function drawBenzene
            trtl.up();                              //disable drawing mode
            trtl.setDirection(0);                   //set direction to +x
            trtl.move(sideLength);                  //move forward the amount of pixels inputted to the parameter sideLength
            trtl.down();                            //enable drawing mode
            trtl.move(sideLength*0.4);              //create connecting bar for googles
            trtl.up();                              //disable drawing mode
            trtl.move(sideLength);                  //move to the center of the right eye
            trtl.down();                            //enable drawing mode
            drawBenzene(sideLength);                //call the function drawBenzene with side lengths of the inputted parameter
            
    }
       private static void drawBenzene(int sideLength)
    {
            
                                            //position and draw hexagon 
           Double startPos = trtl.getPosition();                                              //turns the drawing tools current coordinates into an object 
           trtl.up();                                                                         //disable drawing mode
           trtl.move(startPos.x + sideLength/2, startPos.y-(sideLength*Math.sqrt(3)/2));        //move to the specified coordinates (bottom right corner)
           trtl.down();                                                                       //enable drawing mode
           trtl.setDirection(180);                                                            //set direction to -x
           trtl.move(sideLength);                                                             //draw a sideLengthpx line with the drawing tool
           trtl.turnRight(60);                                                                //turn the drawing tool 60 degrees to the right
           trtl.move(sideLength);                                                             //draw a sideLengthpx line with the drawing tool
           trtl.turnRight(60);                                                                //turn the drawing tool 60 degrees to the right
           trtl.move(sideLength);                                                             //draw a sideLengthpx line with the drawing tool
           trtl.turnRight(60);                                                                //turn the drawing tool 60 degrees to the right
           trtl.move(sideLength);                                                             //draw a sideLengthpx line with the drawing tool
           trtl.turnRight(60);                                                                //turn the drawing tool 60 degrees to the right
           trtl.move(sideLength);                                                             //draw a sideLengthpx line with the drawing tool
           trtl.turnRight(60);                                                                //turn the drawing tool 60 degrees to the right
           trtl.move(sideLength);                                                             //draw a sideLengthpx line with the drawing tool
           trtl.turnRight(60);                                                                //turn the drawing tool 60 degrees to the right
                                           //position and draw inner circle
           trtl.up();                                                                         //disable drawing mode
           trtl.move(sideLength/2);                                                           //move to the center of the bottom side
           trtl.turnRight(90);                                                                //turn 90 degrees to the right
           trtl.move((sideLength/2)*Math.sqrt(3));                                            //move to the center of the hexagon(using trig)
           trtl.down();                                                                       //enable drawing mode
           trtl.drawCircle(sideLength*0.70);                                                  //use the drawing tool to create a circle with radius 200      
           trtl.up();                                                                         //disable drawing mode
           trtl.move(startPos.x,startPos.y);                                                  //move to beginning of drawing  
           trtl.down();                                                                       //enable drawing mode
    }
    
}
