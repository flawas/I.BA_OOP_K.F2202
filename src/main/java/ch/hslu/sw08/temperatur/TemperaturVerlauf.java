/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.13
 */

package ch.hslu.sw08.temperatur;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class TemperaturVerlauf {

    private ArrayList<Temperatur> temperaturs = new ArrayList<>();

    public TemperaturVerlauf() {
    }

    public void add(Temperatur temperatur) {
        temperaturs.add(temperatur);
    }

    public void clear(){
        temperaturs.clear();
    }

    public int getCount(){
        return temperaturs.size();
    }

    public float getAverageCelsius(){
        float average = 0;
        for(int i = 0; i < temperaturs.size(); i++){
            average = average + temperaturs.get(i).getCelsius();
        }
        return average / temperaturs.size();
    }

    public float getAverageKelvin(){
        float average = 0;
        for(int i = 0; i < temperaturs.size(); i++){
            average = average + temperaturs.get(i).getKelvin();
        }
        return average / temperaturs.size();
    }

}
