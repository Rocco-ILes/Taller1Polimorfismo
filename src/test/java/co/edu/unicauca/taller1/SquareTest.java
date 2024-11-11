/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

/**
 *
 * @author jesúsDavidILesPeña <jesusdavidiles@unicauca.edu.co>
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    /*
    Verifica que el área de un cuadrado con lado 2.0 sea igual a 4.0. La fórmula del área de un cuadrado es lado×lado.
     */
    @Test
    void testCalculateArea() {
        // Crear un cuadrado con lado 2.0
        Square square = new Square(2.0);

        // El área debería ser lado * lado = 2.0 * 2.0 = 4.0
        double expectedArea = 4.0;
        double actualArea = square.calculateArea();

        // Usamos assertEquals para comparar los valores
        assertEquals(expectedArea, actualArea, 0.0001, "El área debería ser igual a 4.0");
    }

    /*
    Verifica que el perímetro de un cuadrado con lado 2.0 sea igual a 8.0. La fórmula del perímetro de un cuadrado es 4×lado.
     */
    @Test
    void testCalculatePerimeter() {
        // Crear un cuadrado con lado 2.0
        Square square = new Square(2.0);

        // El perímetro debería ser 4 * lado = 4 * 2.0 = 8.0
        double expectedPerimeter = 8.0;
        double actualPerimeter = square.calculatePerimeter();

        // Usamos assertEquals para comparar los valores
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001, "El perímetro debería ser igual a 8.0");
    }

    /*
    Verifica que el área de un cuadrado con lado 5.0 sea igual a 25.0. De nuevo, utilizando la fórmula lado×lado.
     */
    @Test
    void testCalculateAreaWithDifferentSide() {
        // Crear un cuadrado con lado 5.0
        Square square = new Square(5.0);

        // El área debería ser lado * lado = 5.0 * 5.0 = 25.0
        double expectedArea = 25.0;
        double actualArea = square.calculateArea();

        // Verificar que el cálculo sea correcto
        assertEquals(expectedArea, actualArea, 0.0001, "El área debería ser igual a 25.0");
    }

    /*
    Verifica que el perímetro de un cuadrado con lado 5.0 sea igual a 20.0. Usamos la fórmula 4×lado.
     */
    @Test
    void testCalculatePerimeterWithDifferentSide() {
        // Crear un cuadrado con lado 5.0
        Square square = new Square(5.0);

        // El perímetro debería ser 4 * lado = 4 * 5.0 = 20.0
        double expectedPerimeter = 20.0;
        double actualPerimeter = square.calculatePerimeter();

        // Verificar que el cálculo sea correcto
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001, "El perímetro debería ser igual a 20.0");
    }

    /*
    -Verifica que el método setSide(double side) actualice correctamente el valor del lado del cuadrado.
    -Verificamos también que el área y el perímetro se actualicen correctamente después de cambiar el lado del cuadrado.
     */
    @Test
    void testSetSide() {
        // Crear un cuadrado con lado 2.0
        Square square = new Square(2.0);

        // Verificar que el lado inicial es 2.0
        assertEquals(2.0, square.getSide(), "El lado inicial debería ser 2.0");

        // Cambiar el lado a 4.0
        square.setSide(4.0);

        // Verificar que el lado haya sido actualizado a 4.0
        assertEquals(4.0, square.getSide(), "El lado debería ser actualizado a 4.0");

        // Verificar que el área se actualiza correctamente
        assertEquals(16.0, square.calculateArea(), "El área debería ser igual a 16.0 después de cambiar el lado");

        // Verificar que el perímetro se actualiza correctamente
        assertEquals(16.0, square.calculatePerimeter(), "El perímetro debería ser igual a 16.0 después de cambiar el lado");
    }

}
