/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw05.namedInterface;

/**
 *
 * @author Flavio Waser
 */
public class Name implements namedInterface {
    
    /*
    * Attribute
    */
    private String name;
    
    public Name(){
        this.name = null;
    }
    
    @Override
    public void setName(final String name){
        this.name = name;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
}
