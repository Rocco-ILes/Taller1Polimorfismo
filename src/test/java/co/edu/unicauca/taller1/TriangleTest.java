/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.taller1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jesúsDavidILesPeña <jesusdavidiles@unicauca.edu.co>
 */
public class TriangleTest {

    /*Verifica que el perímetro calculado de un triángulo con lados 3.0,4.0,5.0
    3.0,4.0,5.0 sea 12.0, que es la suma de los tres lados.*/
    @Test
    void testCalculateArea() {
        // Crear un triángulo con lados 3, 4 y 5
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Esperamos que el área sea 6.0
        double expectedArea = 6.0;
        double actualArea = triangle.calculateArea();

        // Usamos assertEquals para comparar los valores
        assertEquals(expectedArea, actualArea, 0.0001, "El área debería ser 6.0");
    }

    /*Verifica que el perímetro calculado de un triángulo con lados 3.0,4.0,5.0
    3.0,4.0,5.0 sea 12.0, que es la suma de los tres lados*/
    @Test
    void testCalculatePerimeter() {
        // Crear un triángulo con lados 3, 4 y 5
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Esperamos que el perímetro sea 12.0
        double expectedPerimeter = 12.0;
        double actualPerimeter = triangle.calculatePerimeter();

        // Usamos assertEquals para comparar los valores
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001, "El perímetro debería ser 12.0");
    }

}
