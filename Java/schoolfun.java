
import java.util.Scanner;

public class schoolfun {
    String passorfail(int mark){
        if(mark>30){

            return "Pass";
        }
        else{
            
            return " Fail";
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        schoolfun obj1=new schoolfun();
       System.out.println (obj1.passorfail(mark));

    }
}
