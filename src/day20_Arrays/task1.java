package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String[] namedClassmates={"ali","kasim","naside","ayse","voleybol","try","beside","eve","mesut","jop"};
        for (int i = 0; i < namedClassmates.length; i++) {
            System.out.println(namedClassmates[i]);
        }


        System.out.println(Arrays.toString(namedClassmates));
        String[] days=new String[7];
        days[0]="monday";
        days[1]="tuesday";
        days[2]="wednesday";
        days[3]="thursday";
        days[4]="friday";
        days[5]="saturday";
        days[6]="sunday";
        int num=3;

        if(num<0&&num>7){
            System.err.println("invalid");
            System.exit(0);
        }
        for (int i = 0; i < days.length ; i++) {
            System.out.println(days[i]);
        }

        System.out.println(days[1]);

        System.out.println("-----------------------------------");
      String[] names=new String[3];
      names[0]="ali";
      names[1]="kassim";
      names[2]="blge";
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }
        System.out.println("------------------------");
        int[]numar={0,1,2,3,4,};
        System.out.println(Arrays.toString(numar));
        System.out.println("-----------------------------------------------------");
      char[]letters=new char[26];
        for (char i = 'a',j=0;      i <='z'&&j< letters.length ;     i++,j++) {
           letters[j]=i;// char letters[0]==char i=='a'
        } System.out.println(Arrays.toString(letters));


        System.out.println("-------------------------------------------");
        char[]alhabets1=new char[26];
        for (char i = 0,j='z';i<alhabets1.length; i++,j--) {
            alhabets1[i]=j;
        }
        System.out.println(Arrays.toString(alhabets1));
        System.out.println("------------------------------------------");

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int length1= scanner.nextInt();
        if(length1<0){
            System.err.println("invalid number");
        }

        int []num3=new int[length1];
        for (int i = 0; i <length1 ; i++) {
            System.out.println("enter number");
            num3[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(num3));
        System.out.println("------------------------------------");
        int[] no={1,34,23,45,67};
        int max=no[0];
        int min=no[0];
        for (int i = 0; i <no.length ; i++) {


            if(no[i]>max){
                max=no[i];}
            if(no[i]<min){
               min=no[i];}
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("---------------------------------------");


        int[] nom=new int[5];
        int max1=nom[0];
        for (int i = 0; i <nom.length ; i++) {
            System.out.println("enter no");

            if(nom[i]>max1) {
                max1=nom[i];
            }
            System.out.println(max1);
        }




        /*
        1. create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
         */
    }
}
