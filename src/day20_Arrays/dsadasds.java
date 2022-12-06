package day20_Arrays;

import java.util.Scanner;

public class dsadasds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
int maxlength=0;
        String res="";
        for (String word : words) {
            if(word.length()>maxlength){
                maxlength= word.length();
                res=word;
            }
        }
        System.out.println(res);



    }
}
