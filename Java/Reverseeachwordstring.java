//Reverse each word in a string
public class Reverseeachwordstring {
    public static void main(String[] args) {
        String str="Vijay Anand";
        String[] words=str.split(" ");
        StringBuilder rev=new StringBuilder();
        for(int i=0;i<=words.length-1;i++){
            String word=words[i];
            StringBuilder sb=new StringBuilder(word);
            if(i<words.length-1){
                rev.append(sb.reverse()+" ");
            }
            else{
                rev.append(sb.reverse());
            }
          
        }System.out.println(rev.toString());

    }

}
