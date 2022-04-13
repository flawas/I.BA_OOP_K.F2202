/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.13
 */

package ch.hslu.sw08.temperatur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturVerlaufTest {

    @Test
    void add() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur(5));
        temperaturVerlauf.add(new Temperatur(8));
        assertEquals(2, temperaturVerlauf.getCount());
    }

    @Test
    void clear() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur(2345));
        temperaturVerlauf.add(new Temperatur(15));
        temperaturVerlauf.clear();
        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    void getCount() {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur(323));
        temperaturVerlauf.add(new Temperatur(52));
        temperaturVerlauf.add(new Temperatur(56));
        temperaturVerlauf.add(new Temperatur(12));
        temperaturVerlauf.add(new Temperatur(11));
        temperaturVerlauf.add(new Temperatur(2));
        assertEquals(6, temperaturVerlauf.getCount());
    }

    @Test
    void getAverageCelsius(){
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur(32));
        temperaturVerlauf.add(new Temperatur(12));
        temperaturVerlauf.add(new Temperatur(8));
        assertEquals(17.3, temperaturVerlauf.getAverageCelsius(), 0.5);
    }

    @Test
    void getAverageKelvin(){
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.add(new Temperatur(32));
        temperaturVerlauf.add(new Temperatur(12));
        temperaturVerlauf.add(new Temperatur(8));
        assertEquals(290.48, temperaturVerlauf.getAverageKelvin(), 0.01);
    }
}