package com.amin.solid.LiskovSubstitutionPrinciple.refactored;

import com.amin.solid.LiskovSubstitutionPrinciple.refactored.model.ContractEmployee;
import com.amin.solid.LiskovSubstitutionPrinciple.refactored.model.Employee;
import com.amin.solid.LiskovSubstitutionPrinciple.refactored.model.PermanentEmployee;
import com.amin.solid.LiskovSubstitutionPrinciple.refactored.model.TemporaryEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new PermanentEmployee(1, "Sadman"));
        employees.add(new TemporaryEmployee(2, "Amin"));
        employees.add(new ContractEmployee(3, "xyx"));

        for (Employee employee :
                employees) {
            System.out.println("Employee ID: " + employee.getId() + " Employee Name: " + employee.getName()
                    + " - Employee is eligible for Insurance : " + employee.isEligibleForInsurance());
        }

        System.out.println("--------------------");

        for (Employee employee :
                employees) {
            try {
                System.out.println("Employee ID: " + employee.getId() + " Employee Name: " + employee.getName()
                        + " Employee Bonus : " + employee.calculateBonus(1000));
            } catch (UnsupportedOperationException exception) {
                LOGGER.log(Level.SEVERE, " This employee is not eligible for bonus");
            }
        }
    }
}
