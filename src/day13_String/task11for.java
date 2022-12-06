package day13_String;

import java.util.Scanner;

public class task11for {
    public static void main(String[] args) {

          /*
    1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
     */
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        String temp="";
        for (int i =0; i <str.length() ; i++) {
            temp+=str.charAt(((str.length()-1)-i));
        }
        System.out.println(temp);


    }

}
