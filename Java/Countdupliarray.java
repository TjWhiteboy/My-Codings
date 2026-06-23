//count duplicate elements in an array
import java.util.*;
public class Countdupliarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        break;
                    }
                }
            }
            System.out.println("The number of duplicate elements in the array is:"+count);
    }
}
