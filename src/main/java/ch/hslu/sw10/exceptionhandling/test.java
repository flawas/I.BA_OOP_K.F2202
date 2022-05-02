/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.26
 */

package ch.hslu.sw10.exceptionhandling;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            float value = Float.valueOf(input);
        } while (!input.equals("exit"));
        System.out.println("Programm beendet.");
    }
}
