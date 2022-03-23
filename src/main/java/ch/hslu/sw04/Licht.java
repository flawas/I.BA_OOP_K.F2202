/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw04;

/**
 *
 * @author Flavio Waser
 */
public class Licht implements Switchable {
    
    /*
    * Attribute
    */
    private int lumen;

    public Licht(int lumen) {
        this.lumen = lumen;
    }

    public int getLumen() {
        return lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
    }
    
    
    @Override
    public void switchOn(){
         setLumen(50);
    }
    
    @Override
    public void switchOff(){
        setLumen(0);
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
    
    
}
