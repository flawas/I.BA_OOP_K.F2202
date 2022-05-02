/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.26
 */

package ch.hslu.sw10.exceptionhandling;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class corrected {
    private static final Logger Log = LogManager.getLogger();
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                Log.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
                //System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
                input = scanner.next();
                float value = Float.valueOf(input);
            } catch (NumberFormatException ex){
                Log.debug("Bitte einen gültigen Wert gegeben, '" + input + "' ist kein gültiger Wert!");
            }
        } while (!input.equals("exit"));
        Log.info("Programm wird beendet.");
    }
}
