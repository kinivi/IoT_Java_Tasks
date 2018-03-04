package ua.iot.lviv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class NecklaceTest {

    private ArrayList<Gem> gemArrayList;
    private ArrayList<SemiPreciousStone> semiPreciousStoneArrayList;
    private JewelerySystem jewelerySystem;
    private Necklace necklace;


    @BeforeEach
    void setUP() {
        SemiPreciousStone semiPreciousStone = new SemiPreciousStone(20, 20, 3, "криптоніт", 1);
        Gem gem = new Gem(30, 30, 1, "Алмаз");

        gemArrayList = new ArrayList<>();
        semiPreciousStoneArrayList = new ArrayList<>();

        gemArrayList.add(gem);
        semiPreciousStoneArrayList.add(semiPreciousStone);

        jewelerySystem = new JewelerySystem(gemArrayList, semiPreciousStoneArrayList);
        necklace = jewelerySystem.createNecklace(gemArrayList, semiPreciousStoneArrayList);
    }

    @Test
    void getPrice() {
        assumingThat(necklace != null, () -> assertEquals(50, necklace.getPrice()));
    }


    @Test
    void getWeightInCarats() {
        assumingThat(necklace != null, () -> assertEquals(50, necklace.getWeightInCarats()));
    }

    @Test
    void getSortedInPriceStones() {
        assumingThat(necklace != null, () -> assertEquals(30, necklace.getSortedInPriceStones()
                .get(0).getPrice()));
    }

    @Test
    void findStone() {
        assumingThat(necklace != null, () -> assertEquals(30, necklace.findStone(1).getPrice()));
        assumingThat(necklace != null, () -> assertEquals(20, necklace.findStone(3).getPrice()));
        assumingThat(necklace != null, () -> assertNull(necklace.findStone(10)));
    }
}