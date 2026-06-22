// Number divided by both 3 and 5
import java.util.*;
public class divbythreeandfive {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System .in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        if(num % 3==0 && num % 5==0)
        {
            System.out.println("Divided by Both");
        }
        else {
            System.out.println("Not Divided");
        }
    }
}
