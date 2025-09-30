package oop.inheritance.lesson9.defend_dogs;

import oop.inheritance.lesson9.dogs.Dog;

public final class Shepherd extends Dog {
    public Shepherd() {
        super(27);
    }
    @Override
    public void run() {
        System.out.println("Dog is running fast");
    }

    @Override
    public void breathe() {
        System.out.println("Shepherd is breathing");
    }

    @Override
    public void beAngry() {
        System.out.println("Shepherd have " + super.legsCount + " legs");
        System.out.println("Shepherd see the person");
        super.beAngry();
        System.out.println("Shepherd is not angry now");
    }
}
