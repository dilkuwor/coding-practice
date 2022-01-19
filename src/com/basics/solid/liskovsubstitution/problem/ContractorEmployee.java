package com.basics.solid.liskovsubstitution.problem;

public class ContractorEmployee extends Employee{
    public ContractorEmployee(double salary) {
        super(salary);
    }

    @Override
    public double calculateBonus() throws Exception {
        throw new Exception("Bonus is not allowed");
    }
}
