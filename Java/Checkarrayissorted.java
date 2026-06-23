//Check if the the array is sorted or not
import java.util.*;
public class Checkarrayissorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean Sorted=true;
        for(int i=0;i<n-1;i++){
             if(arr[i]>arr[i+1]){
                Sorted=false;
                break;
            }
        }
        if(Sorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
        sc.close();
    }
}
     