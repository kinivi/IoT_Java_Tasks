package ua.iot.lviv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JewelerySystemTest {

    private Necklace necklace;
    private JewelerySystem jewelerySystem;
    private Gem gem;
    private SemiPreciousStone semiPreciousStone;
    private ArrayList<Gem> gemArrayList;
    private ArrayList<SemiPreciousStone> semiPreciousStoneArrayList;

    @BeforeEach
    void setUp() {
        semiPreciousStone = new SemiPreciousStone(20, 20, Clarity.THIRD, "криптоніт", 1);
        gem = new Gem(20, 30, Clarity.FIRST, "Алмаз");

        gemArrayList = new ArrayList<>();
        semiPreciousStoneArrayList = new ArrayList<>();

        gemArrayList.add(gem);
        semiPreciousStoneArrayList.add(semiPreciousStone);

        jewelerySystem = new JewelerySystem(gemArrayList, semiPreciousStoneArrayList);
    }

    @Test
    void getAvailableGems() {
        assertEquals(gemArrayList, jewelerySystem.getAvailableGems());
        assertEquals(gemArrayList.size(), jewelerySystem.getAvailableGems().size());
        gemArrayList.remove(0);
        assertEquals(0, jewelerySystem.getAvailableGems().size());
    }

    @Test
    void getAvailableSemiPreciousStones() {
        assertEquals(semiPreciousStoneArrayList, jewelerySystem.getAvailableSemiPreciousStones());
    }

    @Test
    void getNecklaces() {
        necklace = jewelerySystem.createNecklace(gemArrayList, semiPreciousStoneArrayList);
        assertNotNull(JewelerySystem.getNecklaces());
        assertEquals(20, JewelerySystem.getNecklaces().get(0).findStone(Clarity.FIRST).getPrice());
    }

    @Test
    void addAvailableGems() {
        assertEquals(gemArrayList, jewelerySystem.getAvailableGems());
    }

    @Test
    void createNecklace() {
        assertTrue(() -> jewelerySystem.createNecklace(gemArrayList, semiPreciousStoneArrayList) != null);
    }

    @Test
    void removeNecklace() {
        jewelerySystem.createNecklace(gemArrayList, semiPreciousStoneArrayList);
        assertEquals(40, JewelerySystem.getNecklaces().get(0).getPrice());
        assertTrue(jewelerySystem.removeNecklace(JewelerySystem.getNecklaces().get(0)));

    }


}