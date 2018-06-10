package ua.iot.lviv;

public class Main {
    public static void main(String[] args) {
        /* Create Car instance using default constructor and setters */
        Car ferrari = new Car();

        ferrari.setYear(20);
        ferrari.setColor("Black");
        ferrari.setModel("FM-3200");
        ferrari.setPrice(200000);

        System.out.println(ferrari.toString());
        Car.printStaticSum();
        ferrari.printSum();

        /* Create Car instance using constructor with 4 fields specified */

        Car bmw = new Car(15, "Green", "SX-2", 15000);

        System.out.println(bmw.toString());
        Car.printStaticSum();
        bmw.printSum();

        /* Create Car instance using constructor with all the fields specified */

        Car lamborghini = new Car(25, "Space gray", "EX-12", 20000, 550);

        System.out.println(lamborghini.toString());
        Car.printStaticSum();
        lamborghini.printSum();
    }
}
