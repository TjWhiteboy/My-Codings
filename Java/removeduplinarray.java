// Remove duplicate elements from an array
import java.util.*;
public class removeduplinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
            int[] temp=new int[n];
            int j=0;
            for(int i=0;i<n;i++){
                boolean Dupli=false;
                for(int k=0;k<j;k++){
                    if(arr[i]==temp[k]){
                        Dupli=true;
                        break;
                    }
                }
                if(!Dupli){
                    temp[j]=arr[i];
                    j++;
                }
            }
            System.out.println("The array after removing duplicate elements is:");
            for(int i=0;i<j;i++){
                System.out.print(temp[i]+" ");
            }
        sc.close();
    }
}
