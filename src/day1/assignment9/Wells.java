package day1.assignment9;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade employeeGrade1 = new EmployeeGrade();
        EmployeeGrade employeeGrade2 = new EmployeeGrade();


        employeeGrade1.initializeEmployee(1, "Elvis", 4.1f, 3.9f, 4.2f);
        employeeGrade1.calculateAverageFeedback();
        employeeGrade1.calculateGrade();
        employeeGrade1.displayInfo();

        employeeGrade2.initializeEmployee(2, "Martha", 4.2f, 4.4f);
        employeeGrade2.calculateAverageFeedback();
        employeeGrade2.calculateGrade();
        employeeGrade2.displayInfo();


    }
}
