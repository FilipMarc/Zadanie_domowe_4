package rectualTriangle;

public class RightTriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        RightTriangle rightTriangle = new RightTriangle();
        boolean rectualTriangle = rightTriangle.isRightTriangle(triangle);

        System.out.println("Is rightTriangle ? " + rectualTriangle);
    }
}
