//Read two integer data and month and day and check whether the day is valid for the given month.
import java.util.Scanner;
public class dayandmonthvalid 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month");
        int month=sc.nextInt();
        System.out.println("Enter the day");
        int date=sc.nextInt();
        if(month<=12 && month>0)
        {
            if(month==2)
            {
                if(date>0 && date<=28)
                {
                    System.out.println("Valid");
                }
                else
                {
                    System.out.println("Invalid");
                }
            }
            else if (month==4||month==6||month==9||month==11)
            {
                if(date>0 && date<=30)
                {
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
            }
            else
            {
                if(date>0 && date <=31)
                {
                    System.out.println("Valid");
                }
                else
                {
                    System.out.println("Invalid");
                }
            }
        }
    }
}
