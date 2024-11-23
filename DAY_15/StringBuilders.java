package DAY_15;
public class StringBuilders {
    static String reverseWords(String s){
        s=s.trim();
        String[] s_arr=s.split(" ");
        String ans="";
        for (int i = s_arr.length-1; i>=0;i--) {
            ans+=s_arr[i];
            ans+=" ";
        }
        return ans;
    }
    public static void main(String[] args) {
        String s= new String("till death do us apart");
        System.out.println(reverseWords(s));
        Integer n1=128;
        int n2=128;
        n1.equals(n2);
    }
}
