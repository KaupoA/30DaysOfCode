package com.company;

public class Car {

    int maxSpeed = 250;
    int minSpeed = 0;
    double weight = 1890;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lamp";

    public void printVariables() {

        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);

    }

    public void upgradeMinSpeed() {

        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;

    }

    public static void main(String[] args) {

        Car familyCar = new Car();
        System.out.println("Family's Car:");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();

    }
}
