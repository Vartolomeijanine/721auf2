package controller;

import model.Charakter;
import model.Produkte;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Produkte> produkte = new ArrayList<>();
    private List<Charakter> charaktere = new ArrayList<>();

    public void addProdukte(Produkte produkte) {
        this.produkte.add(produkte);
    }

    public List<Produkte> getProdukte() {
        return produkte;
    }

    public void updateProdukte(int produktID, String newName, String newHerkunftsregion) {
        for (Produkte produkt: this.produkte){
            if (produkt.getProduktID() == produktID){
                produkt.setProduktName(newName);
                produkt.setHerkunftsregion(newHerkunftsregion);
                System.out.println("Product updated: " + produkt);
                return;
            }
        }
        System.out.println("Product with ID " + produktID + " not found.");
    }

    public void deleteProduct(int produktID) {
        produkte.removeIf(p -> p.getProduktID() == produktID);
    }


}
