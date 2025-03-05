package at.fhj.swd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RoofTest {
    Roof roof = new Roof();

    @Test
    void testToString() {
        assertEquals("The roof costs: 10000.0", roof.toString());
    }

    @Test
    void testGetCostsInCent() {
        assertEquals(1000000, roof.getCostsInCent());
    }

    @Test
    void testConstructor() {
        assertNotNull(new Roof());
    }


}