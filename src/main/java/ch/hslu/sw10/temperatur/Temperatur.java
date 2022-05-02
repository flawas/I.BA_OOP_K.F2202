/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.13
 */

package ch.hslu.sw10.temperatur;

import java.util.Objects;

public class Temperatur {

    private static final float KELVIN_OFFSET = 273.15f;
    private float celsius;
    private float kelvin;

    public Temperatur(float celsius) {
        this.celsius = this.celsius;
        kelvin = convertCelsiusToKelvin(this.celsius);
    }

    public Temperatur(final float temperatur, final Unit unit){
        switch (unit){
            case KELVIN -> this.setKelvin(temperatur);
            case CELSIUS -> this.setCelsius(temperatur);
        }
    }

    public float getCelsius() {
        return celsius;
    }

    public float getKelvin() {
        return kelvin;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
        kelvin = convertCelsiusToKelvin(this.celsius);
    }

    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
        celsius = convertKelvinToCelsius(this.kelvin);
    }

    public float convertKelvinToCelsius(float kelvin){
        return this.kelvin - KELVIN_OFFSET;
    }

    public float convertCelsiusToKelvin(float celsius){
        return this.celsius + KELVIN_OFFSET;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperatur that = (Temperatur) o;
        return Float.compare(that.KELVIN_OFFSET, KELVIN_OFFSET) == 0 && Float.compare(that.celsius, celsius) == 0 && Float.compare(that.kelvin, kelvin) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(KELVIN_OFFSET, celsius, kelvin);
    }

    @Override
    public String toString() {
        return "Temperatur{" +
                "KELVIN_OFFSET=" + KELVIN_OFFSET +
                ", celsius=" + celsius +
                ", kelvin=" + kelvin +
                '}';
    }

    protected static Temperatur createFromCelsius(final float celsius){
     return new Temperatur(celsius, Unit.CELSIUS);
    }

    protected static Temperatur createFromKelvin(final float kelvin){
        return new Temperatur(kelvin, Unit.KELVIN);
    }
}
