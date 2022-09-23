package com.amin.solid.InterfaceSegregationPrinciple.refactored;

import com.amin.solid.InterfaceSegregationPrinciple.refactored.account.RemittanceSavingsAccount;
import com.amin.solid.InterfaceSegregationPrinciple.refactored.account.StudentAccount;

public class Main {
    public static void main(String[] args) {
        RemittanceSavingsAccount remittanceSavingsAccount = new RemittanceSavingsAccount(
                1,
                "Rahim",
                100,
                "Italy"
        );

        remittanceSavingsAccount.creditLocalAmount(100);
        remittanceSavingsAccount.creditInternationalAmount(10);

        System.out.println(remittanceSavingsAccount.getBalance());

        StudentAccount studentAccount = new StudentAccount(
                1,
                "Karim",
                100,
                "BUET"
        );

        studentAccount.creditLocalAmount(100);

        System.out.println(studentAccount.getBalance());
    }
}
