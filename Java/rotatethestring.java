/// rotate the string .if the goal string is a rotation of the original string
import java.util.*;
public class rotatethestring {
    public static void main(String[] args) {
        String s="abcdefg";
        String goal="cdefgab";
        boolean ans=check(s,goal);
        System.out.println(ans);
    }
    public static boolean check(String s,String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        String temp=s+s;
        return temp.contains(goal);
    }
}
