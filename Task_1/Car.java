package ua.iot.lviv;

public class Car {



    private int year;
    private String color;
    private String model;
    private double price;

    static int totalAmount;

    /* Constructors: default, 4 fields, all fields */

    Car() {
    }


    public Car(int year, String color, String model, double price) {
        this.year = year;
        this.color = color;
        this.model = model;
        this.price = price;
        totalAmount++;
    }

    public Car(int year, String color, String model, double price, int totalAmount) {
        this.year = year;
        this.color = color;
        this.model = model;
        this.price = price;
        Car.totalAmount = totalAmount;
    }

    // ACCESS METHODS

    //year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /* Methods */

    public String toString() {
        return getYear() + " " + getPrice() + "$ " + getColor() + " " + " " + getModel();
    }

    public static void printStaticSum() {
        System.out.println("totalAmount: " + totalAmount);
    }

    public void printSum() {
        System.out.println("totalAmount: " + totalAmount);
    }

    public void resetValues(int amount, String color, String type, double size, double price, int totalAmount) {
        this.year = amount;
        this.color = color;
        this.model = type;
        this.price = price;
        Car.totalAmount = totalAmount;
    }


}
