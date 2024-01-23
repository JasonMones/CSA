
import apcslib.*;
public class RightIsoscelesTriangle
{
   private int heightWidth;
   public RightIsoscelesTriangle (int twoSides) {
       heightWidth = twoSides;
   }
   public void printRightIsoscelesTriangle() {
       System.out.println("*");
       for (int i = 0; i < heightWidth; i++) {
           System.out.print("*");
           System.out.print(Format.right("*",2*i+3));
           System.out.println();
       }
       for (int j = 0; j <= heightWidth+1; j++) {
           System.out.print("* ");
       }
   }
}
