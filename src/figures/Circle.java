package figures;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circleAre(){
        final double PI = 3.14;
        double circlArea = (PI * radius * radius);
        return circlArea;
    }
}
