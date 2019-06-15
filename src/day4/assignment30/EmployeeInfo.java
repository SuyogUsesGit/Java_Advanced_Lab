package day4.assignment30;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EmployeeInfo {
    private int employeeId;
    private String name;
    private Calendar dateOfBirth;

    public static void main(String[] args) {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.employeeId = 1;
        employeeInfo.name = "mj";
        employeeInfo.dateOfBirth = Calendar.getInstance();

        EmployeeInfo employeeInfo2 = new EmployeeInfo();
        employeeInfo2.employeeId = 2;
        employeeInfo2.name = "dj";
        employeeInfo2.dateOfBirth = Calendar.getInstance();

        EmployeeInfo employeeInfo3 = new EmployeeInfo();
        employeeInfo3.employeeId = 3;
        employeeInfo3.name = "pj";
        employeeInfo3.dateOfBirth = Calendar.getInstance();

        employeeInfo.dateOfBirth = Calendar.getInstance();
        List<EmployeeInfo> list = new ArrayList<>();
        list.add(employeeInfo);
        list.add(employeeInfo2);
        list.add(employeeInfo3);

        for(EmployeeInfo empInfo: list) {
            System.out.println(empInfo);
        }

    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth.getTime() +
                '}';
    }
}
