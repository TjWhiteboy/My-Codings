import java.util.Scanner;

public class findoddorevenfun {
    void evenorodd(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        findoddorevenfun obj1 = new findoddorevenfun();
        obj1.evenorodd(a);
    }
}