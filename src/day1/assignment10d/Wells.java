package day1.assignment10d;

public class Wells {
    
    public static void main(String[] args) {

        // EmployeeGrade ram = new EmployeeGrade();  // compile time error because no default constructor present
        EmployeeGrade james = new EmployeeGrade(102, "James", 4.2f, 4.1f, 4.4f);
        james.calculateAverageFeedback();
        james.calculateGrade();
        james.displayInfo();
    }

}
