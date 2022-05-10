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
public class Motor implements Switchable {

    /**
     * Create Log4J Logger
     */
    private static final Logger Log = LogManager.getLogger();

    /*
    * Attribute
    */
    private int rpm;
    private MotorState motorState;

    // Datenstruktur zur Speicherung aller Listener.
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return this.rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
        setMotorState(rpm);
    }

    public void setMotorState(int inp){
        if(inp > 0){
            MotorState motorState = MotorState.ON;
        } else{
            MotorState motorState = MotorState.OFF;
        }
    }

    /**
     * Registriert einen PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if(!listener.equals(null)){
            this.changeListeners.add(listener);
        }
    }
    /**
     * Deregistriert einen PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        if(!listener.equals(null)){
            this.changeListeners.remove(listener);
        }
    }

    /**
     * Informiert alle PropertyChangeListeners über PropertyChangeEvent.
     * @param pcEvent PropertyChangeEvent.
     */
    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(pcEvent);
        }
    }

    @Override
    public void switchOn(){
        setRpm(100);
        final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorState.OFF, MotorState.ON);
        this.firePropertyChangeEvent(pcEvent);
    }
    
    @Override
    public void switchOff(){
        setRpm(0);
        final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorState.ON, MotorState.OFF);
        this.firePropertyChangeEvent(pcEvent);
    }
    
    @Override
    public boolean isSwitchedOn(){
        if(getRpm() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean isSwitchedOff(){
        if(getRpm() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                "rpm=" + rpm +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return rpm == motor.rpm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rpm);
    }
}
