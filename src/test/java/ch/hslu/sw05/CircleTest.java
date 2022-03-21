/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author flaviowaser
 */
public class CircleTest {
    
    public CircleTest() {
    }

    @Test
    public void testCreateCircle() {
        Circle circle = new Circle(5, 5, 10);
        Assertions.assertEquals(40, circle.getPerimeter());
    }
    
    @Test
    public void testGetDiameter(){
        Circle circle = new Circle(5, 5, 50);
        Assertions.assertEquals(50,circle.getDiameter());
    }
    
    @Test
    public void testSetDiameter(){
        Circle circle = new Circle(6, 5, 7);
        circle.setDiameter(20);
        Assertions.assertEquals(20,circle.getDiameter());
    }
    
    @Test
    public void testGetArea(){
        Circle circle = new Circle(15,15,25);
        Assertions.assertEquals(625,circle.getArea());
    }
    
}
