package day13_String;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /*
         Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
         */
        Scanner scan=new Scanner(System.in);
        String sentence1= scan.next();
        String sentence2= scan.next();
        String sentence3= scan.next();
        if(sentence1.length()==sentence2.length()&&sentence2.length()== sentence3.length()
        &&sentence1.length()==sentence3.length()){
            System.out.println("All words are same length");}
            else if(sentence1.length()<=sentence2.length()&&sentence2.length()>= sentence3.length()
                    &&sentence1.length()>=sentence3.length()){
                System.out.println("Not Same nor Different lengths");}
            else{
            System.out.println("All different length");
            }
        }
    }

