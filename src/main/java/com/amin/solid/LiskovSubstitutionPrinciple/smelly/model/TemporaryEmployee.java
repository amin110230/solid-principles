package com.amin.solid.LiskovSubstitutionPrinciple.smelly.model;

public class TemporaryEmployee extends Employee{
    @Override
    public double calculateBonus(float salary) {
        return salary * .05;
    }

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }

    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }
}
