/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.3.31
 */

package ch.hslu.sw05.elements;

import ch.hslu.sw06.elements.Element;
import ch.hslu.sw06.elements.Hg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {

    @Test
    void getElementname() {
        Element hg = new Hg();
        assertEquals("Hg", hg.getElementName());
    }

    @Test
    void getMeltingPoint() {
        Element hg = new Hg();
        assertEquals(-38.7d, hg.getMeltingPoint(), 0.05d);
    }

    @Test
    void getBoilingPoint() {
        Element hg = new Hg();
        assertEquals(357.0d, hg.getBoilingPoint());
    }

    @Test
    void testToString() {
    }
}