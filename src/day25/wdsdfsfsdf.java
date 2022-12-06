package day25;

import java.util.Scanner;

public class wdsdfsfsdf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {

String res1="";
        String b = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
           char res = ch[i];
            for (int j = 0; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    res = ch[i] ;
                }
            }res1+=count+res;


                                 /*for (char each : ch) {
                                         if(each==ch[i]){
                                            count++;
                                            b=ch[i]+"";

                                                 }*/

            //aaabbcc


        }
        return res1;

    }

}


