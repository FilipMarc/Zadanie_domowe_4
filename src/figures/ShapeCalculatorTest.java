package figures;

public class ShapeCalculatorTest {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Square square = new Square(10);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle(5,10);

        double sqrAr = shapeCalculator.squareAre(square);
        System.out.println("Square Area: " + sqrAr);

        double circleAr = shapeCalculator.circleAre(circle);
        System.out.println("Circle Are: " + circleAr);

        double trianglePer = shapeCalculator.trianglePerimeter(triangle);
        System.out.println("Triangle Perimeter: " + trianglePer);

        double rectPer = shapeCalculator.rectPerimeter(rectangle);
        System.out.println("Rectangle Perimeter: " + rectPer);

    }
}
