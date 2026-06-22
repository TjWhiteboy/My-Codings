import java.util.Scanner;

public class store {

    int appleCount;
    int applePrice;

    void shop() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter apple count: ");
        appleCount = sc.nextInt();
        
        System.out.print("Enter apple price: ");
        applePrice = sc.nextInt();
    }

    void cashier() {
        int totalPrice = appleCount * applePrice;
        System.out.println("Total Price = " + totalPrice);
    }

    public static void main(String[] args) {
        store product = new store();

        product.shop();
        product.cashier();
    }
}