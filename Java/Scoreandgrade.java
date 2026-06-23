import java.util.Scanner;
public class Scoreandgrade {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        char grade= (mark>=90)?'O':(mark>=80)?'A':(mark>=70)?'B':(mark>=60)?'C':(mark>=50)?'D':'F';
        System.out.println(grade);
    }
}
