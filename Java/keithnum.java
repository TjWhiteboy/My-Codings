// AI Keith number
import java.util.Scanner;

public class keithnum{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();

        int temp = n;
        String s = Integer.toString(n);
        int d = s.length();

        int[] arr = new int[100]; 
        for (int i = d - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        int i = d;
        int sum = 0;

        while (sum < n) {
            sum = 0;

            for (int j = 1; j <= d; j++) {
                sum += arr[i - j];
            }

            arr[i] = sum;
            i++;
        }

        if (sum == n)
            System.out.println("Keith Number");
        else
            System.out.println("Not a Keith Number");

        sc.close();
    }
}