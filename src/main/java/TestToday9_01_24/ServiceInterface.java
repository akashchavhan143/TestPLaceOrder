package TestToday9_01_24;

import java.util.List;

public interface ServiceInterface {
    List<Product> displayAllProduct();
    boolean removeProduct();
    boolean updateProduct();
    boolean placeOrder();
    List<Order> displayAllOrder();
}
