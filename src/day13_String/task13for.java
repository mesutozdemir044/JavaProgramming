package day13_String;

import java.util.Scanner;

public class task13for {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println( "enter number");

       int c=0;
       int d=0;

        for (int i = 0; i <5 ; i++) {

           int b=scan.nextInt();
           if(b<0)
              c++;
           if(b>0)
               d++;
        }
        System.out.println(c+" negative and "+d+" positive");

    }
}
/*
        1. Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
         */