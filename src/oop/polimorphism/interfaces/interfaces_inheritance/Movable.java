package oop.polimorphism.interfaces.interfaces_inheritance;

public interface Movable {
    default void move() {
        System.out.println("Moving...");
    }
}
