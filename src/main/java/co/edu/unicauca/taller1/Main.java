package co.edu.unicauca.taller1;

import java.util.List;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        //try {
            Figure fig1 = new Circle(1.0); //radius
            Figure fig2 = new Square(2.0); //side
            //Figure fig3 = new Triangle(4.2, 1.0); //base & height
            Figure fig3 = new Triangle(3.0, 4.0, 5.0);//side1, side2 & side3

            // Crear lista de figuras
            List<Figure> figures = new ArrayList<>();
            figures.add(fig1);
            figures.add(fig2);
            figures.add(fig3);
//
            // Imprimir área y perímetro de cada figura
            for (Figure fig : figures) {
                System.out.println("Area: " + fig.calculateArea());
                System.out.println("Perimeter: " + fig.calculatePerimeter());
            }
////             Modificar atributos utilizando setters (ejemplo)
//            ((Circle) fig1).setRadius(2.0);  // Cambiar el radio del círculo
//            ((Square) fig2).setSide(3.0);    // Cambiar el lado del cuadrado
//            ((Triangle) fig3).setSide1(5.0); // Cambiar el primer lado del triángulo
//
////             Imprimir los nuevos valores después de la modificación
//            System.out.println("\nDespués de modificar:");
//            for (Figure fig : figures) {
//                System.out.println("Area: " + fig.calculateArea());
//                System.out.println("Perimeter: " + fig.calculatePerimeter());
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println("Error: " + e.getMessage());
//
//        }
    }

}
