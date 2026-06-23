import java.util.Scanner;

public class BonusAmtEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary:");
        int salary = sc.nextInt();

        System.out.println("Enter the years of service:");
        int years = sc.nextInt();

        if (years > 10) {
            System.out.println("Salary of " + years + " years: Bonus is " + (salary * 10 / 100));
        } else if (years >= 6 && years <= 10) {
            System.out.println("Salary of " + years + " years: Bonus is " + (salary * 8 / 100));
        } else {
            System.out.println("Salary of " + years + " years: Bonus is " + (salary * 5 / 100));
        }

        sc.close();
    }
}
