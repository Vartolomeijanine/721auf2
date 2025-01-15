package model;

public class Produkte {
    private int produktID;
    private String produktName;
    private String herkunftsregion;

    public Produkte(int produktID, String produktName, String herkunftsregion) {
        this.produktID = produktID;
        this.produktName = produktName;
        this.herkunftsregion = herkunftsregion;
    }

    public int getProduktID() {
        return produktID;
    }

    public void setProduktID(int produktID) {
        this.produktID = produktID;
    }

    public String getProduktName() {
        return produktName;
    }

    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }

    public String getHerkunftsregion() {
        return herkunftsregion;
    }

    public void setHerkunftsregion(String herkunftsregion) {
        this.herkunftsregion = herkunftsregion;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "produktID=" + produktID +
                ", produktName='" + produktName + '\'' +
                ", herkunftsregion='" + herkunftsregion + '\'' +
                '}';
    }
}
