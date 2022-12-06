package day13_String;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*
        3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

         */
        Scanner scan=new Scanner(System.in);
        String sentence=scan.next();
        System.out.println();
        if(sentence.charAt(0)==(sentence.charAt(sentence.length()-1))){
            System.out.println("same");
        }else{
            System.out.println("different");
        }
    }
}
