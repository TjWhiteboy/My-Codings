
import java.util.Scanner;

public class functionreturn {

    int sum(int num1, int num2) {
        int c = num1 + num2;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        functionreturn obj1 = new functionreturn();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sumvalue = obj1.sum(a, b);

        System.out.println("Sum = " + sumvalue);
    }
}