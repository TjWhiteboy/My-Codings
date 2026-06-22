//Find the average of array elements.
import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int num=0;
        int []size=new int[a];
        for(int i=0;i<a;i++){
            size[i]=sc.nextInt();
            num+=size[i];
        }
        System.out.println(num/a);
    }
    
}
