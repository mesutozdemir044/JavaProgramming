package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {


        byte a=100;
        short b=a;
        int c=b;
        long d=c;
        float e=d;
        double f=e;

        System.out.println("............");


        int x=55;
        long y=(int)x;

        System.out.println(x+":" +y);

        long j=1000000;
        short t=(short)j;
        System.out.println(j+":"+t);

        double r=2.5;
        float l=(float)r;
        System.out.println(r+":"+l);

        double g=10.8;
        int h=(int)g;
        System.out.println(g+":"+h);

        double s1=10.5;
        int y2= (int) s1;
        System.out.println(s1+":"+y2);



    }




}
