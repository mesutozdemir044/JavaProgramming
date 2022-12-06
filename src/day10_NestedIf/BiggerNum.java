package day10_NestedIf;

public class BiggerNum {
    public static void main(String[] args) {



       /*5. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY*/


       /*double n1=0.6, n2=0.5,n3=0.333;

        String result=(n1>0||n1<0&&n2<0||n2>0&&n3>0||n3<0)?(n1>n2&&n1>n3)?+n1+" n1 is bigger":(n2>n1&&n2>n3)?+n2+" n2 is bigger":+n3+" n3 is bigger":"yanlis deger";
        System.out.println("result = " + result);*/
        int n1=10;
        int n2=155;
        int n3=435;
        System.out.println ((n1>n2 && n1>n3)?(n1+  " is bigger"):(n2>n1 && n2>n3)?(n2+ " is bigger"):
                (n3+ " is bigger"));


        /*System.out.println ((n1>n2 && n1>n3)?(n1+  " is bigger"):(n2>n1 && n2>n3)?(n2+ " is bigger"):
                (n3>n1 && n3>n2)?(n3+ " is bigger"):("yanlış değer girdiniz"));*/




    }
}
