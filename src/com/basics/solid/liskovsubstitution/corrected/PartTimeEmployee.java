package com.basics.solid.liskovsubstitution.corrected;

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return this.getSalary() * 34;
    }

    @Override
    public double getMinimumSalary() {
        return this.getSalary();
    }
}
