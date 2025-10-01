package oop.polimorphism.interfaces.interfaces_segregation;

public class Airplane implements Flyable, Driveable{
    @Override
    public void drive() {
        System.out.println("Airplane is driving");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
