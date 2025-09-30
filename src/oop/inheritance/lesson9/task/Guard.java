package oop.inheritance.lesson9.task;

public final class Guard extends Human {
    public Guard(boolean gender) {
        super(gender);
    }

    @Override
    public void getSalary() {
        System.out.println("Guard salary is 15 000");
    }
}
