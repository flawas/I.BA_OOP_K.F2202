/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.13
 */

package ch.hslu.sw08.temperatur;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemperaturVerlauf {

    private ArrayList<Temperatur> temperaturs = new ArrayList<>();
    private float tempMinCelsius;
    private float tempMaxCelsius;

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
        if(temperaturs.size() != 0){
            return average / temperaturs.size();
        } else {
            return 0;
        }

    }

    public float getAverageKelvin(){
        float average = 0;
        for(int i = 0; i < temperaturs.size(); i++){
            average = average + temperaturs.get(i).getKelvin();
        }
        if(temperaturs.size() != 0){
            return average / temperaturs.size();
        } else{
            return 0;
        }

    }

    public float getMax(){
        if(temperaturs.size() > 1){
            tempMaxCelsius = temperaturs.get(0).getCelsius();
        } else {
            return 0;
        }
        for(int i = 0; i < temperaturs.size(); i++){
            if(tempMaxCelsius <= temperaturs.get(i).getCelsius()){
                tempMaxCelsius = temperaturs.get(i).getCelsius();
            }
        }
        return tempMaxCelsius;
    }

    public float getMin(){
        if(temperaturs.size() > 1){
            tempMinCelsius = temperaturs.get(0).getCelsius();
        } else {
            return 0;
        }
        for(int i = 0; i < temperaturs.size(); i++){
            if(tempMinCelsius > temperaturs.get(i).getCelsius()){
                tempMinCelsius = temperaturs.get(i).getCelsius();
            }
        }
        return tempMinCelsius;
    }

}