package at.fhj.swd;

public class Door extends BuildingPart {
    public Door() {
        super(BuildingPartCosts.DOOR.getCostsInCent());
    }

    @Override
    public String toString() {
        return "The door costs: "+ getCostsInCent() / 100.0;
    }
}