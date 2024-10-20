package DAY_8;

public class NGER {
    static int[] nger(int[] array){
        int n=array.length;
        int[] ans= new int[n];
        int maxElement=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            ans[i]=maxElement;
            maxElement=Integer.max(maxElement, array[i]);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] array={1,2,5,3,8,9,0};
        int[] ans= new int[array.length];
        ans= nger(array);
        for (int i : ans) {
            System.out.println(i);
        }

    }
}
