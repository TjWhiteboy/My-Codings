// To find the twisted prime numbers in an array
import java.util.*;
public class twistedprimeinarray {
    public static boolean isPrime(int num) {
        if (num <= 1) 
        return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
            return false;
        }
        return true;
    }
    public static int revNum(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Twisted prime numbers in the array are:");
        for (int num : arr) {
            if (isPrime(num)) {
                int reversedNum = revNum(num);
                if (isPrime(reversedNum)) {
                    System.out.println(num);
                }
            }
        }
    }
}  