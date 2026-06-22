//Print Even Numbers
import java.util.*;
public class array11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    
}}
