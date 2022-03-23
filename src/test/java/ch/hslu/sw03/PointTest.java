/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class PointTest {
    
    public PointTest() {
    }

    @Test
    public void testGetQuadrant1() {
        Point point = new Point(5, 3);
        Assertions.assertEquals("Quadrant 1", point.getQuadrant());
    }

    @Test
    public void testGetQuadrant2() {
        Point point = new Point(5, -7);
        Assertions.assertEquals("Quadrant 2", point.getQuadrant());
    }

    @Test
    public void testGetQuadrant3() {
        Point point = new Point(-6, -2);
        Assertions.assertEquals("Quadrant 3", point.getQuadrant());
    }

    @Test
    public void testGetQuadrant4() {
        Point point = new Point(-8, 1);
        Assertions.assertEquals("Quadrant 4", point.getQuadrant());
    }
    
    @Test
    public void testGetQuadrant5(){
        Point point = new Point(0, 1);
        Assertions.assertEquals("Punkt liegt auf der Achse", point.getQuadrant());
    }
    
    @Test
    public void testGetQuadrant6(){
        Point point = new Point(9, 0);
        Assertions.assertEquals("Punkt liegt auf der Achse", point.getQuadrant());
    }
    
}
