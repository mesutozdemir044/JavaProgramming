package day13_String;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        2. write a program that asks user to enter two strings, and print out the longest string
         */

        Scanner scan=new Scanner(System.in);
        String sentence1= scan.next();
        String sentence2= scan.next();

        if( sentence1.length()>sentence2.length()){
            System.out.println(sentence1);
        }else{
            System.out.println(sentence2);
        }

    }
}
