/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.sw11.eventlistener;

/**
 *
 * @author Flavio Waser
 */
public interface Switchable {

    void switchOn();

    void switchOff();

    boolean isSwitchedOn();

    boolean isSwitchedOff();
}
