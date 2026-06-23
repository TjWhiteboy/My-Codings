//count positive and negative numbers in an array
import java.util.*;
public class countposandneg {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int pos = 0;
        int neg = 0;
        for(int i=0;i<n;i++){
            if(arr[i] >= 0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);

    }
}
