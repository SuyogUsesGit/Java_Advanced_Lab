package day1.assignment8;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade employeeGrade = new EmployeeGrade();

        employeeGrade.initializeEmployee(1, "Elvis", 3,4,5);
        employeeGrade.calculateAverageFeedback();
        employeeGrade.calculateGrade();
        employeeGrade.displayInfo();
    }
}
