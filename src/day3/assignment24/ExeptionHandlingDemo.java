package day3.assignment24;

public class ExeptionHandlingDemo {
    public static void main(String[] args) {
        String name = null;
        int total = 100, count = 0;
        try {
            int avg = total / count;
            System.out.println(avg);
            System.out.println(name.length());
            System.out.println("End of try block");
        } catch (ArithmeticException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
            e.printStackTrace();
            // name.length();   // Does not catch exception if error exists in catch block. Finally block executes no matter if try or catch block throws exception.
        } catch (NullPointerException e) {
            System.out.println("Object is null");
        } finally {
            System.out.println("In the finally block");
        }
        System.out.println("Continuing execution...");
    }
}
