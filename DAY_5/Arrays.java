package DAY_5;

public class Arrays {
    static void display(int[] arr){
        int len= arr.length;
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        display(arr);
    }
}
