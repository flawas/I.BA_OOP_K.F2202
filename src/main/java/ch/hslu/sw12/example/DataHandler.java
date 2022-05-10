/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.5.9
 */

package ch.hslu.sw12.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.charset.Charset;

public class DataHandler {
    /**
     * Create Log4J Logger
     */
    private static final Logger Log = LogManager.getLogger();

    public void writeTextFile(final String filename, final String text){
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), Charset.forName("UTF-8"))))){
            pw.println(text);
            pw.flush();
            Log.info("File geschrieben" + filename);
        } catch (IOException ioe){
            Log.error(ioe.getMessage(), ioe);
        }
    }

    public void writeIntFile(final String filename, final int number){
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), Charset.forName("UTF-8"))))){
            pw.println(number);
            pw.flush();
            Log.info("File geschrieben" + filename);
        } catch (IOException ioe){
            Log.error(ioe.getMessage(), ioe);
        }
    }

    public void readTextFile(final String file) {
        if (new File(file).exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8")))){
                Log.info("Filename: " + file);
                String line;
                while ((line = br.readLine()) != null) {
                    Log.info(line); }
            } catch (IOException ioe) {
               Log.error(ioe.getMessage(), ioe);
            }
        }
    }

    public void readIntFile(final String file) {
        if (new File(file).exists()) {
            try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {

                final int value = dataInputStream.readInt();
                //final byte value = dataInputStream.readByte();
                //final float value = dataInputStream.readFloat();
                //final String value = dataInputStream.readUTF();

                Log.info("Ausgelesener Wert: " + value);

            } catch (IOException ioe){
                Log.error("Datei konnte nicht gelesen werden", ioe);
            }
        } else {
            Log.error("Die Datei wurde nicht gefunden.");
        }
    }
}
