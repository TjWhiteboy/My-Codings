//Eligiable for scholarship
import java.util.*;

public class eligiblescholorship {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        if(income > 7000){
            System.out.println("Eligiable for the scholarship");
        }
        else{
            System.out.println("Not Eligiable for the scholarship");
        }
}
}