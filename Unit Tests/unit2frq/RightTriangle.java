
public class RightTriangle {
    private double mySideA, mySideB;
    public RightTriangle(double sideA, double sideB) {
        mySideA = sideA;
        mySideB = sideB;
    }
    public double calcHypotenuse() {
        if (mySideA < 0 || mySideB < 0) {
            return -1;
        }
        else {
            return Math.sqrt(Math.pow(mySideA, 2) + Math.pow(mySideB, 2));
        }
    }
}
