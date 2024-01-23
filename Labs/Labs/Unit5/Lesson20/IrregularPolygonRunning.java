package Unit5.Lesson20;



public class IrregularPolygonRunning
{
    public static void main(String[] args) {
        IrregularPolygon ip = new IrregularPolygon();
        ip.add(20,10);
        ip.add(70,20);
        ip.add(50,50);
        ip.add(0,40);
        ip.draw();
        System.out.println("Perimeter: " + ip.perimeter());
        System.out.println("Area: " + ip.area());
    }
}
