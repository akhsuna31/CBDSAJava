package DAY_8;

public class NSER {

    static int[] nser(int[] array){
        int n=array.length;
        int[] ans= new int[n];
        int maxElement=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            ans[i]=maxElement;
            maxElement=Integer.min(maxElement, array[i]);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] array={8,2,5,3,1,9,0};
        int[] ans= nser(array);
        for (int i : ans) {
            System.out.println(i);
        }

    }
}
