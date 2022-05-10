/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.5.10
 */

package ch.hslu.sw12.netatmo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ch.hslu.sw11.temperaturVerlauf.Temperatur;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    /**
     * Create Log4J Logger
     */
    private static final Logger Log = LogManager.getLogger();

    public static void main(String[] args) {

        final String filename = "netatmo-export-202201-202204.csv";

        MesspunktVerlauf messpunktVerlauf = new MesspunktVerlauf();

        if(new File(filename).exists()){
            try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), Charset.forName("UTF-8")))){
                String line;
                while ((line = br.readLine()) !=null){
                    String[] parts = line.split(";");
                    Float temp = Float.valueOf(parts[2]);
                    LocalDateTime timeStamp = LocalDateTime.parse(parts[1], DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
                    Temperatur temperatur = Temperatur.createFromCelsius(temp);
                    Messpunkt messpunkt = new Messpunkt(temperatur, timeStamp);
                }
        } catch(IOException ioex){
                Log.error(ioex.getMessage(), ioex);
            } finally {
                Log.info("Anzahl Temperaturwerte: " + messpunktVerlauf.getCount());
                Log.info("Durchschnitts Temperatur: " + messpunktVerlauf.durchschnitt().toString());
                Log.info("Minimale Temperatur: " + messpunktVerlauf.min().getTemperatur().toString());
                Log.info("Minimale Temperatur Zeit: " + messpunktVerlauf.min().getDateTime().toString());
                Log.info("Maximale Temperatur: " + messpunktVerlauf.max().getTemperatur().toString());
                Log.info("Maximale Temperatur Zeit: " + messpunktVerlauf.max().getDateTime().toString());
            }
        }
    }
}
