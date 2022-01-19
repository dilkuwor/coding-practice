package com.basics.solid.openclosed;

public class AccountV {
    private String accountNumber;
    private double balance;
    public double calculateInterest(){
        if(accountNumber.startsWith("000")){
            return balance*0.05;
        }
        else if (accountNumber.startsWith("001")){
            return balance*1;
        }
        else
            return 0;
    }
}
