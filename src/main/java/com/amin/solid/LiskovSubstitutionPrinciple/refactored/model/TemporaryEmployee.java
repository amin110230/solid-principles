package com.amin.solid.LiskovSubstitutionPrinciple.refactored.model;

public class TemporaryEmployee extends Employee implements EmployeeBonusEligible{

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }

    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * .05;
    }
}
