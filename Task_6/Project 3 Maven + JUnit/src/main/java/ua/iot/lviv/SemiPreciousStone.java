package ua.iot.lviv;

public class SemiPreciousStone extends Stone {

    private final int stoneClass;

    public SemiPreciousStone(final double price, final double weight, final int clarity,
                             final String type, final int stoneClass) {
        super(price, weight, clarity, type);
        this.stoneClass = stoneClass;
    }

    @Override
    public String getType() {
        return "Semi-precious stone: " + super.getType() + "/n"
                + "Class of this stone " + stoneClass;
    }


}
