package com.company.kinivi;

public class SemiPreciousStone extends Stone {

    private int stoneClass;

    public SemiPreciousStone(double price, double weight, int clarity, String type, int stoneClass) {
        super(price, weight, clarity, type);
        this.stoneClass = stoneClass;
    }

    @Override
    String getType() {
        return "Semi-precious stone: " + type + "/n"
                + "Class of this stone " + stoneClass;
    }


}
