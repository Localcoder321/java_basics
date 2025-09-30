package oop.polimorphism.interfaces.task;

public class Duck implements Swim, Fly {
    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }
}
