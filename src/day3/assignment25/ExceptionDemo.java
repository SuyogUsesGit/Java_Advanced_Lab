package day3.assignment25;

public class ExceptionDemo {
    static {
        System.out.println("In static block of ExceptionDemo");
    }

    public static void main(String[] args) {
        // Class.forName("com.exception.ExceptionDemo"); // throws checked: exception unhandled ClassNotFoundException

        try {
            Class.forName("com.exception.ExceptionHandlingDemo");   // give this path to run: day3.assignment25.ExceptionDemo
        } catch (ClassNotFoundException e) {
            System.out.println("Exception: " + e);
        }
    }
}
