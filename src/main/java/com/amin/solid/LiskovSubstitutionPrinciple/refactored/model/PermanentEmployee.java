package com.amin.solid.LiskovSubstitutionPrinciple.refactored.model;

public class PermanentEmployee extends Employee implements EmployeeBonusEligible{
    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean isEligibleForInsurance() {
        return true;
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * .1;
    }
}
