package at.fhj.swd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class WallTest {
    Wall wall = new Wall();

    @Test
    void testToString() {
        assertEquals("The wall costs: 15000.0", wall.toString());
    }

    @Test
    void testGetCostsInCent(){
        assertEquals(1500000,wall.getCostsInCent());
    }
    
    @Test
    void testConstructor(){
        assertNotNull(new Wall());
    }



}