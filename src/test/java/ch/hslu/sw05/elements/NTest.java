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
public class NTest {
    
    public NTest() {
    }

    @Test
    public void testN() {
        N n = new N();
        Assertions.assertEquals(-209.86f, n.getMeltingPoint());
        Assertions.assertEquals(-196f, n.getBoilingPoint());
    }
    
}
