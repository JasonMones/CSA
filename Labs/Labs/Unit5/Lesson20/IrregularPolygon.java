package Unit5.Lesson20;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import apcslib.*;
public class IrregularPolygon {
    private final ArrayList<Point2D.Double>myPolygon= new ArrayList<Point2D.Double>();
    private final static SketchPad screen = new SketchPad(500,500);
    private final static DrawingTool trtl = new DrawingTool(screen);
    public IrregularPolygon() {
        
    }
    public void add(int a, int b) {
        Point2D.Double point = new Point2D.Double(a,b);
        myPolygon.add(point);
    }
    public void draw() {
        trtl.up();
        move(myPolygon.get(0));
        trtl.down();
        for (int i = 0; i<myPolygon.size();i++) {
            move(myPolygon.get(i));
        }
        move(myPolygon.get(0));
    }
    public double perimeter() {
        double perimeter = 0;
        int nextPoint = 0;
        for (int i = 0; i<myPolygon.size();i++) {
            if (i+1 == myPolygon.size()) {
                nextPoint = 0;
            }
            else nextPoint = i + 1;
            perimeter += Math.sqrt(
                            Math.pow(
                                myPolygon.get(nextPoint).getY()-myPolygon.get(i).getY(), 2
                            )
                            + Math.pow(
                                    myPolygon.get(nextPoint).getX()-myPolygon.get(i).getX(), 2
                            )
                        );
        }
        return perimeter;
    }
    public double area() {
        double area = 0;
        double firstX, firstY, secondX, secondY;
        for (int i = 0; i+1 < myPolygon.size();i++) {
            firstX = myPolygon.get(i).getX();
            firstY = myPolygon.get(i).getY();
            secondX = myPolygon.get(i+1).getX();
            secondY = myPolygon.get(i+1).getY();
            
            area += firstX*secondY-secondX*firstY;
        }
        return 0.5*area;
    }
    private void move(Point2D.Double point) {
        trtl.move(point.getX(),point.getY());
    }
}
