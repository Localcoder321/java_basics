package oop.anonimus_classes;

public class Runner {
    static void main() {
        Alive dog = new Alive() {
            @Override
            public void eat() {
                System.out.println("Dog eat");
            }

            @Override
            public void breath() {
                System.out.println("Dog breath");
            }
        };

        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Animal eat");
            }
        };
        animal.eat();
        System.out.println(animal.legsCount); ;
    }
}
