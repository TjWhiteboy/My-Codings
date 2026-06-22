//Find Index of an Element
import java.util.*;
public class array8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }int value=sc.nextInt();
        int index=-1;
        for(int i=0;i<a;i++){
            if(arr[i]==value){
                index=i;
            }
        }
        System.out.println(index);
    }
    
}
