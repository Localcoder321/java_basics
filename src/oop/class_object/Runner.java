package oop.class_object;

public class Runner {
    static void main() {
        Cat cat = new Cat("Barsik");
        Class<? extends Cat> catClass = cat.getClass();
        System.out.println(catClass.getName());
        System.out.println(cat.toString());
    }
}
