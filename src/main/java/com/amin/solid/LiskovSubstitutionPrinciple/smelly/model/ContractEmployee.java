package com.amin.solid.LiskovSubstitutionPrinciple.smelly.model;

public class ContractEmployee extends Employee{
    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(float salary) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }
}
