package oop.basics.lesson7;

import java.util.Arrays;

public class Cat {
    //public
    public String color;
    //default
    double weight;
    //private
    String ownerName;
    public Cat(String color, double weight, String ownerName) {
        this.color = color;
        this.weight = weight;
        this.ownerName = ownerName;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Cat destroying %s's sofa\n", sofaOwner);
    }

    public String hunt(boolean isDay) {
        return  isDay?"Rat":"Owl";
    }

    public String hunt(boolean isDay, boolean success) {
        if(success) {
            return isDay?"Rat":"Owl";
        }
        return "Nothing";
    }

    public void hunt(String timeOfDay) {
        if(timeOfDay.equals("Morning")) {
            System.out.println("It is morning");
        } else {
            System.out.println("Don't know");
        }
    }

    public void feed(String giver, String ...product) {
        System.out.printf("%s gave to cat products to eat: %s\n", giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
