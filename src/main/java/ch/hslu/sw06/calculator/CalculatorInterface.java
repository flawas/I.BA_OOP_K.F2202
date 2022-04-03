/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.3
 */

package ch.hslu.sw06.calculator;

public interface CalculatorInterface {

    /**
     * Math addition
     * @param one: first attribute of the addition
     * @param two: second attribute of the addition
     * @return: result of the addition
     */
    public double addition(final double one, final double two);

    /**
     * Math subtraction
     * @param one: first attribute of the subtraction
     * @param two: second attribute of the subtraction
     * @return: result of the subtraction
     */
    public double subraction(final double one, final double two);

    /**
     * Math multiplication
     * @param one: first attribute of the multiplication
     * @param two: second attribute of the multiplication
     * @return: result of the
     */
    public double multiplication(final double one, final double two);

    /**
     * Math division
     * @param one: first attribute of the division
     * @param two: second attribute of the division
     * @return: result of the
     */
    public double division(final double one, final double two);




}
