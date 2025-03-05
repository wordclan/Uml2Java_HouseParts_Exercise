package at.fhj.swd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class WindowTest {
    Window window = new Window();

    @Test
    void testToString() {
        assertEquals("The window costs: 980.0", window.toString());
    }

    @Test
    void testGetCostsInCent(){
        assertEquals(98000, window.getCostsInCent());
    }
    
    @Test
    void testConstructor(){
        assertNotNull(new Window());
    }



}