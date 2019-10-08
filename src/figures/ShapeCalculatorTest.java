package figures;

public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Square square = new Square(10);
        double sqrAr = square.squareAre();
        System.out.println("Square Area: " + sqrAr);

        Circle circle = new Circle(5);
        double circleAr = circle.circleAre();
        System.out.println("Circle Are: " + circleAr);

        Triangle triangle = new Triangle(3,4,5);
        double trianglePer = triangle.trianglePerimeter();
        System.out.println("Triangle Perimeter: " + trianglePer);


        Rectangle rectangle = new Rectangle(5,10);
        double rectPer = rectangle.rectPerimeter();
        System.out.println("Rectangle Perimeter: " + rectPer);

    }
}
