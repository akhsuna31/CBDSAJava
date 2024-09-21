package DAY_4;

import java.util.Scanner;

public class PatternPrinting2 {
    static void ques6(int n){
        for(int i=1; i<=5; i++){
            for(int k=1; k<=2*(i-1); k++){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void ques7(int n){
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++){
                if(j==1 || j==n || i ==1|| i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void ques8(int n){
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++){
                if(j==i || j==n-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //int n= sc.nextInt();
        System.out.println();
        //ques6(n);
        //ques7(5);
        ques8(5);
        sc.close();
    }
}
