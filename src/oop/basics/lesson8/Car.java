package oop.basics.lesson8;

public class Car {
    private String brand;
    private static int countCars = 0;
    public final static String bmw = "BMW is a german company created in 1928";
    public final static String Audi = "Audi is a german company created in 1933";
    public final static String Benz = "Benz is a german company created in 1908";
    public final static String[] BRAND_DESCRIPTIONS = new String[3];

    static {
        BRAND_DESCRIPTIONS[0] = bmw;
        BRAND_DESCRIPTIONS[1] = Audi;
        BRAND_DESCRIPTIONS[2] = Benz;
    }

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrands() {
        System.out.println("Models: Audi, BMW, Benz");
    }
}
