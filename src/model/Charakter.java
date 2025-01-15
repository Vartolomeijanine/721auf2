package model;

import java.util.ArrayList;
import java.util.List;

public class Charakter {
    private int charakterID;
    private String charakterName;
    private String herkunftsort;
    private List<Produkte> listeProdukte;

    public Charakter(int charakterID, String charakterName, String herkunftsort) {
        this.charakterID = charakterID;
        this.charakterName = charakterName;
        this.herkunftsort = herkunftsort;
        this.listeProdukte = new ArrayList<>();
    }

    public int getCharakterID() {
        return charakterID;
    }

    public void setCharakterID(int charakterID) {
        this.charakterID = charakterID;
    }

    public String getCharakterName() {
        return charakterName;
    }

    public void setCharakterName(String charakterName) {
        this.charakterName = charakterName;
    }

    public String getHerkunftsort() {
        return herkunftsort;
    }

    public void setHerkunftsort(String herkunftsort) {
        this.herkunftsort = herkunftsort;
    }

    public List<Produkte> getListeProdukte() {
        return listeProdukte;
    }

    public void setListeProdukte(List<Produkte> listeProdukte) {
        this.listeProdukte = listeProdukte;
    }

    @Override
    public String toString() {
        return "Charakter{" +
                "charakterID=" + charakterID +
                ", charakterName='" + charakterName + '\'' +
                ", herkunftsort='" + herkunftsort + '\'' +
                ", listeProdukte=" + listeProdukte +
                '}';
    }
}
