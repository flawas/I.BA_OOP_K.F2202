/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.7
 */

package ch.hslu.sw07.elements;

import ch.hslu.sw07.Point;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {

    @Test
    void testEqualsTrue() {
        Hg hg = new Hg();
        Hg hg2 = new Hg();
        assertTrue(hg.equals(hg2));
    }

    @Test
    void testEqualsFalse(){
        Hg hg = new Hg();
        N n = new N();
        assertFalse(n.equals(hg));
    }

    @Test
    void testHashCodePb() {
        Pb pb = new Pb();
        assertEquals(88397182, pb.hashCode());
    }

    @Test
    void testHashCodeN() {
        N n = new N();
        assertEquals(1513608173, n.hashCode());
    }

    @Test
    void testHashCodeHg() {
        Hg hg = new Hg();
        assertEquals(2366, hg.hashCode());
    }

    @Test
    void testToString() {
        Hg hg = new Hg();
        assertEquals("Element[elementName='Hg', meltingPoint=-38.72, boilingPoint=357.0]", hg.toString());
    }

    @Disabled
    public void testEqualsContract() {
        EqualsVerifier.forClass(Element.class).verify();
    }
}