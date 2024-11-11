package co.edu.unicauca.taller1;
// Clase Triangulo

public class Triangle extends Figure {

//    // Atributos de la clase
//    private double base;
//    private double height;
//
//    // Constructor que inicializa la base y la altura
//    public Triangle(double base, double height) {
//        this.base = base;
//        this.height = height;
//    }
//
//    // Métodos getters y setters
//    public double getBase() {
//        return base;
//    }
//
//    public void setBase(double base) {
//        this.base = base;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    @Override
//    public double calculateArea() {
//        return (base * height) / 2;
//    }

    /* 
    Método para calcular la hipotenusa usando el teorema de Pitágoras
    IMPORTANTE -> METODO ABSTRACTO => no se implementa en la clase abstracta pero si en la clase hija
     */
//    private double calcularHipotenusa() {
//        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
//    }
//
//    // Método para calcular el perímetro del triángulo rectángulo
//    @Override
//    public double calculatePerimeter() {
//
//        // El perímetro es la suma de la base, altura y la hipotenusa
//        double hipotenusa = calcularHipotenusa();
//        return base + height + hipotenusa;
//    }
    /**
     * *Otra versión, en el caso de que se tenga los datos de los 3 lados del
     * triángulo**
     */
    private double side1, side2, side3;

//    Constructor que inicializa los lados
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

//    // Constructor con validación de la desigualdad triangular
//    public Triangle(double side1, double side2, double side3) {
//        // Validación de la desigualdad triangular
//        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
//            throw new IllegalArgumentException("Los lados deben ser números positivos.");
//        }
//        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
//            throw new IllegalArgumentException("Los lados no forman un triángulo válido.");
//        }
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
    // Getters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Setters
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Usando el teorema de Herón para calcular el área de un triángulo
        double s = (side1 + side2 + side3) / 2; // Semiperímetro
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
