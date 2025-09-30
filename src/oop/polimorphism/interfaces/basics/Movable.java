package oop.polimorphism.interfaces.basics;

public interface Movable {
    void move();

    default void back() {
        System.out.println("Going back");
    }
}
