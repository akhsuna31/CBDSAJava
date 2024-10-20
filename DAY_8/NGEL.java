package DAY_8;

public class NGEL {
    static int[] ngel(int[] array){
        int n=array.length;
        int[] ans= new int[n];
        int maxElement=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans[i]=maxElement;
            maxElement=Integer.max(maxElement, array[i]);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] array={1,2,5,3,8,9,0};
        int[] ans= new int[array.length];
        ans= ngel(array);
        for (int i : ans) {
            System.out.println(i);
        }

    }
}
