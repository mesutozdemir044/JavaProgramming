package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class replsss {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words=str.split(", ");//

       String result= "";

        int minLength=words[0].length();
        for(String word:words){
            if(minLength>word.length()){
                minLength=word.length();
                result = word + ", ";
            }
            else if(minLength==word.length())
            {
                result = result + word+", ";
            }
        }

        System.out.print(Arrays.toString(result.split(" ")));

    }
}
