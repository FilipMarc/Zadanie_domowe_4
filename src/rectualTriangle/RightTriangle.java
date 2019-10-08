package rectualTriangle;

public class RightTriangle {

    boolean isRightTriangle(Triangle triangle){
        return ((triangle.sideA*triangle.sideA)+(triangle.sideB*triangle.sideB)==(triangle.sideC*triangle.sideC));
    }
}
