package DAY_16;

public class RecursionClass {
    static int fact(int n){
        if(n==1) return 1;

        return n*(fact(n-1));
    }
    static int powerHead(int x, int n){ //function
        if(n==0) return 1;          // base condition

        return x*(powerHead(x, n-1));   //return statement
    }
    static int powerTail(int x, int n, int k){
        if(n==0) return k;

        return powerTail(x, n-1, x*k);
    }

    static int fibo(int n){
        if(n==0) return 0;
        else if(n==1) return 1;

        return fibo(n-1)+fibo(n-2);
    }

    static String reverse(String s, int n, String reverseString){
        if(n<0) return reverseString; 
        reverseString+=s.charAt(n);
        return reverse(s,n-1,reverseString);
    }

    static String reverse2(String s){
        if(s.length()==0) return "";
        return reverse2(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse2("watch"));
        //0 1 1 2 3 5 8
    }    
}

