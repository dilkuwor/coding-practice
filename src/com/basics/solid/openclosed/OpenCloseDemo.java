package com.basics.solid.openclosed;

public class OpenCloseDemo {
    public static void main(String[] args){
        Account account = new Account(343);
        SavingAccountInterestCalculator saving = new SavingAccountInterestCalculator();
        InterestCalculator checking = new CheckingAccountInterestCalculator();
        double interest = account.calculateInterest(saving);
        System.out.println("Saving account interest"+interest);
        double checkingInterest = account.calculateInterest(checking);
        System.out.println("Checknig account interest"+checkingInterest);

    }
}
