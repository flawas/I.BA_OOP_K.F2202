/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw05.namedInterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class NameTest {
    
    public NameTest() {
    }

    @Test
    public void testName() {
        Name name = new Name();
        name.setName("Flavio");
        Assertions.assertEquals("Flavio", name.getName());
    }
    
}
