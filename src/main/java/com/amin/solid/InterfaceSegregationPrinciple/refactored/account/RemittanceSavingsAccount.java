package com.amin.solid.InterfaceSegregationPrinciple.refactored.account;

public class RemittanceSavingsAccount extends BaseAccount implements SavingsAccount, InternationalAmountTransferable {
    private String primarySourceCountry;

    public RemittanceSavingsAccount(int accountId, String accountName, double balance, String primarySourceCountry) {
        super(accountId, accountName, balance);
        this.primarySourceCountry = primarySourceCountry;
    }

    @Override
    public void creditLocalAmount(double amountInBDT) {
        this.balance += amountInBDT;
    }

    @Override
    public void creditInternationalAmount(double amountInUSD) {
        double amountInBDT = amountInUSD * 103;
        double incentiveAmount = amountInBDT * 0.02;
        this.balance += amountInBDT + incentiveAmount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
