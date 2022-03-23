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
public class TemperaturTest {
    
    public TemperaturTest() {
    }
    
    @Test
    public void getStateOfAggregationN() {
        Temperatur temperatur = new Temperatur();
        Assertions.assertEquals("Gasförmig", temperatur.getStateOfAggregation("N"));
    }
    
    @Test
    public void getStateOfAggregationHg() {
        Temperatur temperatur = new Temperatur();
        Assertions.assertEquals("Flüssig", temperatur.getStateOfAggregation("Hg"));
    } 

    @Test
    public void getStateOfAggregationPb() {
        Temperatur temperatur = new Temperatur();
        Assertions.assertEquals("Fest", temperatur.getStateOfAggregation("Pb"));
    } 
    
}
