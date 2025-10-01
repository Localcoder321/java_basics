package oop.polimorphism.interfaces.interfaces_inheritance;

public interface Eatable {
    default void eat() {
        System.out.println("Eating...");
    };
}
