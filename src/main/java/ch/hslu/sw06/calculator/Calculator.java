/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.3.31
 */

package ch.hslu.sw06.calculator;

public class Calculator implements CalculatorInterface{


    /**
     * Attribute
     */
    final int x;
    final int y;

    /**
     * Construcor of calculator
     */
    public Calculator(){
        this.x = 0;
        this.y = 0;
    }

    @Override
    public double addition(double one, double two) {
        return one + two;
    }

    @Override
    public double subraction(double one, double two) {
        return one - two;
    }

    @Override
    public double multiplication(double one, double two) {
        return one * two;
    }

    @Override
    public double division(double one, double two) {
        return one / two;
    }
}
