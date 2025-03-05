package at.fhj.swd;

public abstract class BuildingPart {
    private long costsInCent;

    public BuildingPart(long costsInCent){
        this.costsInCent = costsInCent;
    }

    public BuildingPart() {

    }

    public long getCostsInCent() {
        return costsInCent;
    }

    @Override
    public String toString() {
        return "" + costsInCent/100F;
    }



}
