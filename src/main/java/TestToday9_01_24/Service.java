package TestToday9_01_24;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Service implements ServiceInterface {
    static Connection connection;

    static {
        String url = "jdbc:mysql://localhost:3306/productOrderdb";
        String user = "root" ;
        String password = "tiger";
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public List<Product> displayAllProduct() {
        List<Product> productList=new ArrayList<>();
        String displayQuery="select*from product_info;";
        try {
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(displayQuery);
            System.out.println("productId\t ProductName \tProductPrice\t ProductQuantity");
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t\t\t"+rs.getString(2) +"\t\t\t"+rs.getDouble(3)+"\t\t\t"+rs.getInt(4));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public boolean removeProduct() {
        return false;
    }

    @Override
    public boolean updateProduct() {
        return false;
    }

    @Override
    public boolean placeOrder() {
        return false;
    }

    @Override
    public List<Order> displayAllOrder() {
        String displayOderQuery="select*from order_info;";
        try {
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(displayOderQuery);
            System.out.println("orderId\t customerName \tProductId\t OrderQuantity\t TotalAmount");
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t\t\t"+rs.getString(2) +"\t\t\t"+rs.getInt(3)+"\t\t\t"+rs.getInt(4)+"\t\t\t"+rs.getDouble(5));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
