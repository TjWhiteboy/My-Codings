//Check Whether Array is Sorted
import java.util.*;
public class array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for(int i = 0; i < a - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        for(int i=0;i<a;i++){
             System.out.print(arr[i]+" ");

        }
        if(sorted) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}