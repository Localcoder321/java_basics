package oop.polimorphism.interfaces.task;

public class Fish implements Swim {
    @Override
    public void swim() {
        System.out.println("Fish can swim");
    }
}
