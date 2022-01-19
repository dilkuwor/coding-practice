package com.basics.solid.liskovsubstitution.problem;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() {
        return this.salary * 50;
    }
}
