//Score 
import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your score : ");
        int score=sc.nextInt();
        if(score<50){
            System.out.println("You need to improve");
        }
        else if (score>=50 && score<=70){
            System.out.println("Good Job");
        }
        else if(score>70){
            System.out.println("execllent");
        }
    }
    
}
