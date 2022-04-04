/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.4
 */

package ch.hslu.sw07;

import ch.hslu.sw06.Point;

import java.util.Objects;

public class Person implements Comparable<Person>{
    /**
     * Attribute definieren
     */
    final private long ID;
    private String LastName;
    private String FirstName;

    public Person(long ID, String LastName, String FirstName) {
        this.ID = ID;
        this.LastName = LastName;
        this.FirstName = FirstName;
    }

    public long getID() {
        return ID;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    /**
     * Überprüft ob Personen gleich sind.
     * 1. Identität gleich
     * 2. Korrekter Typ
     * 3. Werte gleich
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        final Person other = (Person) obj;

        return (other.ID == this.ID) && (other.LastName == this.LastName || (other.LastName != null && other.LastName.equals(this.LastName))) && (other.FirstName == this.FirstName || (other.FirstName != null && other.FirstName.equals(this.FirstName)));
    }

    /**
     * Liefert eine Hash-Repräsentation der Person.
     * {@inheritDoc}
     */
    @Override
    public final int hashCode(){
        return Objects.hash(this.ID, this.LastName, this.FirstName);
    }

    /**
     * Liefert eine String-Repräsentation der Person.
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Person[ID=" + this.ID + ",LastName=" + this.LastName + ",FirstName=" + this.FirstName +"]";
    }

    /**
     * Vergleicht zwei Personen miteinander.
     * {@inheritDoc}
     */
    @Override
    public int compareTo(Person other) {
        return Long.compare(this.ID, other.ID);
    }
}
