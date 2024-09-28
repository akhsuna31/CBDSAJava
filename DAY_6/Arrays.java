package DAY_6;
import java.util.*;

public class Arrays {
    static void swap(int[] array, int i, int j){
        int temp= array[i];
        array[i]= array[j];
        array[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len= sc.nextInt();
        int[] arr= new int[len];
        for(int i=0; i<len; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Your Array before swapping is:");
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Enter value of the indexes you want to swap:");
        int i=sc.nextInt();
        int j = sc.nextInt();
        swap(arr, i,j);
        System.out.println("Your Array after swapping is:");
        for(int a: arr){
            System.out.print(a+ " ");
        }
        sc.close();
    }
}
