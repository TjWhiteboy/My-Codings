import java.util.*;
public class countzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}