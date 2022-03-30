/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.3.31
 */
package ch.hslu.sw06.elements;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Float.compare(element.meltingPoint, meltingPoint) == 0 && Float.compare(element.boilingPoint, boilingPoint) == 0 && Objects.equals(elementName, element.elementName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elementName, meltingPoint, boilingPoint);
    }

    @Override
    public String toString() {
        return "Element{" +
                "elementName='" + elementName + '\'' +
                ", meltingPoint=" + meltingPoint +
                ", boilingPoint=" + boilingPoint +
                '}';
    }
}
