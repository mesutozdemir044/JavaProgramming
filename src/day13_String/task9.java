package day13_String;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        /*public static void main(String[] args) {

      /*  You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
        username: Cydeo
        password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

        Hints: 	In order to login, both username and password MUST be correct
        you will need to use equals() method*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kullanıcı adınızı girinzi");
        String username = scanner.nextLine();
        System.out.println("şifrenizi giriniz");
        String password = scanner.nextLine();

        aplikasyon(username, password);

    }

    private static void aplikasyon(String username, String password) {

       /*String kullanıcıadı = "Cydeo";
        String şifre = "WoodenSpoon";
        if (username.equals(kullanıcıadı) && password.equals(şifre)){
            System.out.println("kullanıcı adı ve şifrenizi  doğru girdiniz. tebrikler şansılısınız");


        } else System.out.println("yanlış kullanıcı veya şifre girdiniz");}*/

   /* Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

         */

      /*  Scanner scan = new Scanner(System.in);

            String word = scan.nextLine();
                String sentence = scan.nextLine();
                System.out.println(sentence.contains(word));
*/

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length() < 5) {
            System.out.println("Too short!");
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        } else {
            System.out.println(word.charAt(4) + "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        }

    }
}