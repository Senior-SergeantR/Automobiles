package com.company.com.edureka.com.edureka;

public class SuperCar extends Car {

    public void turbo(){
        System.out.println("In turbo method");
    }
    public void changeWheels(){
        numberOfWheels=4;
        behaviourSpecificToCar();

    }
}
