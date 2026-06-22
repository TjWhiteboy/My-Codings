import java.util.Scanner;

public  class getphonefunction {
    public String getname(){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        return name;
    }
    public int getnumber(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }
    public static void main(String[] args) {
        getphonefunction phone=new getphonefunction();
        String name = phone.getname();
        int num=phone.getnumber();
        System.out.println(name);
        System.out.print(num);
        
    }
}
