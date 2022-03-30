package ch.hslu.sw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getQuadrant() {
        Point point = new Point(1, 2);
        assertEquals(1,point.getQuadrant());
    }

    @Test
    void getX() {
        Point point = new Point(5, 7);
        assertEquals(5, point.getX());
    }

    @Test
    void getY() {
        Point point = new Point(3, 8);
        assertEquals(8, point.getY());
    }

    @Test
    void setX() {
        Point point = new Point(5,9);
        point.setX(12);
        assertEquals(12,point.getX());
    }

    @Test
    void setY() {
        Point point = new Point(90,123);
        point.setY(0);
        assertEquals(0, point.getY());
    }

    @Test
    void testEquals() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        assertEquals(true, point1.equals(point2));
    }

    @Test
    void testToString() {
        Point point = new Point(3, 5);
        assertEquals("Point[x=3,y=5]", point.toString());
    }

    @Test
    void moveRelativePos() {
        Point point = new Point(4, 6);
        point.moveRelative(5,6);
        assertEquals(9, point.getX());
        assertEquals(12, point.getY());
    }

    @Test
    void moveRelativeNeg() {
        Point point = new Point(4, 6);
        point.moveRelative(-8,-12);
        assertEquals(-4, point.getX());
        assertEquals(-6, point.getY());
    }

    @Test
    void MoveRelativePointPos() {
        Point point = new Point(7, 3);
        point.moveRelative(new Point(3, 7));
        assertEquals(10, point.getX());
        assertEquals(10, point.getY());
    }

    @Test
    void MoveRelativePointNeg(){
        Point point = new Point(7, 3);
        point.moveRelative(new Point(-3, -6));
        assertEquals(4, point.getX());
        assertEquals(-3, point.getY());
    }
}