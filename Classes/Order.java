package Classes;

public class Order {
    private String customerName;
    private String address;
    private double price;
    private int quantity;
    private String email;

    public Order(String customerName, String address, double price, int quantity, String email) {
        this.customerName = customerName;
        this.address = address;
        this.price = price;
        this.quantity = quantity;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}