package oop.inheritance.lesson9.dogs;

public class Pudel extends Dog {
    public Pudel() {
        super(28);
    }

    @Override
    public void run() {
        System.out.println("Dog is running slow");
    }

    @Override
    public void breathe() {
        System.out.println("Pudel is breathing");
    }
}
