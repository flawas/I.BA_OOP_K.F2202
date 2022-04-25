package ch.hslu.sw08.elements;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementTest {

    @Test
    void testEqualsTrue() {
        Hg hg = new Hg();
        Hg hg2 = new Hg();
        assertTrue(hg.equals(hg2));
    }

    @Test
    void testEqualsFalse(){
        Hg hg = new Hg();
        N n = new N();
        assertFalse(n.equals(hg));
    }

    @Test
    void testHashCodePb() {
        Pb pb = new Pb();
        assertEquals(24606376, pb.hashCode());
    }

    @Test
    void testHashCodeN() {
        N n = new N();
        assertEquals(297927961, n.hashCode());
    }

    @Test
    void testHashCodeHg() {
        Hg hg = new Hg();
        assertEquals(-186969338, hg.hashCode());
    }

    @Test
    void testToString() {
        Hg hg = new Hg();
        assertEquals("Element[elementName='Hg', meltingPoint=-38.72, boilingPoint=357.0]", hg.toString());
    }

    @Disabled
    public void testEqualsContract() {
        EqualsVerifier.forClass(Element.class).verify();
    }

    @Test
    void testGetStateSolid(){
        Hg hg = new Hg();
        assertEquals(State.SOLID, hg.getState(-200));
        assertEquals(State.SOLID, hg.getState(-39));
        hg.getStateString(-39);
    }

    @Test
    void testGetStateLiquid(){
        ch.hslu.sw08.elements.Hg hg = new Hg();
        //assertEquals(State.LIQUID, hg.getState(10));
        assertEquals(State.LIQUID, hg.getState(-38.72f));
        hg.getStateString(-38.72f);
    }

    @Test
    void testGetStateGas(){
        ch.hslu.sw08.elements.Hg hg = new Hg();
        //assertEquals(State.GAS, hg.getState(190));
        assertEquals(State.GAS, hg.getState(357));
        hg.getStateString(357);
    }

    @Test
    void testGetEnumStateString(){
        Hg hg = new Hg();
        assertEquals("gasförmig", hg.getEnumString(State.GAS));
    }
}