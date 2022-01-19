package com.basics.solid.liskovsubstitution.problem;

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() throws Exception {
        return this.salary * 20;
    }
}
