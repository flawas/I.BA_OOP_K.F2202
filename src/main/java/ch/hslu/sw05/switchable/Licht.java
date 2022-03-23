/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw05.switchable;

/**
 ** SW05: Vererbung / Entwicklungsumgebung
 * 
 * @author Flavio Waser
 */
public class Licht extends CountingSwitchable implements Switchable {
    
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
         addCount();
    }
    
    @Override
    public void switchOff(){
        setLumen(0);
        addCount();
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
