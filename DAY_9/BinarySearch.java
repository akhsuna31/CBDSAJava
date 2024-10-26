package DAY_9;

public class BinarySearch {
    static int binarySearch(int[] arr, int num){
        int len= arr.length;
        int low=0, high=len-1, mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("index of the number is "+binarySearch(array, 10));
    }
}
