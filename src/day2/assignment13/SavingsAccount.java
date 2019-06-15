package day2.assignment13;

public class SavingsAccount extends Account {
    private double minimumBalance;
    private int interestRate;

    public SavingsAccount() {

    }

    public SavingsAccount(int accountNumber, Customer customer, double balance, double minimumBalance, int interestRate) {
        super(accountNumber, customer, balance);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    public void calculateInterest() {

    }
}
