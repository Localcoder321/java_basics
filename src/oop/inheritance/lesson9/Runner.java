package oop.inheritance.lesson9;

import oop.inheritance.lesson9.dogs.Dog;
import oop.inheritance.lesson9.dogs.Pudel;
import oop.inheritance.lesson9.defend_dogs.Shepherd;

public class Runner {
    static void main() {
        Pudel pudel = new Pudel();
        pudel.bark();
        pudel.run();
        pudel.breathe();
        System.out.println(pudel.teethCount);

        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breathe();
        System.out.println(shepherd.teethCount);
        shepherd.beAngry();

        System.out.println(Dog.LATIN_NAME);
    }
}
