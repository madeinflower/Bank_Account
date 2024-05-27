package org.example;

public class Print {

    public static void printAccountInfo(BankAccount account) {
        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalance());
    }
}
