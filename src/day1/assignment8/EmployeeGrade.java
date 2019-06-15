package day1.assignment8;

public class EmployeeGrade {
    private int employeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float avgFeedback;
    private char grade;

    void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;
    }

    void calculateAverageFeedback() {
        this.avgFeedback = (this.customer1Feedback + this.customer2Feedback + this.customer3Feedback)/3;
    }

    void calculateGrade() {
        if(this.avgFeedback >= 4.0) this.grade = 'A';
        else if(this.avgFeedback >= 3.0) this.grade = 'B';
        else if(this.avgFeedback >= 2.0) this.grade = 'C';
        else if(this.avgFeedback >= 1.0) this.grade = 'D';
        else this.grade = 'F';
    }

    void displayInfo() {
        System.out.println("Employee Number: " + this.employeeNo + "\n" +
                            "Employee Name: " + this.employeeName + "\n" +
                            "Average Feedback: " + this.avgFeedback + "\n" +
                            "Grade: " + this.grade);
    }
}
