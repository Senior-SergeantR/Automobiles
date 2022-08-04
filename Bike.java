package com.company.com.edureka.com.edureka;

public class Bike extends Vehicle {

    Integer numberOfWheels;

    @Override
    public void move() {
        System.out.println(" move bike in class ");

    }
    public void printNumberOfWheels(){
        numberOfWheels=2;

        System.out.println(numberOfWheels);
        System.out.println(super.numberOfWheels);
        
    }

}
