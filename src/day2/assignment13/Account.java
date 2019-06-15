package day2.assignment13;

public class Account {
    private int accountNumber;
    private Customer customer;
    protected double balance;

    public Account() {
    }

    public Account(int accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
}
