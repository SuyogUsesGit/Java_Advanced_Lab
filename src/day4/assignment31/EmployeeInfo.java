package day4.assignment31;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {
    private String employeeName;
    private int employeeId;

    public static void main(String[] args) {
        EmployeeInfo empInfo = new EmployeeInfo();

        List list = new ArrayList();
        list.add("abc");
        list.add(12);
        list.add(empInfo);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        List<Integer> intList = new ArrayList<>();
        intList.add(1001);
        intList.add(1002);
        // intList.add("ads"); // forces type checking
    }

}
