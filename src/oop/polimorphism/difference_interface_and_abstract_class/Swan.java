package oop.polimorphism.difference_interface_and_abstract_class;

public class Swan extends Bird implements Swimable {
    @Override
    public void swim() {
        System.out.println("Swan swim");
    }
}
