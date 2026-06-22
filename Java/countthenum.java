
import java.util.*;

public class countthenum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 0;
/*count odd
        for (int i = a; i <= 10; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        System.out.println("Count of odd numbers = " + count);*/
      //count of even
        for(int i=a;i<=10;i++){
            if(i%2==0){
                count++;
            }
        }System.out.println("count of even"+count);
    }
}