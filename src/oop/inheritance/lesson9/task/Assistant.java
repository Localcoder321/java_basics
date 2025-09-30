package oop.inheritance.lesson9.task;

public final class Assistant extends OfficeWorker {
    public Assistant(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Assistant salary is 30 000");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("Drink coffee");
    }
}
