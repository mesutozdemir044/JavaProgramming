package day20_Arrays;

import java.util.Scanner;

public class replstsks1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String [] sent=sentence.split(" ");
        for (int i = sent.length-1; i >=0 ; i--) {
            System.out.print(sent[i]+" ".trim());
        }


       // Scanner input = new Scanner(System.in);
       // String[] words = new String[5];

      /*  for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        String res="";

        for (int i = 0; i <words.length ; i++) {
            int max=0;
            if(words[i].length()>max){
                max=words[i].length();
            System.out.println(words[i]);}
        }

        //WRITE YOUR CODE BELOW
*/
    }
}
