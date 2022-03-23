/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class LinieTest {
    
    public LinieTest() {
    }

    @Test
    public void testCreateLine() {
        Linie linie = new Linie(1, 2, 4, 5);
        Assertions.assertEquals("Point[x=1,y=2]", linie.getPoint1().toString());
        Assertions.assertEquals("Point[x=4,y=5]", linie.getPoint2().toString());
    }
    
    @Test
    public void testMovePoint1(){
        Linie linie = new Linie(1, 2, 4, 5);
        Point oldPoint = linie.getPoint1();
        Point newPoint = new Point(3, 4); 
        linie.movePoint(oldPoint, newPoint);
        Assertions.assertEquals("Point[x=3,y=4]", linie.getPoint1().toString());
    }
    
    @Test
    public void testMovePoint2(){
        Linie linie = new Linie(1, 2, 4, 5);
        Point oldPoint = linie.getPoint2();
        Point newPoint = new Point(7, 8); 
        linie.movePoint(oldPoint, newPoint);
        Assertions.assertEquals("Point[x=7,y=8]", linie.getPoint2().toString());
    }
    
    @Test
    public void testMovePoint3() {
        Linie linie = new Linie(2, 5, 9, 15);
        Point oldPoint = linie.getPoint1();
        Point newPoint = new Point(12, 15); 
        linie.movePoint(oldPoint, newPoint);
        oldPoint = linie.getPoint2();
        newPoint = new Point(19, 25); 
        linie.movePoint(oldPoint, newPoint);
        Assertions.assertEquals("Point[x=12,y=15]", linie.getPoint1().toString());
        Assertions.assertEquals("Point[x=19,y=25]", linie.getPoint2().toString());
    }
    
}
