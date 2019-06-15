package day3.assignment26;

public class SavingsAccount extends Account {
    private double minimumBalance = 500;
    private int interestRate;

    public SavingsAccount(int accountNumber, Customer customer, double balance, double minimumBalance, int interestRate) {
        super(accountNumber, customer, balance);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException  {
        if(amount > 0 && this.getBalance() - amount >= this.minimumBalance ) {
            this.setBalance(this.getBalance()-amount);
            System.out.println("Withdraw successful!, balance is: " + this.getBalance());
        } else throw new InsufficientBalanceException();
    }

    public double calculateInterest() {
       return  ((double) interestRate/100) * this.getBalance();
    }
}
