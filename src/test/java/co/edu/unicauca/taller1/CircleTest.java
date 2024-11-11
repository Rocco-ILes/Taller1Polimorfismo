package co.edu.unicauca.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
//    @Test
//    void testCreate(){
//        Circle circle = new Circle(2.0);
//        assertEquals(2.0, circle.getRadius());
//    }
//
//    @Test
//
//    void testCalculate(){
//        Circle circle = new Circle(2.0);
//        assertEquals(2.0*Math.PI*2.0, circle.calculatePerimeter());
//    }

    /*
    Verifica que el área calculada para un círculo con radio 1.0 sea igual a 𝜋(aproximadamente 3.1416).
     */
    @Test
    void testCalculateArea() {
        // Crear un círculo con radio 1.0
        Circle circle = new Circle(1.0);

        // El área debería ser π * r² = π * 1.0² = π
        double expectedArea = Math.PI;
        double actualArea = circle.calculateArea();

        // Usamos assertEquals para comparar los valores
        assertEquals(expectedArea, actualArea, 0.0001, "El área debería ser igual a π");
    }

    /*
    Verifica que el perímetro calculado para un círculo con radio 1.0 sea igual a 2𝜋(aproximadamente 6.2832).
     */
    @Test
    void testCalculatePerimeter() {
        // Crear un círculo con radio 1.0
        Circle circle = new Circle(1.0);

        // El perímetro debería ser 2 * π * r = 2 * π * 1.0 = 2π
        double expectedPerimeter = 2 * Math.PI;
        double actualPerimeter = circle.calculatePerimeter();

        // Usamos assertEquals para comparar los valores
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001, "El perímetro debería ser igual a 2π");
    }

    /*Verifica el área para un círculo con radio 2.0, que debería ser 4𝜋.*/
    @Test
    void testCalculateAreaWithDifferentRadius() {
        // Crear un círculo con radio 2.0
        Circle circle = new Circle(2.0);

        // El área debería ser π * 2.0² = 4π
        double expectedArea = 4 * Math.PI;
        double actualArea = circle.calculateArea();

        // Verificar que el cálculo sea correcto
        assertEquals(expectedArea, actualArea, 0.0001, "El área debería ser igual a 4π");
    }

    /*Verifica el perimetro para un círculo con radio 2.0, que debería ser 4𝜋.*/
    @Test
    void testCalculatePerimeterWithDifferentRadius() {
        // Crear un círculo con radio 2.0
        Circle circle = new Circle(2.0);

        // El perímetro debería ser 2 * π * 2.0 = 4π
        double expectedPerimeter = 4 * Math.PI;
        double actualPerimeter = circle.calculatePerimeter();

        // Verificar que el cálculo sea correcto
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001, "El perímetro debería ser igual a 4π");
    }

}
