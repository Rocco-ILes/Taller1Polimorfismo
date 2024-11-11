package co.edu.unicauca.taller1;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side= side;
    }

    @Override
    public double calculateArea() {
        return (side * side);
    }

    @Override
    public double calculatePerimeter() {
        return (4 * side);
    }

   
}
