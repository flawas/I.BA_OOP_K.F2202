/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw02;

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
    public void testGetTemperatur() {
        Temperatur temperatur = new Temperatur(20);
        Assertions.assertEquals(20, temperatur.getTempCelsius());
        
    }
    
    @Test
    public void testSetTemperatur(){
        Temperatur temperatur = new Temperatur(20);
        temperatur.setTempCelsius(32);
        Assertions.assertEquals(32, temperatur.getTempCelsius());
    }
    
    @Test
    public void testGetTempKelvinFromCelsius(){
        Temperatur temperatur = new Temperatur(10);
        Assertions.assertEquals(283.15, temperatur.getTempKelvinFromCelsius(temperatur.getTempCelsius()));
    }
    
    @Test
    public void testGetTempFahrenheitFromCelsius(){
        Temperatur temperatur = new Temperatur(15);
        Assertions.assertEquals(59, temperatur.getTempFahrenheitFromCelsius(temperatur.getTempCelsius()));
    }
    
    @Test
    public void testSetTempCelsiusRelativePostivie(){
        Temperatur temperatur = new Temperatur(8);
        temperatur.setTempCelsiusRelative(2);
        Assertions.assertEquals(10, temperatur.getTempCelsius());
    }
    
    @Test
    public void testSetTempCelsiusRelativeNegative(){
        Temperatur temperatur = new Temperatur(8);
        temperatur.setTempCelsiusRelative(-2);
        Assertions.assertEquals(6, temperatur.getTempCelsius());
    }
    
    @Test
    public void testSetTempKelvinRelativePositive(){
        Temperatur temperatur = new Temperatur(15);
        temperatur.setTempKelvinRelative(20);
        Assertions.assertEquals(35, temperatur.getTempCelsius());
    }
    
    @Test 
    public void testSetTempKelvinRelativeNegative(){
        Temperatur temperatur = new Temperatur(32);
        temperatur.setTempKelvinRelative(-20);
        Assertions.assertEquals(12, temperatur.getTempCelsius());
    }
    
    @Test
    public void testSetTempFahrenheitRelativePositive(){
        Temperatur temperatur = new Temperatur(15);
        temperatur.setTempFahrenheitRelative(16);
        Assertions.assertEquals(75, temperatur.getTempFahrenheit());
    }
    
    
    
}
