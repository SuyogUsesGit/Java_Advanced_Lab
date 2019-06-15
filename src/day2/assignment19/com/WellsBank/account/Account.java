package day2.assignment19.com.WellsBank.account;

import day2.assignment19.com.WellsBank.customer.Customer;

public abstract class Account {
    private int accountNumber;
    private Customer customer;
    private double balance;

    public Account(int accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount>0) {
            this.balance += amount;
            System.out.println("Deposit Successful! Updated balance is: " + this.balance);
        } else System.out.println("Deposit Unsuccessful");
    }

    public abstract void withdraw(double amount);

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
