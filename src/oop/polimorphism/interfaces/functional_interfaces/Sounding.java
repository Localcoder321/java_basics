package oop.polimorphism.interfaces.functional_interfaces;

@FunctionalInterface
public interface Sounding {
    void makeSound();
    default void doSomething() {
        System.out.println("I am going to do");
    }
}
