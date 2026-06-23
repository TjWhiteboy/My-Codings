//common characters in two strings
public class commoncharintwostring {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="acde";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            for(int j=0;j<s2.length();j++){
                if(ch==s2.charAt(j)){
                    sb.append(ch);
                    break;
                }
            }
        }System.out.println(sb.toString());
    }
    
}
