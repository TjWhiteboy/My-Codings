// Check the number is even or odd or zero
import java.util.*;
public class oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number to Find odd or even :");
        int num=sc.nextInt();
        if(num==0)
        {
            System.out.println(num+" is a netural ");
        }
        else if(num %2==0){
            System.out.println(num+" is a even Number");
        }
        else{
            System.out.println(num+" is a odd number");
        }

    }
}
