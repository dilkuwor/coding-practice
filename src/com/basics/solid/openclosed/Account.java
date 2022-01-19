package com.basics.solid.openclosed;

public class Account {
    Account(double balance){
        this.balance = balance;
    }
    private double balance;
    public double calculateInterest(InterestCalculator interestCalculator){
        return interestCalculator.calculateInterest(this.balance);
    }
}
