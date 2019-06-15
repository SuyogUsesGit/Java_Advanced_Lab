package day2.assignment19.com.WellsBank.account;


import day2.assignment19.com.WellsBank.customer.Customer;

public class OverdraftAccount extends Account {
    private double overdraftAmount;


    public OverdraftAccount(int accountNumber, Customer customer, double balance, double overdraftAmount) {
        super(accountNumber, customer, balance);
        this.overdraftAmount = overdraftAmount;
    }


    public double getOverdraftAmount() {
        return this.overdraftAmount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Withdraw Successful! Balance is: " + this.getBalance());
        } else if(this.overdraftAmount + this.getBalance() >= amount) {
            amount -= this.getBalance();
            this.setBalance(0);
            this.overdraftAmount -= amount;
            System.out.println("Withdraw Successful! Balance is: " + this.getBalance() + " Overdraft Balance: " + this.getOverdraftAmount());
        } else System.out.println("Withdraw unsuccessful!");
    }
}
