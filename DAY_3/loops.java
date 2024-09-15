package DAY_3;

public class loops {
    public static void main(String[] args) {
        int n=10;

        System.out.println("even numbers from 1 to n=10 are:");
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("first 10 even numbers are:");
        int start=0;
        for(int i=1; i<=n; i++){
            if(start%2==0){
                System.out.print(start+" ");
            }
            start+=2;
        }
        System.out.println();

        System.out.println("sum of first 10 (n) natural numbers is:");
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("first n (10) natural numbers in reverse order:");
        for(int i=n; i>=1; i--){
            System.out.print(i+" ");;
        }

        //complex with multiple initializations
        for(int i=0, j=1;i<j && j<n; i++, j++){
            System.out.println(i+" "+j);
        }
    }
}
