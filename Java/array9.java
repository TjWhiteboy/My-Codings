//Count how many times a particular number appears in the array.
import java.util.*;
public class array9 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int target=sc.nextInt();
        for(int i=0;i<a;i++){
            if(arr[i]==target){
                count++;
            }
        }System.out.println(count);
    } 
}
