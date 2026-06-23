//Remove whitespace from a string
public class Removewhitespace {
    public static void main(String[] args) {
        String str="Vijay Anand is girl";
        str=str.replaceAll("\\s" ,"");
        System.out.println(str);
        
    }
}
