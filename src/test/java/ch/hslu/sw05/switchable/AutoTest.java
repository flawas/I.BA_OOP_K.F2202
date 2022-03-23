/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw05.switchable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class AutoTest {
    
    @Test
    public void StartAuto() {
        Auto auto = new Auto();
        auto.switchOn();
        Assertions.assertTrue(auto.isSwitchedOn());
        Assertions.assertEquals(1, auto.getSwitchCount());
    }
    
    @Test
    public void StopAuto(){
        Auto auto = new Auto();
        auto.switchOn();
        auto.switchOff();
        Assertions.assertTrue(auto.isSwitchedOff());
        Assertions.assertEquals(2, auto.getSwitchCount());
    }
    
    @Test
    public void StopLicht() {
        Auto auto = new Auto();
        auto.lichtlinks.switchOff();
        auto.lichtrechts.switchOff();
        Assertions.assertTrue(auto.lichtlinks.isSwitchedOff());
        Assertions.assertTrue(auto.lichtrechts.isSwitchedOff());
        Assertions.assertEquals(1, auto.lichtlinks.getSwitchCount());
        Assertions.assertEquals(1, auto.lichtrechts.getSwitchCount());
    }
    
    @Test
    public void StartLicht(){
        Auto auto = new Auto();
        auto.lichtlinks.switchOn();
        auto.lichtrechts.switchOn();
        Assertions.assertTrue(auto.lichtlinks.isSwitchedOn());
        Assertions.assertTrue(auto.lichtrechts.isSwitchedOn());
        Assertions.assertEquals(1, auto.lichtlinks.getSwitchCount());
        Assertions.assertEquals(1, auto.lichtrechts.getSwitchCount());
    }
    
}
