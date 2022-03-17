/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw04;

/**
 *
 * @author flaviowaser
 */
public class Auto implements Switchable {
    
    /*
    * Attribute
    */
    private int rpm;
    private int lumen;
    
    Licht lichtlinks = new Licht(0);
    Licht lichtrechts = new Licht(0);
    Motor motor = new Motor(0);
    
    public Auto() {
        motor.setRpm(0);
        lichtlinks.setLumen(0);
        lichtrechts.setLumen(0);
    }
    
    public Auto(int rpm, int lumen){
        this.rpm = rpm;
        this.lumen = lumen;
        
        motor.setRpm(rpm);
        lichtlinks.setLumen(lumen);
        lichtlinks.setLumen(lumen);
    }
    
    @Override
    public void switchOn(){
        motor.switchOn();
        lichtlinks.switchOn();
        lichtrechts.switchOn();
    }
    
    @Override
    public void switchOff(){
        motor.switchOff();
        lichtlinks.switchOff();
        lichtrechts.switchOff();
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
 
}
