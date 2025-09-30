package oop.basics.lesson8;

import java.util.Arrays;

public class Runner {
    static void main() {
        Car audi = new Car("Audi");
        System.out.println(audi.getCountCars());
        Car benz = new Car("Benz");
        System.out.println(benz.getCountCars());

        Car.printBrands();

        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));
    }
}
