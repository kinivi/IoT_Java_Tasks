package com.company.kinivi;

public abstract class Stone {
    private double price;
    private double weight; // in carats
    private int clarity;
    protected String type;

    public Stone(double price, double weight, int clarity, String type) {
        this.price = price;
        this.weight = weight;
        this.clarity = clarity;
        this.type = type;
    }

    abstract String getType();

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int getClarity() {
        return clarity;
    }
}
