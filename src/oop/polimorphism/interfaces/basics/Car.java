package oop.polimorphism.interfaces.basics;

public class Car implements Movable {
    public void move(){
        System.out.println("Car move");
    }

    @Override
    public void back(){
        System.out.println("Car is going back");
    }
}
