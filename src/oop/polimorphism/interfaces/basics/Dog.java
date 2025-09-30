package oop.polimorphism.interfaces.basics;

public class Dog implements Movable {
    public void move(){
        System.out.println("Dog is running");
    }

    @Override
    public void back(){
        System.out.println("Dog is moving back");
    }
}
