/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw05.forms;

import ch.hslu.sw05.forms.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class RectangleTest {
    
    public RectangleTest() {
    }

    @Test
    public void testGetWidthAndHeight() {
        Rectangle rectangle = new Rectangle(5, 2, 15, 20);
        Assertions.assertEquals(15, rectangle.getWidth());
        Assertions.assertEquals(20, rectangle.getHeight());
    }
    
    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(2, 6, 10, 2);
        Assertions.assertEquals(20, rectangle.getArea());
    }
    
    @Test
    public void testChangeDimension(){
        Rectangle rectangle = new Rectangle(5, 2, 15, 20);
        rectangle.changeDimension(20, 50);
        Assertions.assertEquals(20, rectangle.getWidth());
        Assertions.assertEquals(50, rectangle.getHeight());
    }

    @Test
    public void testGetPerimeter(){
        Rectangle rectangle = new Rectangle(1, 5, 8, 9);
        Assertions.assertEquals(34, rectangle.getPerimeter());
    }
    
    
}
