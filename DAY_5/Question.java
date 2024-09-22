package DAY_5;
import java.util.*;
public class Question {
    static void armstrong(int n){
        boolean flag=false;
        int num=n;
        int digitCount=0, rem=0;
        int sum=0;
        while(num>0){
            num/=10;
            digitCount++;
        }
        num=n;
        while(num>0){
            rem= num%10; //using the variable as a remainder variable
            sum+=(int) Math.pow(rem,digitCount);
            num/=10;
        }
        if(sum==n){
            flag=true;
        }
        System.out.println(flag);
    }
    static void reverse(int n){
        int ans=0, rem=0;
        while(n>0){
            rem=n%10;
            ans= ans*10 + rem;
            n/=10;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        //armstrong(n);
        reverse(n);
        sc.close();
    }
}
