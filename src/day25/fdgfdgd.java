package day25;

import java.util.Scanner;

public class fdgfdgd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {

     char[] ch=  str.toCharArray();
int count=0;
String res="";
        for (int i = 0; i <ch.length ; i++) {
            for (char each : ch) {
                if(!(res.contains(each+""))){
res+=each;
                }
            }
        }

return res;


    }
}

