package at.fhj.swd;

public class Wall extends BuildingPart {
    public Wall() {
        super(BuildingPartCosts.WALL.getCostsInCent());
    }

    @Override
    public String toString() {
        return "The wall costs: "+ getCostsInCent() / 100.0;
    }
}
