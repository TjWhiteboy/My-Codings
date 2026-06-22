//Check whether a given number exists in the array.
import java.util.*;
public class array7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("size of array: ");
        int a=sc.nextInt();
        int[]arr=new int[a];
        System.out.println("Enter the numbers for array");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<a;i++){
            if(arr[i]==num){
                System.out.print("true");
                res++;
                break;
            }
        }
        if(res==0){
            System.out.println("false");
        }

    }
    
}
