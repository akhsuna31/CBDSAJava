package DAY_3;

public class Operators {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        if(!(a>b || a==b)){ //(a>=b)
            System.out.println("a is not greater than b");
        }
        else{
            System.out.println("b is not greater than a");
        }

        //bitwise
        System.out.println(a&b); //and
        System.out.println(a|b); //or
        System.out.println(a^b); //xor
        System.out.println(~a); // complement 

    }
}
