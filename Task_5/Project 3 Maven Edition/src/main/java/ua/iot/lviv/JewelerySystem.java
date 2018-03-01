package ua.iot.lviv;

import java.util.ArrayList;

public class JewelerySystem {
    private ArrayList<Gem> availableGems;
    private ArrayList<SemiPreciousStone> availableSemiPreciousStones;
    private static ArrayList<Necklace> necklaces = new ArrayList<>();


    public JewelerySystem(final ArrayList<Gem> availableGems, final ArrayList<SemiPreciousStone> availableSemiPreciousStones) {
        this.availableGems = availableGems;
        this.availableSemiPreciousStones = availableSemiPreciousStones;
    }

    public final ArrayList<Gem> getAvailableGems() {
        return availableGems;
    }

    public final ArrayList<SemiPreciousStone> getAvailableSemiPreciousStones() {
        return availableSemiPreciousStones;
    }

    public static ArrayList<Necklace> getNecklaces() {
        return necklaces;
    }

    public final void addAvailableGems(final ArrayList<Gem> availableGems) {
        this.availableGems.addAll(availableGems);
    }

    public final void addAvailableGems(final Gem availableGem) {
        this.availableGems.add(availableGem);
    }

    public final void addAvailableSemiPreciousStones(SemiPreciousStone availableSemiPreciousStone) {
        this.availableSemiPreciousStones.add(availableSemiPreciousStone);
    }

    public Necklace createNecklace(final ArrayList<Gem> necklaceGems, final ArrayList<SemiPreciousStone> necklaceSemiPreciousStones) {
        Necklace necklace = new Necklace(necklaceGems, necklaceSemiPreciousStones);
        necklaces.add(necklace);
        return necklace;
    }

    public boolean removeNecklace(Necklace necklace) {
        return necklaces.remove(necklace);
    }
}
