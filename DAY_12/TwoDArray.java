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

    static void rowWiseSorting(int[][] array){
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
    }
    static void columnWiseSorting(int[][] array){
        
        Arrays.sort(array, (a,b)-> Integer.compare(a[0], b[0]));
        
    }

    static void transpose(int[][] array){
        int m= array.length;
        int n= array[0].length;
        int[][] transposeArray= new int[m][n];
        for ( int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposeArray[i][j]=array[j][i];
            }
        }
        display(transposeArray);
    }

    static void twoDTo1d(int[][] array){
        int n= array.length;
        int m= array[0].length;
        int[] arr= new int[n*m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                arr[m*i+j]=array[i][j];
            }
        }
    }

    static void OneDTo2d(int[] array,int n, int m){
        if(n*m==array.length){
            int[][] twoDArray= new int[n][m];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    twoDArray[i][j]=array[m*i+j];
                }
            }
            display(twoDArray);
        }
        else{
            System.out.println("2D Array not possible");
        }
    }

    static void completeSort(int[][] array){

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] array= new int[n][m];
       
        populate( array);
        
        display(array);
        //rowWiseSorting(array);
        System.out.println();
        //columnWiseSorting(array);
        //display(array);
        transpose(array);
        //calculateSum(array);

        sc.close();
    }
}
