/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.3.31
 */
package ch.hslu.sw08.elements;

import org.apache.logging.log4j.LogManager;

import java.util.Objects;
import java.util.logging.Logger;

public abstract class Element {

    /**
     * Attribute
     */
    private final String elementName;
    private final float meltingPoint;
    private final float boilingPoint;
    private Enum<State> state;


    protected Element(final String elementName, final float meltingPoint, final float boilingPoint){
        this.elementName = elementName;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
    }

    public String getElementName() {
        return elementName;
    }

    public float getMeltingPoint() {
        return meltingPoint;
    }

    public float getBoilingPoint() {
        return boilingPoint;
    }

    public Enum getState(final float temp){

        if(temp < this.meltingPoint){
            state = State.SOLID;
        }

        if(this.meltingPoint <= temp && temp < this.boilingPoint){
            state = State.LIQUID;
        }

        if(this.boilingPoint <= temp) {
            state = State.GAS;
        }
        return state;
    }

    public void getStateString(final float temp) {
        if (temp < this.meltingPoint) {
            System.out.println(this.elementName + " ist bei " + temp + " Grad Celsius fest.");
        }

        if (this.meltingPoint <= temp && temp < this.boilingPoint) {
            System.out.println(this.elementName + " ist bei " + temp + " Grad Celsius flüssig.");
        }

        if (this.boilingPoint <= temp) {
            System.out.println(this.elementName + " ist bei " + temp + " Grad Celsius gasförmig.");
        }
    }

    public String getEnumString(final Enum<State> state){
        if(state == State.SOLID){
            return "fest";
        }
        if(state == State.LIQUID){
            return "flüssig";
        }
        if(state == State.GAS){
            return "gasförmig";
        }
        return "Fehler";
    }

    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Element)) {
            return false;
        }
        final Element other = (Element) o;
        return (other.elementName == this.elementName);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(elementName, boilingPoint, meltingPoint);
    }

    @Override
    public String toString() {
        return "Element[" +
                "elementName='" + elementName + '\'' +
                ", meltingPoint=" + meltingPoint +
                ", boilingPoint=" + boilingPoint +
                ']';
    }


}
