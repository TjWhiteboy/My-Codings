//Print the multiplication table of a given number.
import java.util.*;
public class loop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            System.out.println(a+"*"+i+"="+(a*i));
            
        }
    } 
    
}
