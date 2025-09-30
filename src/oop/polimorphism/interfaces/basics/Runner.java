package oop.polimorphism.interfaces.basics;

public class Runner {
    static void main() {
        Dog dog = new Dog();
        Car car = new Car();

        Movable[] movables = new Movable[2];
        movables[0] = dog;
        movables[1] = car;
        for (Movable movable : movables) {
            movable.move();
            movable.back();
        }
    }
}
