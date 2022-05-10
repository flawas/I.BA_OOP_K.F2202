/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw11.eventlistener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

/**
 *
 * @author Flavio Waser
 */
public class Licht implements Switchable {

    /**
     * Create Log4J Logger
     */
    private static final Logger Log = LogManager.getLogger();
    /*
    * Attribute
    */
    private int lumen;

    public Licht(int lumen) {
        this.lumen = lumen;
        Log.info(this.toString());
    }

    public int getLumen() {
        return lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
        Log.info(this.toString());
    }
    
    
    @Override
    public void switchOn(){
        setLumen(50);
        Log.info("ON: Licht");
    }
    
    @Override
    public void switchOff(){
        setLumen(0);
        Log.info("OFF: Licht");
    }
    
    @Override
    public boolean isSwitchedOn(){
        if(getLumen() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean isSwitchedOff(){
        if(getLumen() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Licht{" +
                "lumen=" + lumen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Licht licht = (Licht) o;
        return lumen == licht.lumen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lumen);
    }
}
