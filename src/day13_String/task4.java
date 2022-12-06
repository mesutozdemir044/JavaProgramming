package day13_String;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /*
        4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
         */
        Scanner scan=new Scanner(System.in);
        String sentence=scan.next();
        String sentence1=scan.next();
        sentence.toUpperCase().charAt(0);
        sentence1.toUpperCase().charAt(0);
        System.out.println(sentence.toUpperCase().charAt(0)+"."+sentence1.toUpperCase().charAt(0));
    }
}
