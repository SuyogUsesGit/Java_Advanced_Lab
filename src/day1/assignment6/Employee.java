package day1.assignment6;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public abstract class Employee {
    private String name;
    private String emailId;
    String accountType;
    String dateOfBirth;
    char gender;
    String maritalStatus;
    boolean multiCityChequeBook;
    boolean discountOnShoppingUsingDebitCard;
    boolean atmCard;
    int balance;

     Employee(String firstName, String middleName, String lastName, String emailId, String dateOfBirth, char gender, String maritalStatus) {
        this.name = firstName + middleName+ lastName;
        this.emailId = emailId;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit Successful!" + "\n" +
                    "Your Balance is: " + this.balance + "$");
        } else {
            System.out.println("Deposit Unsuccessful");
        }
    }

    abstract void withdraw(int amount);

    public static void main(String[] args) {
        Employee emp1 = new SalaryAccount("Paul", "J", "Anderson", "Paul@Wellsfargo.com",
                LocalDate.of(1985, Month.JANUARY, 3).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), 'M',
                "Single");

        Employee emp2 = new NonSalaryAccount("John", "", "Jacob", "John@Wellsfargo.com",
                LocalDate.of(1985, Month.MARCH, 6).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), 'M',
                "Married");

        emp1.deposit(15000);
        emp1.withdraw(10000);

        emp2.deposit(200);
        emp2.withdraw(200);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", multiCityChequeBook=" + multiCityChequeBook +
                ", discountOnShoppingUsingDebitCard=" + discountOnShoppingUsingDebitCard +
                ", atmCard=" + atmCard +
                ", balance=" + balance +
                '}';
    }
}

class SalaryAccount extends Employee {
     SalaryAccount(String firstName, String middleName, String lastName, String emailId, String dateOfBirth, char gender, String maritalStatus) {
         super(firstName, middleName, lastName, emailId, dateOfBirth, gender, maritalStatus);
         this.accountType = "Salary";
        this.atmCard = true;
    }

    @Override
    void withdraw(int amount) {
        if(amount > 0 && this.balance>=amount) {
            this.balance -= amount;
            System.out.println("Success! You withdrew: " + amount + "$" + "\n " +
                    "Your current balance is: " + this.balance +"$");
        } else System.out.println("Withdraw Unsuccessful");
    }
}

class NonSalaryAccount extends Employee {
     NonSalaryAccount(String firstName, String middleName, String lastName, String emailId, String dateOfBirth, char gender, String maritalStatus) {
         super(firstName, middleName, lastName, emailId, dateOfBirth, gender, maritalStatus);
         this.accountType = "Non-Salary";
         this.discountOnShoppingUsingDebitCard = true;
        this.atmCard = true;
        this.balance = 10000;
    }

    @Override
    void withdraw(int amount) {
        if(amount > 0 && this.balance - amount >= 10000) {
            this.balance -= amount;
            System.out.println("Success! You withdrew: " + amount + "$" + "\n " +
                    "Your current balance is: " + this.balance + "$");
        } else System.out.println("Withdraw Unsuccessful");
    }

}



