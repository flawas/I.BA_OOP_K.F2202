/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.5.9
 */

package ch.hslu.sw12.example;

public class App {

    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        dataHandler.writeTextFile("text.txt", "Ich bin ein Text");

        dataHandler.writeIntFile("number.txt", 5);

        dataHandler.readTextFile("text.txt");

        dataHandler.readIntFile("number.txt");
    }
}
