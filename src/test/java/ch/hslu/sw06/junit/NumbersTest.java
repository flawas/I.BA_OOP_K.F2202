/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.3.31
 */

package ch.hslu.sw06.junit;

import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @BeforeAll
    public static void setTextStart(){
        System.out.println("Die Tests beginnen");
        System.out.println("############");
    }

    @BeforeEach
    public void setTextBetween(){
        System.out.println("------");
    }

    @AfterAll
    public static void setTextEnd(){
        System.out.println("############");
        System.out.println("Die Tests sind fertig");
    }

    @Test
    public void getX() {
        Numbers numbers = new Numbers();
        assertTrue((numbers.getX() < 50 && numbers.getX() > 1));
        System.out.println(numbers.getX());
    }

    @Test
    void getY() {
        Numbers numbers = new Numbers();
        assertTrue((numbers.getY() < 75 && numbers.getY() > 25));
        System.out.println(numbers.getY());
    }

    @Test
    void getZ() {
        Numbers numbers = new Numbers();
        assertTrue((numbers.getZ() < 100 && numbers.getZ() > 50));
        System.out.println(numbers.getZ());
    }

    @Test
    void getMax() {
        Numbers numbers = new Numbers();
        int tempNumber;
        if(numbers.getX() < numbers.getY()){
            if(numbers.getY() < numbers.getZ()){
                tempNumber =  numbers.getZ();
            } else {
                tempNumber =  numbers.getY();
            }
        } else {
            tempNumber =  numbers.getX();
        }
        assertEquals(tempNumber, numbers.getMax());
        System.out.println(numbers.getMax());

    }

    @Disabled
    void disabledTest(){
        System.out.println("Dieser Text wird nie geschrieben.");
    }
}