/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw05.elements;

import ch.hslu.sw08.elements.State;

/**
 ** SW05: Vererbung / Entwicklungsumgebung
 *
 * @author Flavio Waser
 */
public abstract class Element {
    
    /*
    * Attribute definieren
    */
    private final String elementname;
    private final float meltingPoint;
    private final float boilingPoint;
    
    protected Element(final String elementname, final float meltingPoint, final float boilingPoint) {
        this.elementname = elementname;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
    }

    public String getElementname() {
        return elementname;
    }

    public float getMeltingPoint() {
        return meltingPoint;
    }

    public float getBoilingPoint() {
        return boilingPoint;
    }

    @Override
    public String toString() {
        return "Element{" + "elementname=" + elementname + ", meltingPoint=" + meltingPoint + ", boilingPoint=" + boilingPoint + "}";
    }
}
