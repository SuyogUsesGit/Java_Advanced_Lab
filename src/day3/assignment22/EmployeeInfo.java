package day3.assignment22;

import java.util.Vector;

public class EmployeeInfo {
    public static void main(String[] args) {
        Vector<Integer> empList = new Vector<>();
        int empNo = 1000;
        for(int i=0; i<5; i++) {
            empList.add(Integer.valueOf(++empNo));
        }

        for (Integer i: empList) System.out.println(i.intValue());
    }
}
