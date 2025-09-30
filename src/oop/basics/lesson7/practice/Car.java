package oop.basics.lesson7.practice;

public class Car {
    private String model;
    private int maxSpeed = 220;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void accerelationToHundred() {
        double result = 110d / (maxSpeed / 20d);
        System.out.printf("Скорость разгона до 100км/ч : %s\n", result);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }
}
