// Mark and price

import java.util.*;
public class elseif1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mark : ");
        int mark = sc.nextInt();
        if(mark>35&&mark<=60){
            System.out.println("You get a game");
        }
        else if(mark>60&&mark<=90){
            System.out.println("You get a Iphone");
        }
        else if(mark>=90){
            System.out.println("You get a laptop");
        }
        else 
        {
            System.out.println("You need to study hard");
        }
        

    }
}
