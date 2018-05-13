package com.company.kinivi;

public class Gem extends Stone{

    private String gemName = "none";

    public Gem(double price, double weight, int clarity, String type) {
        super(price, weight, clarity, type);
    }

    public Gem(double price, double weight, int clarity, String type, String gemName) {
        super(price, weight, clarity, type);
        this.gemName = gemName;
    }


    @Override
    String getType() {
        return "Gem: " + type + "/n"
                + "Name of this gem(if present): " + gemName;
    }
}
