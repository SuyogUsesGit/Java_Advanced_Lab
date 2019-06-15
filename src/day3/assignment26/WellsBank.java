package day3.assignment26;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer(1, "John", "England", "12983");
//        SavingsAccount johnSA = new SavingsAccount(101, john, 1000, 500, 12);
//
//        transaction(johnSA, 1000);
//        johnSA.withdraw(1600);
//        System.out.println(johnSA.getBalance());

        Customer jenny = new Customer(201, "Jenny", "England", "912864");
        OverdraftAccount od = new OverdraftAccount(201, jenny, 500, 2000);
        transaction(od, 500);
        System.out.println(od.getBalance());
//        od.withdraw(1000);
        System.out.println(od.getOverdraftAmount());
        try {
            od.withdraw(4000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);;
        }
//        od.withdraw(3000);
    }

    public static void transaction(Account account, double amount) {
        account.deposit(amount);
        try {
            account.withdraw(100);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
    }
}
