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
public class SelectionTest {
    
    public SelectionTest() {
    }

    @Test
    public void testMax1() {
        Assertions.assertEquals(5, Selection.max(5, 2));
    }

    @Test
    public void testMax2() {
        Assertions.assertEquals(20, Selection.max(6, 20));
    }
    
    @Test
    public void testMin1(){
        Assertions.assertEquals(2, Selection.min(4, 2));
    }

    @Test
    public void testMin2(){
        Assertions.assertEquals(4, Selection.min(4, 8));
    }
    
    @Test
    public void testMaxThreeOptions1(){
        Assertions.assertEquals(10, Selection.max(5, 6, 10));
    }
    
    @Test
    public void testMaxThreeOptions2(){
        Assertions.assertEquals(6, Selection.max(5, 6, 2));
    }

    @Test
    public void testMaxThreeOptions3(){
        Assertions.assertEquals(5, Selection.max(5, 2, 1));
    }    
}
