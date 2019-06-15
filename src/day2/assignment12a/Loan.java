package day2.assignment12a;

public class Loan {
    private int loanNo;
    private int acoountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;

    public Loan() {

    }

    public Loan(int acoountNo) {

    }

    public Loan(int acoountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
        this.acoountNo = acoountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
    }

//    public float calculateInstallments() {
//
//    }

    public int getCustomerNo() {
        return customerNo;
    }

    public int getAcoountNo() {
        return acoountNo;
    }

    public void setAcoountNo(int acoountNo) {
        this.acoountNo = acoountNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
}
