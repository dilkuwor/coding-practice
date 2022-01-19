package com.basics.solid.openclosed;

public class CheckingAccountInterestCalculator implements InterestCalculator {
    @Override
    public double calculateInterest(double balance) {
        return balance * 5.6;
    }
}
