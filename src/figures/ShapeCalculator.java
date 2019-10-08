package figures;

public class ShapeCalculator {

    public double squareAre(Square square){
        double squrAre = square.side * square.side;
        return squrAre;
    }

    public double circleAre(Circle circle){
        final double PI = 3.14;
        double circlArea = (PI * circle.radius * circle.radius);
        return circlArea;
    }

    public double trianglePerimeter(Triangle triangle){
        double triangPer = triangle.sideA + triangle.sideB + triangle.sideC;
        return triangPer;
    }

    public double rectPerimeter(Rectangle rectangle){
        double recPer = 2 *( rectangle.sideA + rectangle.sideB);
        return recPer;
    }
}
