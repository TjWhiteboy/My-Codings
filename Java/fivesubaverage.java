import java.util.*;
public class fivesubaverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects : ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        double average=(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("The average is : "+average);
    }
}
