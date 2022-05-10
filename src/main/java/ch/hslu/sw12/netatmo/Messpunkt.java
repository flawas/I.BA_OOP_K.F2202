/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.5.10
 */

package ch.hslu.sw12.netatmo;

import ch.hslu.sw11.temperaturVerlauf.Temperatur;

import java.time.LocalDateTime;
import java.util.Objects;

public class Messpunkt {

    private Temperatur temperatur;
    private LocalDateTime dateTime;

    public Messpunkt(final Temperatur temperatur, final LocalDateTime dateTime) {
        this.temperatur = temperatur;
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime(){
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }

    public Temperatur getTemperatur(){
        return this.temperatur;
    }

    public void setTemperatur(Temperatur temperatur){
        this.temperatur = temperatur;
    }

    @Override
    public String toString() {
        return "Messpunkt[Temperatur=" + this.temperatur.toString() + ",DateTime=" + this.dateTime.toString() + "]";
    }

    @Override
    final public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Messpunkt)) {
            return false;
        }
        final Messpunkt other = (Messpunkt) obj;

        return Float.compare(other.temperatur.getTempCelsius(), this.temperatur.getTempCelsius()) == 0 && other.dateTime.equals(this.dateTime);
    }

    @Override
    final public int hashCode() {
        return Objects.hash(this.temperatur, this.dateTime);
    }

    /**
     * Vergleicht zwei Messpunkte miteinander.
     * {@inheritDoc}.
     */
    @Override
    public int compareTo(Messpunkt other) {
        return Float.compare(this.temperatur.getTempCelsius(), other.temperatur.getTempCelsius());
    }
}

