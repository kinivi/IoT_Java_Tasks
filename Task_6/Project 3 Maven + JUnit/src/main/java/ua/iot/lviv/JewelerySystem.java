package ua.iot.lviv;

import java.util.LinkedList;
import java.util.List;

public class JewelerySystem {
    private List<Gem> availableGems;
    private List<SemiPreciousStone> availableSemiPreciousStones;
    private static List<Necklace> necklaces = new LinkedList<>();


    public JewelerySystem(final List<Gem> availableGems, final List<SemiPreciousStone> availableSemiPreciousStones) {
        this.availableGems = availableGems;
        this.availableSemiPreciousStones = availableSemiPreciousStones;
    }

    public final List<Gem> getAvailableGems() {
        return availableGems;
    }

    public final List<SemiPreciousStone> getAvailableSemiPreciousStones() {
        return availableSemiPreciousStones;
    }

    public static List<Necklace> getNecklaces() {
        return necklaces;
    }

//    public final void addAvailableGems(final List<Gem> availableGems) {
//        this.availableGems.addAll(availableGems);
//    }
//
//    public final void addAvailableGems(final Gem availableGem) {
//        this.availableGems.add(availableGem);
//    }
//
//    public final void addAvailableSemiPreciousStones(SemiPreciousStone availableSemiPreciousStone) {
//        this.availableSemiPreciousStones.add(availableSemiPreciousStone);
//    }

    public Necklace createNecklace(final List<Gem> necklaceGems, final List<SemiPreciousStone> necklaceSemiPreciousStones) {
        Necklace necklace = new Necklace(necklaceGems, necklaceSemiPreciousStones);
        necklaces.add(necklace);
        return necklace;
    }

    public boolean removeNecklace(Necklace necklace) {
        return necklaces.remove(necklace);
    }
}
