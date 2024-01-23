
import chn.util.*;
import apcslib.*;
public class RightTriangleTest {
    public static void main(String[] args) {
        double legA, legB;
        
        ConsoleIO kb = new ConsoleIO(); 
        System.out.print("Enter 2 sides of the first right triangle: ");
        legA = kb.readDouble();
        legB = kb.readDouble();
        RightTriangle rt1 = new RightTriangle(legA, legB);
        System.out.println("Hypotenuse is " + Format.left(rt1.calcHypotenuse(),1,1));

        System.out.print("\nEnter 2 sides of the second right triangle: ");
        legA = kb.readDouble();
        legB = kb.readDouble();
        RightTriangle rt2 = new RightTriangle(legA, legB);
        System.out.println("Hypotenuse is " + Format.left(rt2.calcHypotenuse(),1,1));

    }
}