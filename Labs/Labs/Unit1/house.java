package Unit1;


/**
* Author:      Mason Jones
* Lab:         LA1.1 - DrawHouse
* Date:        8/25/2023
* Description: Draws a house using the drawing functions from the apcslib
*              package, implementing the methods up(), down(), move(), and turn()
* Purpose:     Learn how to use methods to create functionality 
*              and learn to import libraries to use their contained methods
*/
import apcslib.*;   //imports the apcslib library 
//to be used in the rest of the class
public class house
{
public static void sampleMethod()
{
SketchPad screen = new SketchPad(500,1200);  //create drawing space object
DrawingTool trtl = new DrawingTool(screen); //create drawing tool object
trtl.setWidth(4);                     //sets line weight to 4px

trtl.up();                            //disable drawing mode
trtl.move(-100,-100);                 //move to starting position 
trtl.down();                          //enable drawing mode
trtl.setDirection(0);                 //make drawing tool face directly to the right

     //draw rectangular base of house
trtl.move(200);                      //move 200 units pixel right
trtl.turnLeft(90);                   //turn 90 degrees
trtl.move(150);                      //move 150 pixel up
trtl.turnLeft(90);                   //turn 90 degrees left
trtl.move(200);                      //move 200 pixels left
trtl.turnLeft(90);                   //turn left 90 degrees
trtl.move(150);                      //move 150 pixels down

    //position drawing tool to draw roof
trtl.turnLeft(180);                 //turn 180 degrees
trtl.up();                          //disable drawing mode
trtl.move(-100,50);                 //move to top left corner 
trtl.down();                        //enable drawing mode
    //draw roof
trtl.turnRight(18);                 //turn right 18 degrees
trtl.move(316.322635927);           //move 316.322 pixels 18 degrees from the vertical
trtl.turnRight(143);                //turn right 143 degrees
trtl.move(217.922635927);           //move 317.923 
trtl.setDirection(90);
trtl.move(40);
trtl.turnRight(90);
trtl.move(20);
trtl.turnRight(90);
trtl.move(70);
trtl.setDirection(-79);
trtl.move(65);
    //window 1
trtl.up();                          //disables drawing mode
trtl.move(-70,-20);                 //move to coordinates (-70,-20)
trtl.down();                        //enable drawing mode
trtl.setDirection(0);               //set direction to +x
trtl.move(40);                      //move right 40 pixels
trtl.turnLeft(90);                  //turn left 90 degrees
trtl.move(40);                      //move 40 pixel up
trtl.turnLeft(90);                  //turn left 90 degrees left
trtl.move(40);                      //move 40 pixels left
trtl.turnLeft(90);                  //turn left 90 degrees
trtl.move(40);                      //move 40 pixels down
   //window 2
trtl.up();                          //disables drawing mode
trtl.move(30,-20);                  //move to coordinates (30,-20)
trtl.down();                       //enables drawing mode
trtl.setDirection(0);               //set direction +x
trtl.move(40);                      //moves right 40 pixels
trtl.turnLeft(90);                  //turn left 90 degrees
trtl.move(40);                      //move 40 pixel up
trtl.turnLeft(90);                  //turn 90 degrees left
trtl.move(40);                      //move 40 pixels left
trtl.turnLeft(90);                  //turn left 90 degrees
trtl.move(40);                      //move 40 pixels down
   //door
trtl.up();                          //disables drawing mode
trtl.move(-15,-100);                //moves to coordinates (-15,-100)
trtl.down();                        //enables drawing mode
trtl.setDirection(90);              //set direction to +y
trtl.move(50);                      //moves 50 pixels up
trtl.turnRight(90);                 //turn right 90 degrees
trtl.move(30);                      //move 30 pixel right
trtl.turnRight(90);                 //turn 90 degrees right
trtl.move(50);                      //move 50 pixels down



}
}
