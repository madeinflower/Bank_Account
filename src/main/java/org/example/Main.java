package org.example;

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

        BankAccount userBankAccount = new BankAccount("John's Account", 1000.0);
        User user1 = new User("John", "Doe", "123 Main St", userBankAccount);
        user1.getBankAccount().deposit(200.0);
        user1.getBankAccount().withdraw(150.0);

        System.out.println("User Info: " + user1.getFirst_name() + " " + user1.getLast_name() + ", Address: " + user1.getAddress());
        Print.printAccountInfo(user1.getBankAccount());
    }
}
