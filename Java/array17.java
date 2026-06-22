//Merge Two Arrays
import java.util.*;
public class array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        int[] merged = new int[a + b];
        for(int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }
        int k = 0;
        for(int i = 0; i < arr1.length; i++) {
            merged[k] = arr1[i];
            k++;
        }
        for(int i = 0; i < arr2.length; i++) {
            merged[k] = arr2[i];
            k++;
        }
        for(int i = 0; i < k; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}