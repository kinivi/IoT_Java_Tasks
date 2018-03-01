package ua.iot.lviv;

public abstract class Stone {
    private final double price;
    private final double weight; // in carats
    private final int clarity;
    private String type;

    public Stone(final double price, final double weight, final int clarity, final String type) {
        this.price = price;
        this.weight = weight;
        this.clarity = clarity;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public final double getPrice() {
        return price;
    }

    public final double getWeight() {
        return weight;
    }

    public final int getClarity() {
        return clarity;
    }
}
