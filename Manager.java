package com.company.com.edureka.com.edureka;

import com.company.Main;

public class Manager {

    long salary;

    public void display(Integer dummyintValueToBePrinted){
        System.out.println("printing integer value " +dummyintValueToBePrinted);
    }
    public void display(String dummyStringValueToBeprinted){
        System.out.println("Printing String value " +dummyStringValueToBeprinted);


    }

    public static void main(String[] args) {
        Manager seniorManagerGrade2= new Manager();
        seniorManagerGrade2.display(100);
        seniorManagerGrade2.display("seniorManagerGrade2" );
    }

}
