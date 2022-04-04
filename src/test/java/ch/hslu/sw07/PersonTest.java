/*
 * Copyright (c) 2022.
 * Flavio Waser, flaviowaser.ch
 * Version 1.0, 2022.4.4
 */

package ch.hslu.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getID() {
        Person person = new Person(00001, "Waser", "Flavio");
        assertEquals(00001, person.getID());
    }

    @Test
    void getNachname() {
        Person person = new Person(00001, "Waser", "Flavio");
        assertEquals("Waser", person.getLastName());
    }

    @Test
    void getVorname() {
        Person person = new Person(00001, "Waser", "Flavio");
        assertEquals("Flavio", person.getFirstName());
    }

    @Test
    void testToString() {
        Person person = new Person(00001, "Waser", "Flavio");
        assertEquals("Person: 1, Waser, Flavio" , person.toString());
    }

    @Test
    void testEquals(){
        Person person = new Person(00001, "Waser", "Flavio");
        Person person2 = new Person(00001, "Waser", "Flavio");
        assertTrue(person.equals(person2));
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }
}