package oop.polimorphism.interfaces.task;

public class Airplane implements Fly {
    @Override
    public void fly() {
        System.out.println("Airplane can fly");
    }
}
