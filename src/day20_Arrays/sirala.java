package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sirala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

       //x xxabyyy
            int counter=0;

            for (int i = 0; i <sentence.length() ; i++) {
                char ch=sentence.charAt(i);


                if(i+2<sentence.length()) {
                    if (ch == sentence.charAt(i + 1) && ch == sentence.charAt(i + 2)) {
                        counter++;
                    }


                }

            }
            System.out.println(counter);

        }
    }
