/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.5.10
 */

package ch.hslu.sw12.temperatur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class DataHandler {

    /**
     * Create Log4J Logger
     */
    private static final Logger Log = LogManager.getLogger();

    public void writeToFile(final String filename, final ArrayList list){
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), Charset.forName("UTF-8"))))){
            for(int i = 0; i < list.size(); i++){
                pw.println(list.get(i));
                pw.flush();
            }
            Log.info("File geschrieben" + filename);
        } catch (IOException ioe){
            Log.error(ioe.getMessage(), ioe);
        }
    }

}
