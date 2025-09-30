package oop.inheritance.lesson9.task;

public final class Accountant extends OfficeWorker{
    public Accountant(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Accountant salary is 50 000");
    }

    @Override
    public void drinkCoffee() {
        super.drinkCoffee();
    }
}
