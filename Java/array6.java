////Find the minimum element in the array.
import java.util.*;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        /*int min = arr[0];
        for (int i = 1; i < a; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }*/
       Arrays.sort(arr);
       System.out.println(arr[0]);

        //System.out.println(min);
    }
}