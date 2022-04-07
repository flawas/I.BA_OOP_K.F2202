/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.3.31
 */
package ch.hslu.sw07.elements;

import ch.hslu.sw07.Person;

import java.util.Objects;

public abstract class Element {

    /**
     * Attribute
     */
    private final String elementName;
    private final float meltingPoint;
    private final float boilingPoint;

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
