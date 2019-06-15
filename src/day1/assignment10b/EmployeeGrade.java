package day1.assignment10b;

public class EmployeeGrade {
    private int employeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float avgFeedback;
    private char grade;

    EmployeeGrade() {
        this.employeeNo = 101;
        this.employeeName = "Ram";
        this.customer1Feedback = 4.1f;
        this.customer2Feedback = 4.0f;
        this.customer3Feedback = 4.3f;
    }

    EmployeeGrade(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;
    }


    void calculateAverageFeedback() {
        if(this.customer3Feedback == 0.0f) this.avgFeedback = (this.customer1Feedback + this.customer2Feedback)/2;
        else  this.avgFeedback = (this.customer1Feedback + this.customer2Feedback + this.customer3Feedback)/3;

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


