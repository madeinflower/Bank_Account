package org.example;

// Main.java
public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Alice", 5000.0);
        BankAccount account2 = new BankAccount("Bob", 3000.0);

        account1.deposit(1500.0);
        account1.withdraw(2000.0);

        account2.deposit(500.0);
        account2.withdraw(3500.0);

        Print.printAccountInfo(account1);
        Print.printAccountInfo(account2);
    }
}
