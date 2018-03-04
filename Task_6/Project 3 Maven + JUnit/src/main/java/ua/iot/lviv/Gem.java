package ua.iot.lviv;

public class Gem extends Stone {

    private final String gemName;

    public Gem(final double price, final double weight, final int clarity, final String type) {
        super(price, weight, clarity, type);
        gemName = "none";
    }

    public Gem(final double price, final double weight, final int clarity, final String type, final String gemName) {
        super(price, weight, clarity, type);
        if (gemName != null) {
            this.gemName = gemName;
        } else {
            this.gemName = "none";
        }
    }

    /**
     * @return string
     */
    @Override
    public String getType() {
        return "Gem: " + super.getType() + "/n"
                + "Name of this gem(if present): " + gemName;
    }
}
