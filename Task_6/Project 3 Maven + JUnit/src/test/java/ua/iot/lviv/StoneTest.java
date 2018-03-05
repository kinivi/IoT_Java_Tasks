package ua.iot.lviv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoneTest {
    private Stone someStone;

    @Test
    void setType() {
        someStone = new Gem(20.4, 3, Clarity.SECOND, "X2 A457");
        someStone.setType("Wolframium");

        assertEquals("Gem: " + "Wolframium" + "/n"
                + "Name of this gem(if present): " + "none", someStone.getType());

    }


}