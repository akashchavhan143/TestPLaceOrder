package TestToday9_01_24;

import java.util.Scanner;

public class MainAppTest {
    static Scanner sc=new Scanner(System.in);
    static Service service=new Service();
    public static void main(String[] args) {
        System.out.println("Welcome to MyShopAtYourFingertips");
        System.out.println("Select Option");
        System.out.println("1.Display All Product\n2.Remove Product\n3.Update Product\n4.place Order\n5.Display All Order");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                displayAllProduct();
                break;
            case 2:
                //removeProduct();
                break;
            case 3:
                //updateProduct();
                break;
            case 4:
                //placeOrder();
                break;
            case 5:
                displayAllOrder();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter Valid choice");
                break;
        }
    }



    private static void displayAllProduct() {
        service.displayAllProduct();
    }

    private static void displayAllOrder() {
        service.displayAllOrder();
    }

}
