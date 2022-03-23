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
public abstract class CountingSwitchable {
    /*
    * Attribute definieren
    */
    private long switchCount;
    
    public CountingSwitchable(){
        this.switchCount = 0;
    }

    public long getSwitchCount() {
        return switchCount;
    }

    public void addCount(){
        switchCount++;
    }
    
}
