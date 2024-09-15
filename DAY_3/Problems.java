package DAY_3;
import java.util.*;
public class Problems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int val=(int) Math.sqrt(n);
        System.out.println(val);
        for(int i=2; i<=val;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.println("Number is not prime.");
        }else{
            System.out.println("Number is prime.");
        }
        sc.close();
    }
}
