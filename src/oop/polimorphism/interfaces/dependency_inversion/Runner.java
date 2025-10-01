package oop.polimorphism.interfaces.dependency_inversion;

public class Runner {
    static void main() {
        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();
        DogZoo zoo = new DogZoo(poodle, shepherd);
        DogZoo zoo1 = new DogZoo(shepherd, poodle);
    }
}
