package day13_String;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*
         Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
         */
        Scanner scan=new Scanner(System.in);
String sentence=scan.next();
if(sentence.isEmpty()){
    System.out.println("string is empty");
}else if(sentence.length()>3){
    System.out.println((sentence.substring(sentence.length()-3)));
}else{
    System.out.println(sentence);
}

    }
}
