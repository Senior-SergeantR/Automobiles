package com.company.com.edureka.com.edureka;

public class Employee extends Manager {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary=1000;
        System.out.println("Salary of employee is " +emp.salary);

        Manager manager = new Manager();
        manager.salary=10000;
        System.out.println("salary of manager is " +manager.salary);
    }
}
