package co.edu.unicauca.taller1;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    
}
