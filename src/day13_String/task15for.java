package day13_String;

import java.util.Scanner;

public class task15for {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String str = scan.next();
        String str1 = scan.next();

        String res="";
        int m=0;



        for (int i = 0; i <str.length() ; i++) {
          String ch=""+str.charAt(i);

               if(str1.equals(ch)){

                   m++;
               }




        }  System.out.println(m);




    }
}
/*
2. Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */