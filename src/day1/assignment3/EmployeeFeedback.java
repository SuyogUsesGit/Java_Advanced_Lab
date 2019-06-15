/*
    This class Stores and displays the feedback of their employees from their customer
    Date: 06/14/19
 */

package day1.assignment3;

public class EmployeeFeedback {
    public static void main(String[] args) {
        int[][] empInfo = {
                            {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])},
                            {Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6])}
                            };

        for(int outerLoop = 0; outerLoop < empInfo.length; outerLoop++) {
            for(int innerLoop = 0; innerLoop < empInfo[outerLoop].length; innerLoop++) {
                System.out.println(empInfo[outerLoop][innerLoop]);
            }
        }
    }
}
