/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw03;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class SwissCrossTest {
    
    public SwissCrossTest() {
    }

    @Test
    public void testSwissCrossStraight() {
        new SwissCross(4);
    }
    
    @Test
    public void testSwissCrossOdd(){
        new SwissCross(9);
    }
    
}
