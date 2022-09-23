package com.amin.solid.LiskovSubstitutionPrinciple.refactored.model;

public class PermanentEmployee extends Employee {
    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(float salary) {
        return salary * .1;
    }

    @Override
    public boolean isEligibleForInsurance() {
        return true;
    }
}
