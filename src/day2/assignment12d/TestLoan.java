package day2.assignment12d;

public class TestLoan {
    public static void main(String[] args) {

        Loan.getLoanInstance();
        Loan.getLoanInstance();
        System.out.println("Total number of objects: " + Loan.getNumberOfObjects());

    }
}
