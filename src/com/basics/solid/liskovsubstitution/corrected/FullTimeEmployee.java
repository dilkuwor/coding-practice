package com.basics.solid.liskovsubstitution.corrected;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return this.getSalary() * 1.5;
    }

    @Override
    public double getMinimumSalary() {
        return this.getSalary();
    }
}
