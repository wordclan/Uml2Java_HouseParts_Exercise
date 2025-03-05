package at.fhj.swd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DoorTest {
    Door door = new Door();

    @Test
    void testToString() {
        assertEquals("The door costs: 1650.0", door.toString());
    }

    @Test
    void testGetCostsInCent(){
        assertEquals(165000,door.getCostsInCent());
    }
    
    @Test
    void testConstructor(){
        assertNotNull(new Door());
    }



}