package com.company;

public class Car {

    int maxSpeed = 250;
    int minSpeed = 0;

    double weight = 1890;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lamp";

    double maxFuel = 60;
    double currentFuel = 30;
    double avgFuelConsumption = 7.2;

    int numberOfPeopleInCar = 1;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {

        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;

    }

    public void printVariables() {

        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);

    }

    public void upgradeMinSpeed() {

        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;

    }

    public void getIn() {

        // numberOfPeopleInCar = numberOfPeopleInCar +1;
        numberOfPeopleInCar++;

    }

    public void getOut() {

        numberOfPeopleInCar--;

    }

    public double howManyKmTillEmpty() {

        return currentFuel * avgFuelConsumption;

    }

    public double maxKmPerFillUp() {

        return maxFuel * avgFuelConsumption;

    }

    public static void main(String[] args) {

        Car birthdayPresent = new Car(320, 1200, true);
        System.out.println("Birthday Car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Kilometers left: " + birthdayPresent.howManyKmTillEmpty());
        System.out.println("Max kilometers: " + birthdayPresent.maxKmPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday Car v3");
        birthdayPresent.printVariables();

        /*System.out.println("Christmas Car: ");
        Car christmasPresent = new Car(340, 960, false);
        christmasPresent.printVariables();*/

    }
}
