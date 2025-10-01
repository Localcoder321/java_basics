package oop.polimorphism.interfaces.functional_interfaces;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("Making cat sound");
    }

    @Override
    public void doSomething() {
        Sounding.super.doSomething();
    }
}
