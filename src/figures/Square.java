package figures;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double squareAre(){
        double squrAre = side * side;
        return squrAre;
    }
}
