package com.company.com.edureka.com.edureka;

public class AutomobileManagement {

    public static void main(String[] args) {
        Car mercedes = new Car();
        Vehicle vehicle1=mercedes;
        Vehicle vehicle2= new Vehicle();

        vehicle2.move();
        vehicle1.move();

        Car BMW = new Car();
        mercedes.numberOfWheels=4;

        Bike r1 = new Bike();
        Bike ducati= new Bike();
        r1.numberOfWheels=2;
        ducati.printNumberOfWheels();

        BMW.move();

        System.out.println();
    }
}
