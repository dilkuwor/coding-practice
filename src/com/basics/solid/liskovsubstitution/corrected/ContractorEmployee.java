package com.basics.solid.liskovsubstitution.corrected;

public class ContractorEmployee implements IEmployee{
    private double salary;
    ContractorEmployee(double salary){
        this.salary = salary;
    }
    @Override
    public double getMinimumSalary() {
        return this.salary;
    }
}
