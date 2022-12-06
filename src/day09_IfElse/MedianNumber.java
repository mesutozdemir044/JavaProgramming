package day09_IfElse;

public class MedianNumber {

    public static void main(String[] args) {
        int a=50,b=40,c=60;
        boolean aMed=b<a&& a<c ||c<a &&a<b;
        boolean bMed=a<b&& b<c||c<b&&b<a;
        //boolean cMed=a<c && c<b||b<c&&c<a;
        boolean cMed=!aMed&&!bMed;

        if(bMed){
            System.out.println(b+" is median number");
        }
        if(aMed){
            System.out.println(a+" is median number");
        }
        if(cMed){
            System.out.println(c+" is median number");
        }

    }


}
