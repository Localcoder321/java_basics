package oop.polimorphism.interfaces.functional_interfaces;

public class Runner {
    static void main() {
        Sounding cat = new Cat();
        cat.makeSound();

        Sounding bird = () -> System.out.println("Sound of bird");
        bird.makeSound();
    }
}
