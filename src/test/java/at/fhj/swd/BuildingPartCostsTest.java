package at.fhj.swd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingPartCostsTest {
    //    ROOF(1000000), WINDOW(98000), WALL(1500000), DOOR(165000);
    @Test
    void testCostAmounts() {
        assertEquals(1000000, BuildingPartCosts.ROOF.getCostsInCent());
        assertEquals(98000, BuildingPartCosts.WINDOW.getCostsInCent());
        assertEquals(1500000, BuildingPartCosts.WALL.getCostsInCent());
        assertEquals(165000, BuildingPartCosts.DOOR.getCostsInCent());
    }

}