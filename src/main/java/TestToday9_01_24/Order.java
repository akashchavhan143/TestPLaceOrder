package TestToday9_01_24;

public class Order {
    private int orderId;
    private String customerName;
    private int productId;
    private int orderQuantity;
    private double totalAmount;

    public Order() {
    }

    public Order(int orderId, String customerName, int productId, int orderQuantity, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productId = productId;
        this.orderQuantity = orderQuantity;
        this.totalAmount = totalAmount;
    }

    public Order(String customerName, int orderQuantity, double totalAmount) {
        this.customerName = customerName;
        this.orderQuantity = orderQuantity;
        this.totalAmount = totalAmount;
    }

    public Order(String customerName, int orderQuantity) {
        this.customerName = customerName;
        this.orderQuantity = orderQuantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getProductId() {
        return productId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
}
