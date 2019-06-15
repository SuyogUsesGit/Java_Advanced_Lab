package day2.assignment14;

public class WellsBank {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Mark", "England", "28194");

        SavingsAccount savingAccount = new SavingsAccount(1, customer, 1000, 500, 12);

        OverdraftAccount overdraftAccount = new OverdraftAccount(2, customer, 1000, 2000);

        savingAccount.deposit(2000);
        savingAccount.withdraw(2500);
        savingAccount.withdraw(1);
        savingAccount.deposit(1);
        System.out.println(savingAccount.calculateInterest());

        overdraftAccount.withdraw(1000);
        System.out.println(overdraftAccount.getOverdraftAmount());
        overdraftAccount.withdraw(1999);
    }
}
