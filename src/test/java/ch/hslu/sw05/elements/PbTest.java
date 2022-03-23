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
public class PbTest {
    
    public PbTest() {
    }

    @Test
    public void testPb() {
        Pb pb = new Pb();
        Assertions.assertEquals(327.6f, pb.getMeltingPoint());
        Assertions.assertEquals(1740f, pb.getBoilingPoint());
    }
    
}
