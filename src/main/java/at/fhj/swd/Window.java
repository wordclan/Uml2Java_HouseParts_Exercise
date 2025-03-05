package at.fhj.swd;

public class Window extends BuildingPart {
    public Window() {
        super(BuildingPartCosts.WINDOW.getCostsInCent());
    }

    @Override
    public String toString() {
        return "The window costs: "+ getCostsInCent() / 100.0;
    }
}
