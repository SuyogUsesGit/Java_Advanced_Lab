package day1.assignment11;

public class Wells {
    
    public static void main(String[] args) {

        EmployeeGrade[] employeeGrades = new EmployeeGrade[5];
        int empNo = 0;
        int empName = 0;
        for(int i=0; i<employeeGrades.length; i++) {
            employeeGrades[i] = new EmployeeGrade(++empNo, ++empName+"xyz", 5.0f, 5.0f, 5.0f);
            employeeGrades[i].calculateAverageFeedback();
            employeeGrades[i].calculateGrade();
            employeeGrades[i].displayInfo();
        }
    }

}
