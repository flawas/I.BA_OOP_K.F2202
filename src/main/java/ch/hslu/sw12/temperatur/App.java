/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.26
 */

package ch.hslu.sw12.temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class App {
    private static final Logger Log = LogManager.getLogger(App.class);
    private Temperatur temperatur;
    private DataHandler dataHandler;


    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);

        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.addTemperaturEventListener(new TemperaturEventListener() {
            @Override
            public void temperaturEvent(TemperaturEvent temperaturEvent) {
                Log.info("Es wurde ein neues " + temperaturEvent.getTemperaturState().getText() + " eingegeben");
            }
        });

        do {
            Log.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();

            if(!input.equals("exit")){
                try{
                    float value = Float.valueOf(input);
                    Temperatur temperatur = Temperatur.createFromCelsius(value);
                    temperaturVerlauf.add(temperatur);
                    Log.info(temperatur.toString());

                } catch (Exception ex){
                    Log.error("Bitte einen gültigen Wert gegeben, '" + input + "' ist kein gültiger Wert!", new IllegalArgumentException("Keinen gültigen Temperaturwert eingegeben."));
                }
            } else {
                Log.info("Anzahl Temperaturwerte: " + temperaturVerlauf.getCount());
                Log.info("Durchschnittliche Temperatur " + temperaturVerlauf.durchschnitt());
                Log.info("Minimale Temperatur " + temperaturVerlauf.min());
                Log.info("Maximale Temperatur " + temperaturVerlauf.max());
            }
        } while (!input.equals("exit"));
        Log.info("Programm wird beendet.");
        Log.info("---------------------------");
        Log.info("Datei SW12_Temperatur.txt wird geschrieben");
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("SW12_Temperatur.txt"))) {

            dataOutputStream.writeInt(temperaturVerlauf.getCount());

            for (int i = 0; i < temperaturVerlauf.getCount(); i++){
                Temperatur temperatur = temperaturVerlauf.get(i);
                dataOutputStream.writeFloat(temperatur.getTempCelsius());
            }

        } catch (IOException ioe){
            Log.error("Datei konnte nicht geschrieben werden.", ioe);
        }
        Log.info("---------------------------");
        Log.info("Einlesen SW12_Temperatur.txt mit den alten Werten");
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("SW12_Temperatur.txt"))) {

            final int count = dataInputStream.readInt();
            Log.info("Anzahl Temperaturwerte: " + count);

            for (int i = 0; i < count; i++){
                final float temp = dataInputStream.readFloat();
                Log.info("Temperatur Werte: " + temp);
            }

        } catch (IOException ioe){
            Log.error("Datei konnte nicht gelesen werden", ioe);
        }

    }
}
