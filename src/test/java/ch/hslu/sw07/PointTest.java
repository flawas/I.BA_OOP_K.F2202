/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.7
 */

package ch.hslu.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testEqualsTrue() {
        Point point = new Point(5,5);
        Point point2 = new Point(5,5);
        assertTrue(point.equals(point2));
    }

    @Test
    void testEqualsFalse(){
        Point point = new Point(5,5);
        Point point2 = new Point(9,8);
        assertFalse(point.equals(point2));
    }

    @Test
    void testHashCode() {
        Point point = new Point(6,2);
        assertEquals(1149, point.hashCode());
    }

    @Test
    void testToString() {
        Point point = new Point(2,10);
        assertEquals("Point[x=2,y=10]", point.toString());
    }

    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Point.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }
}