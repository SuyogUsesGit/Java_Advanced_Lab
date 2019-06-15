package day1.assignment2;

public class EmployeeGrade {

    public static void main(String[] args) {
        int[] employeeIdArray = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4])};
        float[] customer1Feedback = {Float.parseFloat(args[5]), Float.parseFloat(args[6]), Float.parseFloat(args[7]), Float.parseFloat(args[8]), Float.parseFloat(args[9])};
        float[] customer2Feedback = {Float.parseFloat(args[10]), Float.parseFloat(args[11]), Float.parseFloat(args[12]), Float.parseFloat(args[13]), Float.parseFloat(args[14])};
        float[] customer3Feedback = {Float.parseFloat(args[15]), Float.parseFloat(args[16]), Float.parseFloat(args[17]), Float.parseFloat(args[18]), Float.parseFloat(args[19])};

        // Calculate Average
        float[][] feedbacks = {customer1Feedback, customer2Feedback, customer3Feedback};
        float[] avgFeedbackArray = new float[employeeIdArray.length];
        EmployeeGrade employeeGrade = new EmployeeGrade();
        employeeGrade.calculateAverage(feedbacks, avgFeedbackArray, employeeIdArray.length);

        // Calculate Grade
        char[] gradeArray = new char[employeeIdArray.length];
        employeeGrade.calculateGrade(avgFeedbackArray, gradeArray);

        // Print Grade
        employeeGrade.printGrade(employeeIdArray, avgFeedbackArray, gradeArray);
    }

    private void calculateAverage(float[][] feedbacks, float[] avgFeedback, int employeeArrayLength) {
        for(int i=0; i<employeeArrayLength; i++) {
            float total = 0.0f;
            for(int j=0; j<feedbacks.length; j++) {
                total+=feedbacks[j][i] ;
            }
            avgFeedback[i] = total/feedbacks.length;
        }
    }

    private void calculateGrade(float[] avgArray, char[] grades) {
        for(int i=0; i<avgArray.length; i++) {
            if(avgArray[i] >= 4.0) grades[i] = 'A';
            else if(avgArray[i] >= 3.0) grades[i] = 'B';
            else if(avgArray[i] >= 2.0) grades[i] = 'C';
            else if(avgArray[i] >= 1.0) grades[i] = 'D';
            else grades[i] = 'F';
        }
    }

    private void printGrade(int[] employeeIdArray, float[] avgFeedbackArray, char[] gradeArray) {
        for(int i=0; i<employeeIdArray.length; i++) {
            System.out.println("Employee ID: " + employeeIdArray[i] + "\n" +
                    "Average Feedback: " + String.format("%.2f", avgFeedbackArray[i]) + "\n" +
                    "Grade: " + gradeArray[i] + "\n");
        }
    }
}
