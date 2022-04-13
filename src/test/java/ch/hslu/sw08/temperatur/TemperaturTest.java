/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.13
 */

package ch.hslu.sw08.temperatur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    @Test
    void getCelsius() {
        Temperatur temperatur = new Temperatur(12);
        assertEquals(12, temperatur.getCelsius());
    }

    @Test
    void getKelvin() {
        Temperatur temperatur = new Temperatur(15);
        assertEquals(288.15, temperatur.getKelvin(), 0.00001);
    }

    @Test
    void setCelsius() {
        Temperatur temperatur = new Temperatur(0);
        temperatur.setCelsius(19);
        assertEquals(19, temperatur.getCelsius());
    }

    @Test
    void setKelvin() {
        Temperatur temperatur = new Temperatur(0);
        temperatur.setKelvin(254);
        assertEquals(254, temperatur.getKelvin());
    }

    @Test
    void convertKelvinToCelsius() {
        Temperatur temperatur = new Temperatur(21);
        temperatur.setKelvin(300);
        assertEquals(26.85, temperatur.getCelsius(), 0.001);
    }

    @Test
    void convertCelsiusToKelvin() {
        Temperatur temperatur = new Temperatur(21);
        assertEquals(294.15, temperatur.getKelvin(), 0.00001);
    }

    @Test
    void testEquals() {
        Temperatur temp1 = new Temperatur(20);
        Temperatur temp2 = new Temperatur(20);
        assertTrue(temp1.equals(temp2));
    }

    @Test
    void testHashCode() {
        Temperatur temperatur = new Temperatur(13);
        assertEquals(-1343219195, temperatur.hashCode());
    }

    @Test
    void testToString() {
        Temperatur temperatur = new Temperatur(36);
        assertEquals("Temperatur{KELVIN_OFFSET=273.15, celsius=36.0, kelvin=309.15}", temperatur.toString());
    }
}