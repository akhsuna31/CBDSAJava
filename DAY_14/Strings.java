package DAY_14;

public class Strings {
    static String reverse(String str){
        String strReverse="";
        for(int  i=str.length()-1;i>=0;i--){
            strReverse+=str.charAt(i);
        }
        return strReverse;
    }
    static String lexographicallySmallest(String s, int k){
        s=s.toLowerCase();
        String ans=s.substring(0, k);
        String currString="";
        int i=1;
        int j=k;
        while(j<s.length()){
            currString=s.substring(i, j+1);
            if(ans.compareTo(currString)>0){
                ans=currString;
            }
            i++;
            j++;
        }
        return ans;
    }

    //leetcode 424
    public static void main(String[] args) {
        System.out.println(reverse("Anushka"));
        System.out.println(lexographicallySmallest("Krishna", 3));
    }
}
