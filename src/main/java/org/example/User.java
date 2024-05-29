package org.example;

public class User {
    private String first_name;
    private String last_name;
    private String address;
    private BankAccount bankAccount;

    public User(String first_name, String last_name, String address, BankAccount bankAccount) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

//    public void setBankAccount(BankAccount bankAccount) {
//        this.bankAccount = bankAccount;
//    }
}
