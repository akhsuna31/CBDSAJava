package DAY_5;

public class Arrays {
    static void display(int[] arr){
        int len= arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=len-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        display(arr);
    }
}
