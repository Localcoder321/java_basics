package oop.polimorphism.interfaces.dependency_inversion;

public class DogZoo {
    private Dog dog1;
    private Dog dog2;

    public DogZoo(Poodle poodle, Shepherd shepherd) {
        System.out.println("Constructor for concrete dogs");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }

    public DogZoo(Dog dog1, Dog dog2) {
        System.out.println("Constructor for all dogs");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }
}
