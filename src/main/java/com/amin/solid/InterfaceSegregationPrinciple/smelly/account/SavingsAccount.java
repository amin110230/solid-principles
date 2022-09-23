package com.amin.solid.InterfaceSegregationPrinciple.smelly.account;

public interface SavingsAccount {
    public double getBalance();

    public void creditLocalAmount(double amountInBDT);

    public void creditInternationalAmount(double amountInUSD);
}
