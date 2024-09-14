package DAY_2;

public class Datatypes {
    //primitve datatypes
    public static void main(String[] args) {
    boolean b= true;
    System.out.println(b);

    int a= -10;
    System.out.println(a);

    int miniInt= Integer.MIN_VALUE;
    System.out.println(miniInt);

    int maxInt= Integer.MAX_VALUE;
    System.out.println(maxInt);

    short sh= -12;
    System.out.println(sh);
    
    short miniSh= Short.MIN_VALUE;
    System.out.println(miniSh);

    short maxSh= Short.MAX_VALUE;
    System.out.println(maxSh);

    float f=11.0f; //6 decimal places
    double d= 11.0d; //15 decimal places, d is not necessary in double
    System.out.println(f);
    System.out.println(d);

    char c= 'a';
    char j= 'd';
    System.out.println(c+j);

    byte b1= Byte.MIN_VALUE;
    byte b2= Byte.MAX_VALUE;
    System.out.println(b1+" "+b2);

    }
}
