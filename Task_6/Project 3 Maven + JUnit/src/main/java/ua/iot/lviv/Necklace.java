package ua.iot.lviv;

import java.util.LinkedList;
import java.util.List;

public class Necklace {
    private double price = 0.0;
    private List<Gem> gemsInNecklace;
    private List<SemiPreciousStone> semiPreciousStonesInNecklace;
    private double weightInCarats = 0;

    public Necklace(final List<Gem> gemsInNecklace, final List<SemiPreciousStone> semiPreciousStonesInNecklace) {

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

    public List<Stone> getSortedInPriceStones() {
        List<Stone> stones = new LinkedList<>();
        stones.addAll(gemsInNecklace);
        stones.addAll(semiPreciousStonesInNecklace);

        stones.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        });

        return stones;
    }

    public Stone findStone(final Clarity clarity) {
        List<Stone> stones = new LinkedList<>();
        stones.addAll(gemsInNecklace);
        stones.addAll(semiPreciousStonesInNecklace);

        for (int i = 0; i < stones.size(); i++) {
            if (stones.get(i).getClarity() == clarity) {
                return stones.get(i);
            }
        }

        return null;
    }
}
