package figures;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double trianglePerimeter(){
        double triangPer = sideA + sideB + sideC;
        return triangPer;
    }
}
