
import java.util.Scanner;

public class salaryandageforloan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        System.out.println("Salary : ");
        int salary= sc.nextInt();
        if(salary>=20000||age<=25){
            System.out.println("Your are eligiable for the loan ");
            System.out.println("Enter the loan amount :");
            int loanamt=sc.nextInt();
            if(loanamt<=50000){
                System.out.println("the loan is accepted");
            }
            else{
                System.out.println("Max amt limit");
            }
        }
        else{
            System.out.println("Your not eligiable for the loan");}
    }
    
}
