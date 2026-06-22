import java.util.*;

public class findiphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] products = new String[n];
        System.out.println("Enter the product names:");
        for (int i = 0; i < n; i++) {
            products[i] = sc.nextLine();
        }
        int iphoneCount = 0;
        for (int i = 0; i < n; i++) {
            if (products[i].toLowerCase().matches("iphone\\s+\\d.*")) {
                iphoneCount++;
            }
        }
        System.out.println("Number of iPhones: " + iphoneCount);
    }
}