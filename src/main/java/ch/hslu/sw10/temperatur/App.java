/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.26
 */

package ch.hslu.sw10.temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class App {
    private static final Logger Log = LogManager.getLogger(App.class);
    private Temperatur temperatur;


    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            Log.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try{
                float value = Float.valueOf(input);
                Temperatur temperatur = Temperatur.createFromCelsius(value);
                Log.info(temperatur.toString());

            } catch (Exception ex){
               Log.error("Bitte einen gültigen Wert gegeben, '" + input + "' ist kein gültiger Wert!", new IllegalArgumentException("Keinen gültigen Temperaturwert eingegeben."));
            }

        } while (!input.equals("exit"));
        Log.info("Programm wird beendet.");
    }
}
