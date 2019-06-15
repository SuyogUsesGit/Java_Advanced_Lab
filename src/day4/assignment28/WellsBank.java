package day4.assignment28;

public class WellsBank {
    public static void main(String[] args) {
        Customer customer = new Customer();
        // customer.customerId; // private members can only be accessed by getter and setter methods
        customer.setCustomerName("John");
        System.out.println(customer.getCustomerName());
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int pincode;

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}