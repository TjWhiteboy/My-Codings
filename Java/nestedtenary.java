//Largest number using nested tenary operation

import java.util.Scanner;
public class nestedtenary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.print(d);
    }
}