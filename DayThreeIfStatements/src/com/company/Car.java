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
    int maxNumberOfPeopleInCar = 5;

    public Car() {

    }

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
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar) {

            numberOfPeopleInCar++;

            System.out.println("Someone got in.");

        } else {

            System.out.println("The car is full.");

        }

    }

    public void getOut() {

        if(numberOfPeopleInCar > 0) {

            numberOfPeopleInCar--;

        } else {

            System.out.println("No one is in the car.");

        }

    }

    public double howManyKmTillEmpty() {

        return currentFuel * avgFuelConsumption;

    }

    public double maxKmPerFillUp() {

        return maxFuel * avgFuelConsumption;

    }

    public void turnTheCarOn() {

        if(!isTheCarOn) {

            isTheCarOn = true;

        } else {

            System.out.println("The car is already on.");

        }

    }

    public static void main(String[] args) {

        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();

        /*System.out.println("Christmas Car: ");
        Car christmasPresent = new Car(340, 960, false);
        christmasPresent.printVariables();*/

    }
}
