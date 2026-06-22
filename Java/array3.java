//Find and Print the middle value
import java.util.*;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int middleIndex = size / 2;
        System.out.println("Middle value: " + arr[middleIndex]);
    }
}
    

