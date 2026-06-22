//Find the maximum element in the array.
import java.util.*;
public class array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<a;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("Maximum element: " + max);


    }
    
} 
