/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.3
 */

package ch.hslu.sw06.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public CalculatorTest() {

    }

    @Test
    public void testAddition(){
        Calculator calc = new Calculator();
        assertEquals(7.00, calc.addition(5.00, 2.00));
    }

    @Test
    public void testAdditionNegative(){
        Calculator calc = new Calculator();
        assertEquals((-7.00), calc.addition((-30.00), 23.00));
    }

    @Test
    public void testSubtraction(){
        Calculator calc = new Calculator();
        assertEquals(2, calc.subraction(7.00, 5.00));
    }

    @Test
    public void testSubractionNegative(){
        Calculator calc = new Calculator();
        assertEquals(-5.00, calc.subraction(5.00, 10.00));
    }

    @Test
    public void testSubtractionDoubleNeagtive(){
        Calculator calc = new Calculator();
        assertEquals(-20, calc.subraction(10, 30.00));
    }

    @Test
    public void testMultiplication(){
        Calculator calc = new Calculator();
        assertEquals(18, calc.multiplication(2.00, 9.00));
    }

    @Test
    public void testMultiplicationNegative(){
        Calculator calc = new Calculator();
        assertEquals(18, calc.multiplication(-2.00, -9.00));
    }

    @Test
    public void testMultiplicationDoubleNegative(){
        Calculator calc = new Calculator();
        assertEquals(-18, calc.multiplication(-2.00, 9.00));
    }

    @Test
    public void testDivision(){
        Calculator calc = new Calculator();
        assertEquals(3, calc.division(27.00, 9.00));
    }

    @Test
    public void testDivisionNegative(){
        Calculator calc = new Calculator();
        assertEquals(-3, calc.division(-27.00, 9.00));
    }

    @Test
    public void testDivisionDoubleNegative(){
        Calculator calc = new Calculator();
        assertEquals(3, calc.division(-27.00, -9.00));
    }

}