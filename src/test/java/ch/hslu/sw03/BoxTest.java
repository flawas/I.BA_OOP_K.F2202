/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw03;

import org.junit.jupiter.api.Test;

/**
 *
 * @author flaviowaser
 */
public class BoxTest {
    
    public BoxTest() {
    }

    @Test
    public void testPrintBox() {
       Box box = new Box();
       box.printBox(4, 10);
    }

    @Test
    public void testPrintBox2() {
       Box box = new Box();
       box.printBox(8, 20);
    }    
    
}
