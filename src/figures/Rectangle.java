package figures;

public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double rectPerimeter(){
        double recPer = 2 *( sideA + sideB);
        return recPer;
    }
}
