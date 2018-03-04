package ua.iot.lviv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GemTest {

    @Test
    void getType() {
        assertEquals("Gem: " + "gem" + "/n"
                + "Name of this gem(if present): " + "none", new Gem(2, 3, 4, "gem").getType());
        assertEquals("Gem: " + "gem" + "/n"
                + "Name of this gem(if present): " + "Good Gem", new Gem(2, 3, 4, "gem",
                "Good Gem").getType());
    }
}