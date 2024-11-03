package DAY_12;
import java.util.*;
public class TwoDArray {
    static void populate(int[][] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void calculateSum(int[][] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] array= new int[n][m];
       
        populate( array);
        
        display(array);

        calculateSum(array);

        sc.close();
    }
}
