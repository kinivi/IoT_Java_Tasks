package ua.iot.lviv;

import java.util.ArrayList;

public class Main {

    public static void main(final String[] args) {

        SemiPreciousStone semiPreciousStone = new SemiPreciousStone(20, 20, 3, "криптоніт", 1);
        Gem gem = new Gem(20, 30, 1, "Алмаз");

        ArrayList<Gem> gemArrayList = new ArrayList<>();
        ArrayList<SemiPreciousStone> semiPreciousStoneArrayList = new ArrayList<>();

        gemArrayList.add(gem);
        semiPreciousStoneArrayList.add(semiPreciousStone);

        JewelerySystem jewelerySystem = new JewelerySystem(gemArrayList, semiPreciousStoneArrayList);

        Necklace necklace = jewelerySystem.createNecklace(gemArrayList, semiPreciousStoneArrayList);

        System.out.println(necklace.getPrice() + " $");
        System.out.println(necklace.getWeightInCarats() + " carats");

    }
}
