package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Bob", "Pam", 12500);
        Valuable account2 = new BankAccount("Bob", "Gary", 1500);
        account1.deposit(100);
        System.out.println("Available balance is: " + account1.getValue());

        //account2.deposit(100); deposit isn't a method available in Valuable
    }
}
