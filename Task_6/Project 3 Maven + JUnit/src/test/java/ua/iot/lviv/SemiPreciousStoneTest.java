package ua.iot.lviv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemiPreciousStoneTest {

    @Test
    void getType() {
        assertEquals("Semi-precious stone: " + "gem" + "/n"
                + "Class of this stone " + 4, new SemiPreciousStone(2, 3, Clarity.FOURTH, "gem", 4)
                .getType());
        assertEquals("Semi-precious stone: " + "gem" + "/n"
                + "Class of this stone " + 1, new SemiPreciousStone(2, 3, Clarity.FOURTH, "gem", 1)
                .getType());
    }
}