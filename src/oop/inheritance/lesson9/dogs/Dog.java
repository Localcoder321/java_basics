package oop.inheritance.lesson9.dogs;

import oop.inheritance.lesson9.Alive;

public abstract class Dog extends Alive {
    protected final int legsCount = 4;
    public int teethCount;

    public Dog(int teethCount) {
        this.teethCount = teethCount;
    }

    //Constant
    public static final String LATIN_NAME = "Latinos Name";

    public void bark() {
        System.out.println("The dog is barking");
    }

    public abstract void run();

    public void beAngry() {
        System.out.println("Dog is angry");
    }

    public final void eat() {
        System.out.println("Dog is eating");
    }
}
