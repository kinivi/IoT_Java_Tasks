package com.company.kinivi;

import java.util.ArrayList;

class Necklace {
    private double price = 0.0;
    private ArrayList<Gem> gemsInNecklace;
    private ArrayList<SemiPreciousStone> semiPreciousStonesInNecklace;
    private double weightInCarats = 0;

    public Necklace(ArrayList<Gem> gemsInNecklace, ArrayList<SemiPreciousStone> semiPreciousStonesInNecklace) {

        this.gemsInNecklace = gemsInNecklace;
        this.semiPreciousStonesInNecklace = semiPreciousStonesInNecklace;

        //getting weight
        gemsInNecklace.forEach(gem -> weightInCarats += gem.getWeight());
        semiPreciousStonesInNecklace.forEach(semiPreciousStone -> weightInCarats += semiPreciousStone.getWeight());

        //getting price
        gemsInNecklace.forEach(gem -> price += gem.getPrice());
        semiPreciousStonesInNecklace.forEach(semiPreciousStone -> price += semiPreciousStone.getPrice());
    }

    public double getPrice() {
        return price;
    }

    public double getWeightInCarats() {
        return weightInCarats;
    }

    public ArrayList<Stone> getSortedInPriceStones() {
        ArrayList<Stone> stones = new ArrayList<>();
        stones.addAll(gemsInNecklace);
        stones.addAll(semiPreciousStonesInNecklace);

        stones.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) return -1;
            else if (o1.getPrice() > o2.getPrice()) return 1;
            else return 0;
        });

        return stones;
    }

    public Stone findStone(int clarity) {
        ArrayList<Stone> stones = new ArrayList<>();
        stones.addAll(gemsInNecklace);
        stones.addAll(semiPreciousStonesInNecklace);

        for (int i = 0; i < stones.size(); i++) {
            if (stones.get(i).getClarity() == clarity) return stones.get(i);
        }

        return null;
    }
}



public class JewelerySystem {
    private ArrayList<Gem> availableGems;
    private ArrayList<SemiPreciousStone> availableSemiPreciousStones;
    private static ArrayList<Necklace> necklaces = new ArrayList<>();



    public JewelerySystem(ArrayList<Gem> availableGems, ArrayList<SemiPreciousStone> availableSemiPreciousStones) {
        this.availableGems = availableGems;
        this.availableSemiPreciousStones = availableSemiPreciousStones;
    }

    public ArrayList<Gem> getAvailableGems() {
        return availableGems;
    }

    public ArrayList<SemiPreciousStone> getAvailableSemiPreciousStones() {
        return availableSemiPreciousStones;
    }

    public static ArrayList<Necklace> getNecklaces() {
        return necklaces;
    }

    public void addAvailableGems(ArrayList<Gem> availableGems) {
        this.availableGems.addAll(availableGems);
    }

    public void addAvailableGems(Gem availableGem) {
        this.availableGems.add(availableGem);
    }

    public void addAvailableSemiPreciousStones(SemiPreciousStone availableSemiPreciousStone) {
        this.availableSemiPreciousStones.add(availableSemiPreciousStone);
    }

    public Necklace createNecklace(ArrayList<Gem> necklaceGems, ArrayList<SemiPreciousStone> necklaceSemiPreciousStones){
        Necklace necklace = new Necklace(necklaceGems, necklaceSemiPreciousStones);
        necklaces.add(necklace);
        return necklace;
    }

    public boolean removeNecklace(Necklace necklace) {
        return necklaces.remove(necklace);
    }
}
