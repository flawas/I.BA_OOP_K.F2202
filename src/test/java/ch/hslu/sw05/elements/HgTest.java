/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw05.elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class HgTest {
    
    public HgTest() {
    }

    @Test
    public void testHg() {
        Hg hg = new Hg();
        Assertions.assertEquals(-38.72f, hg.getMeltingPoint());
        Assertions.assertEquals(357f, hg.getBoilingPoint());
    }
    
}
