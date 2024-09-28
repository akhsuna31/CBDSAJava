package DAY_6;
import java.util.*;

public class Arrays {
    static void swap(int[] array, int i, int j){
        // int temp= array[i];
        // array[i]= array[j];
        // array[j]=temp;
        array[i]=array[i]+array[j];
        array[j]=array[i]-array[j];
        array[i]=array[i]-array[j];
    }
    static void reverse1(int[] array){
        int len= array.length;
        int[] reverseArray= new int[len];
        for(int i=0; i<len; i++){
            reverseArray[i]=array[len-1-i];
        }

        //shallow copy
        //array=reverseArray;
        
        //deep copy
        for(int i=0; i<len; i++){
            array[i]=reverseArray[i];
        }

        for (int a : array) {
            System.out.print(a+" ");
        }
    }

    static void reverse2(int[] array){
        int n = array.length;
        for(int i=0; i<n/2; i++){
            swap(array, i, n-1-i);
        }
        for(int i: array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len= sc.nextInt();
        int[] arr= new int[len];
        for(int i=0; i<len; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Your Array is:");
        for(int i: arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        // System.out.println("Enter value of the indexes you want to swap:");
        // int i=sc.nextInt();
        // int j = sc.nextInt();
        // swap(arr, i,j);
        // System.out.println("Your Array after swapping is:");
        // for(int a: arr){
        //     System.out.print(a+ " ");
        // }

        System.out.println("Your reverse array is: ");
        reverse2(arr);

        sc.close();
    }
}
