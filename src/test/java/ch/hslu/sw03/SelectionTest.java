/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author flaviowaser
 */
public class SelectionTest {
    
    public SelectionTest() {
    }

    @Test
    public void testMax() {
        Assertions.assertEquals(5, Selection.max(5, 2));
    }
    
    @Test
    public void testMin(){
        Assertions.assertEquals(2, Selection.min(4, 2));
    }
    
    @Test
    public void testMaxOverloaded(){
        Assertions.assertEquals(10, Selection.max(5, 6, 10));
    }
    
}
