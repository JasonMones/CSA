
public class Fun {
    public static void main(String[] args)
     {
         System.out.println("Fahrenheit to Celsius: ");
         System.out.println("212 F --> " + Format.left(fToC(212), 10, 2));
         System.out.println("98.6 F --> " + Format.left(fToC(98.6), 10, 2));
         System.out.println("10 F --> " + Format.left(fToC(10), 10, 2));

         System.out.println("Celsius to Fahrenheit: ");
         System.out.println("-15 C --> " + Format.left(cToF(-15), 10, 2));
         System.out.println("0 C --> " + Format.left(cToF(0), 10, 2));
         System.out.println("70 C --> " + Format.left(cToF(70), 10, 2));

         System.out.println("Radius of sphere to volume: ");
         System.out.println("1 R --> " + Format.left(sphereVolume(1), 10, 2));
         System.out.println("2.25 R --> " + Format.left(sphereVolume(2.25), 10, 2));
         System.out.println("7.5 R --> " + Format.left(sphereVolume(7.5), 10, 2));

         System.out.println("Legs of a right triangle to hypotenuse: ");
         System.out.println("3 A, 4 B --> " + Format.left(hypotenuse(3,4), 10, 2));
         System.out.println("6.75 A, 12.31 B --> " + Format.left(hypotenuse(6.75,12.31), 10, 2));

    } 

    public static double fToC(double fahrenheit)
     {
        return (5*(fahrenheit -32))/9;
    }
    public static double cToF(double celsius)
     {
        return (9/5*celsius) +32;
    }
    public static double sphereVolume(double radius)
     {
        return 4/3*(Math.PI*Math.pow(radius,3));
    }
    public static double hypotenuse(double sideA, double sideB) 
    {
        return Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));
    }
}
