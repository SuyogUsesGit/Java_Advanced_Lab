/*
    This java file is a demo java program which depicts a class with main method inside and
    necessary instance varibales
 */

package day1.assignment4;

public class Customer {
    private String customerId;
    private String customerName;
    private String address;
    private int pinCode;

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerId = "1234";
        customer.customerName = "Jayant";
        customer.address = "PHA-Sawan Apts., Yadavgiri Mysore";
        customer.pinCode = 570020;
        System.out.println("Customer ID: " + customer.customerId + "\n" +
                            "Customer Name: " + customer.customerName + "\n" +
                            "Customer Address: " + customer.address + "\n" +
                            "Customer Pincode: " + customer.pinCode );
    }
}
