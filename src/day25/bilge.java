package day25;

import java.util.Scanner;

public class bilge {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(countLetters(in.next()));
}

    public static String countLetters(String str){
        int num=0;
        String res="";
        //aaabbcc
        char[] ch= str.toCharArray();
        char [] temp=str.toCharArray();

        for (int i = 0; i <ch.length ; i++) {
            num = 0;

                for (int j = i; j < ch.length; j++) {
                    if (ch[i] == temp[j]) {
                        num++;
                        temp[j] = ' ';
                    }

                }

                if(num>0){
                res += num + ""+ch[i];}
                //ch[i] = ' ';

        }

        return res;
    }

}

