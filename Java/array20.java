//Move All Zeros to End

import java.util.*;

public class array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int j=0;
        for (int i=0;i<size;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;

            }

        }
        while (j<size) { 
            arr[j]=0;
            j++;
            
        }for(int i=0;i<size;i++){
            System.out.print(arr[i]);

        }

}}
