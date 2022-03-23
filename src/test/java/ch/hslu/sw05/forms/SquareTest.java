/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw05.forms;

import ch.hslu.sw05.forms.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class SquareTest {
    

    @Test
    public void testGetWidthAndHeight() {
        Square square = new Square(5, 2, 15);
        Assertions.assertEquals(15, square.getWidth());
    }
    
    @Test
    public void testGetArea() {
        Square square = new Square(4, 3, 10);
        Assertions.assertEquals(100, square.getArea());
    }
    
    @Test
    public void testChangeDimension(){
        Square square = new Square(5, 2, 20);
        square.setWidth(5);
        Assertions.assertEquals(5, square.getWidth());
    }

    @Test
    public void testGetPerimeter(){
        Square sqare = new Square(1, 5, 8);
        Assertions.assertEquals(32, sqare.getPerimeter());
    }
    
}
