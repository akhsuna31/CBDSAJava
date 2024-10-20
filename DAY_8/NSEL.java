package DAY_8;

public class NSEL {
    static int[] nsel(int[] array){
        int n=array.length;
        int[] ans= new int[n];
        int maxElement=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans[i]=maxElement;
            maxElement=Integer.min(maxElement, array[i]);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] array={8,2,5,3,1,9,0};
        int[] ans= new int[array.length];
        ans= nsel(array);
        for (int i : ans) {
            System.out.println(i);
        }

    }
}
