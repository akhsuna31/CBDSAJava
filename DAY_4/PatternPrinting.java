package DAY_4;
import java.util.*;
public class PatternPrinting {
    static void printSquare(int n){
        //square with *
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println();
        printSquare(n);
        //similarly we can make functions for each of them
        // right facing triangle with *
        System.out.println();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // inverted right facing triangle with *
        System.out.println();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // left facing triangle with *
        //System.out.println();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // inverted left facing triangle with *
        System.out.println();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
