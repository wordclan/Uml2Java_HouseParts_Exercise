package at.fhj.swd;

public enum BuildingPartCosts {
    ROOF(1000000), WINDOW(98000), WALL(1500000), DOOR(165000);
    private long costsInCent;

    private BuildingPartCosts(long costsInCent){
        this.costsInCent = costsInCent;
    }

    public long getCostsInCent() {
        return costsInCent;
    }
}
