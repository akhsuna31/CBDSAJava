package DAY_9;

public class UpperBound {
    static int upperBound(int[] arr, int num){
        int len= arr.length;
        int low=0, high=len-1, mid=0;
        int ans=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,8,8,10,10,10};
        System.out.println("upperbound of the number is "+upperBound(array, 8));
    }
}
