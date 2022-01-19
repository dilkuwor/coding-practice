package com.basics.solid.openclosed;

public class SavingAccountInterestCalculator implements InterestCalculator {

    @Override
    public double calculateInterest(double balance) {
        return balance * 2.5;
    }
}
