package com.amin.solid.LiskovSubstitutionPrinciple.refactored;

import com.amin.solid.LiskovSubstitutionPrinciple.refactored.model.*;

import java.util.List;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        List<EmployeeBonusEligible> employees = List.of(
                new PermanentEmployee(1, "Sadman"),
                new TemporaryEmployee(2, "Amin"));

        for (EmployeeBonusEligible employee :
                employees) {
            System.out.println(employee.toString() + " Employee Bonus : " + employee.calculateBonus(1000));
        }

        System.out.println("--------------------");
        List<IEmployee> iEmployees = List.of(
                new PermanentEmployee(1, "Sadman"),
                new TemporaryEmployee(2, "Amin"),
                new ContractEmployee(3, "xyz"));
        for (IEmployee iEmployee :
                iEmployees) {
            System.out.println(iEmployee.toString() + " Employee is eligible for Insurance : " + iEmployee.isEligibleForInsurance());
        }
    }
}
