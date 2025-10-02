package oop.class_object;

public class Cat extends Object{
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
