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
    void testGetID() {
        Person person = new Person(00001, "Waser", "Flavio");
        assertEquals(00001, person.getID());
    }

    @Test
    void testGetNachname() {
        Person person = new Person(00001, "Waser", "Flavio");
        assertEquals("Waser", person.getLastName());
    }

    @Test
    void testGetVorname() {
        Person person = new Person(00001, "Waser", "Flavio");
        assertEquals("Flavio", person.getFirstName());
    }

    @Test
    void testToString() {
        Person person = new Person(00001, "Waser", "Flavio");
        assertEquals("Person[ID=1,LastName=Waser,FirstName=Flavio]" , person.toString());
    }

    @Test
    void testEqualsTrue(){
        Person person = new Person(00001, "Waser", "Flavio");
        Person person2 = new Person(00001, "Waser", "Flavio");
        assertTrue(person.equals(person2));
    }

    @Test
    void testEqualsFalse(){
        Person person = new Person(1, "Waser", "Flavio");
        Person person2 = new Person(2, "Muster", "Peter");
        assertFalse(person.equals(person2));
    }

    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void testHashCode(){
        Person person = new Person(1, "Waser", "Flavio");
        assertEquals(395695019, person.hashCode());
    }

    @Test
    void testEqualsHashCode(){
        Person person = new Person(1, "Waser", "Flavio");
        Person person2 = new Person(2, "Muster", "Peter");
        assertNotEquals(person.hashCode(), person2.hashCode());
    }
}