//Create an integer array, Get input for 5 numbers and print their sum or total.
import java.util.*;
public class array1 {
    public static void main(String[] args) {
        /*Scanner sc= new Scanner (System.in);
        int[] num =new int[5];
        num [0]=sc.nextInt(); 
        num [1]=sc.nextInt(); 
        num [2]=sc.nextInt(); 
        num [3]=sc.nextInt(); 
        num [4]=sc.nextInt(); 
        System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);*/

// looping method
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }

        System.out.println(sum);
    }
}

