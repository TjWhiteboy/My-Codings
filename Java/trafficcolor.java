//what is the color of the traffic light

import java.util.Scanner;

public class trafficcolor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is the color : ");
        String light=sc.nextLine();
        if(light.equals("red")){
            System.out.println("STOP");
        }
        else if(light.equals("yellow")){
            System.out.println("GET READY");
        }
        else if(light.equals("green")){
            System.out.println("GO");
        }
    }
}
