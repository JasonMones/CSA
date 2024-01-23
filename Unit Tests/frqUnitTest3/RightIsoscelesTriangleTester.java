
import chn.util.*;
public class RightIsoscelesTriangleTester
{
   public static void main(String[] args) {
      ConsoleIO kb = new ConsoleIO();
      System.out.print("Enter the height of a right isosceles triangle: ");
      int triangleHeight = kb.readInt();
      
      RightIsoscelesTriangle triangle = new RightIsoscelesTriangle(triangleHeight);
      triangle.printRightIsoscelesTriangle();      
   }
}
