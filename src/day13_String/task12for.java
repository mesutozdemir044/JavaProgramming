package day13_String;

import java.util.Scanner;

public class task12for {
    public static void main(String[] args) {
       /* Write a program that can remove the duplicated characters from a String
        Ex:
        input:
        AABBCCBC

        Output:
        ABC

        Hint: You can add each characters of the string into another String
        Condition: the character is not contained in the other String yet before you are adding*/
        Scanner scan=new Scanner(System.in);
        String str= scan.next();
        String temp="";
        for (int i = 0; i <str.length() ; i++) {
           String ch=""+str.charAt(i);
           if(!temp.contains(ch))
               temp+=ch;
        }
        System.out.println(temp);
       /* for (int i = 0; i <str.length()-1 ; i++) {
           if(str.indexOf(i)==str.indexOf(i+1));
           temp=str.charAt(i);
            if(str.indexOf(i)!=str.indexOf(i+1));
            temp+=str.charAt(i);
        }
        System.out.println(temp);*/

       /* for (int i = 0; i <str.length()-1 ; i++) {
            if(str.charAt(i)!=str.charAt())
            temp+=str.charAt(i);

            if(str.charAt(i)==str.charAt(i+1))
            temp+=str.replaceFirst(str.charAt(i),"");





        }
        System.out.println(""+temp+str.charAt(str.length()-1));*/
    }
}
