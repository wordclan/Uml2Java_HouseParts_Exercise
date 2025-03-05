package at.fhj.swd;

public class Roof extends BuildingPart {
    public Roof() {
        super(BuildingPartCosts.ROOF.getCostsInCent());
    }

    @Override
    public String toString() {
        return "The roof costs: "+ getCostsInCent() / 100.0;
    }
}