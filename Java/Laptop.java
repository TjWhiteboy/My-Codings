public class Laptop {
    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;



    public static void main(String[] args) {

        Laptop lap1 = new Laptop();

        lap1.name = "HP";
        lap1.proc = "i5";
        lap1.ram = 6;
        lap1.price = 40000;

        Laptop lap2 = new Laptop();
        lap2.name = "Lenovo";
        lap2.proc = "i7";
        lap2.ram = 8;
        lap2.price = 80000;

        System.out.println(lap1.name + " " + lap1.proc + " " + lap1.ram + "GB " + lap1.price);
        System.out.println(lap2.name + " " + lap2.proc + " " + lap2.ram + "GB " + lap2.price);
    }
}