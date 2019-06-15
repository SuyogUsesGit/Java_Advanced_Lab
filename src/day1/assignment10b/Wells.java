package day1.assignment10b;

public class Wells {
    
    public static void main(String[] args) {

        EmployeeGrade ram = new EmployeeGrade();
        EmployeeGrade james = new EmployeeGrade(102, "James", 4.2f, 4.1f, 4.4f);
        ram.calculateAverageFeedback();
        ram.calculateGrade();
        ram.displayInfo();
        james.calculateAverageFeedback();
        james.calculateGrade();
        james.displayInfo();
    }

}
