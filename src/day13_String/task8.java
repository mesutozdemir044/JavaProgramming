package day13_String;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        /*
         You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method


         */
        Scanner scan=new Scanner(System.in);
        System.out.println("username:");
        String sentence= scan.next();

        if(sentence.equals("Cydeo")){
            System.out.println("password:");
        }else{
            System.out.println("Incorrect username or password");
        }

        String sentence1= scan.next();
        if(sentence1.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.out.println("Incorrect username or password");

    }
}}
