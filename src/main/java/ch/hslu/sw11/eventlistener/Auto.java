/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw11.eventlistener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Flavio Waser
 */
public class Auto implements Switchable {

    /**
     * Create Log4J Logger
     */
    private static final Logger Log = LogManager.getLogger();

    /*
    * Attribute
    */
    private int rpm;
    private int lumen;
    private Motor motor;

    Licht lichtlinks = new Licht(0);
    Licht lichtrechts = new Licht(0);

    
    public Auto() {
        lichtlinks.setLumen(0);
        lichtrechts.setLumen(0);
        Log.info(this.toString());
        this.motor = new Motor();
        this.motor.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                handleMotorEvent("Event vom Motor", evt);
            }
        });
    }

    private void handleMotorEvent(String output, PropertyChangeEvent evt){
        Log.info(output, evt);
    }
    
    public Auto(int rpm, int lumen){
        this.rpm = rpm;
        this.lumen = lumen;
        
        motor.setRpm(rpm);
        lichtlinks.setLumen(lumen);
        lichtlinks.setLumen(lumen);
        Log.info(this.toString());
    }
    
    @Override
    public void switchOn(){
        motor.switchOn();
        lichtlinks.switchOn();
        lichtrechts.switchOn();
        Log.info("ON: Motor, lichtlinks and lichtrechts");
    }
    
    @Override
    public void switchOff(){
        motor.switchOff();
        lichtlinks.switchOff();
        lichtrechts.switchOff();
        Log.info("OFF: Motor, lichtlinks and lichtrechts");
    }
    
    @Override
    public boolean isSwitchedOn(){
        if(motor.getRpm() > 0 && lichtlinks.getLumen() > 0 && lichtrechts.getLumen() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean isSwitchedOff(){
        if(motor.getRpm() == 0 && lichtlinks.getLumen() == 0 && lichtrechts.getLumen() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "lichtlinks=" + lichtlinks +
                ", lichtrechts=" + lichtrechts +
                ", motor=" + motor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return rpm == auto.rpm && lumen == auto.lumen && Objects.equals(lichtlinks, auto.lichtlinks) && Objects.equals(lichtrechts, auto.lichtrechts) && Objects.equals(motor, auto.motor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rpm, lumen, lichtlinks, lichtrechts, motor);
    }


}
