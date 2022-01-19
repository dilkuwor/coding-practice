package com.basics.solid.liskovsubstitution.problem;

public abstract class Employee {
    public Employee(double salary){
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double salary;
    public abstract double calculateBonus() throws Exception;
}
