import java.util.*;

public class array21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean palindrome = true;
    
        for(int i = 0; i < size / 2; i++) {
            if(arr[i] != arr[size - 1 - i]) {
                palindrome = false;
                break;
            }
        }

        if(palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}