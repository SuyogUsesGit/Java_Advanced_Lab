package day2.assignment17;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String pinCode;

    public Customer(int id, String name, String address, String pinCode) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.pinCode = pinCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
