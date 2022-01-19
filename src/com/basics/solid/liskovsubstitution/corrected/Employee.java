package com.basics.solid.liskovsubstitution.corrected;

public abstract class Employee implements IEmployee, IEmployeeBonus{
    public Employee(double salary){
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

//    public abstract double calculateBonus();
}
