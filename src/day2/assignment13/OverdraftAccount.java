package day2.assignment13;

public class OverdraftAccount extends Account {
    private double overdraftAmount;

    public OverdraftAccount() {

    }

    public OverdraftAccount(int accountNumber, Customer customer, double balance, double overdraftAmount) {
        super(accountNumber, customer, balance);
        this.overdraftAmount = overdraftAmount;
    }


    public double getOverdraftAmount() {
        return this.overdraftAmount;
    }
}
