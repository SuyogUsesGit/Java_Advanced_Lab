package day3.assignment23;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        String name;
//        System.out.println(name.length());   // Compile time error name is not initialized
//        name = null;
//        try {
//            System.out.println(name.length());
//        } catch (NullPointerException e) {
//            System.out.println("Object is null");
//        }
//        System.out.println("Continuing execution...");
//        name = "John";
//        System.out.println(name.length());

//        name = null;
//        int total = 100, count = 0;
//        try {
//            int avg = total/count;
//            System.out.println(avg);
//            System.out.println(name.length());
//            System.out.println("End of try block");
//        } catch (NullPointerException e) {
//            System.out.println("Object is null");
//        }
//        System.out.println("Continuing execution...");

        name = null;
        int total = 100, count = 0;
        try {
            int avg = total / count;
            System.out.println(avg);
            System.out.println(name.length());
            System.out.println("End of try block");
        } catch (ArithmeticException e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
            e.printStackTrace();
            // name.length();   // Does not catch exception if error exists in catch block
        } catch (NullPointerException e) {
            System.out.println("Object is null");
        }
        System.out.println("Continuing execution...");
    }
}
