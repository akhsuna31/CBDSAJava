package DAY_15;
import java.util.*;
public class Strings2 {
    static String reverse(String str){
        String strReverse="";
        for(int  i=str.length()-1;i>=0;i--){
            strReverse+=str.charAt(i);
        }
        return strReverse;
    }
    static boolean palindrome(String s){
        s.toLowerCase();
        if(s.compareTo(reverse(s))==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(palindrome("nitin"));
    }
}
