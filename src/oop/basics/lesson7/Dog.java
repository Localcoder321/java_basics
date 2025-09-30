package oop.basics.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Blaster";
    private int weight = 40;
    private String owner = "Jason";

    {
        System.out.println("Dog has been created");
    }

    public Dog() {};

    public Dog(String name, int weight, String owner) {
        if(weight < 1) {
            this.weight = 5;
        } else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void feed(String giver, String ...product) {
        System.out.printf("%s gave to dog products to eat: %s\n", giver, Arrays.toString(product));
    }

    public void setWeight(int newWeight) {
        if(newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }

    public String getOwner() {
        return "Mr. " + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
