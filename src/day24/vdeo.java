package day24;

import java.util.Arrays;
import java.util.Scanner;

public class vdeo {
    public static void main(String[] args) {
        initials("bilge", "ozdemir");
        domain("mesutoz@gmail.com");
        String[] emails = {"mesutk@gmail.com", "blg@cydeo.com", "hsyn@hotmail.com"};
        domain(emails[2]);
        months(3);
        reverse("ayse");
        maxandmin(3, 222);
        anagram("ala");
        anagram2("ayse","esya");

    }

    public static void initials(String first, String lastName) {
        String initial = first.charAt(0) + "." + lastName.charAt(0);
        System.out.println(initial);
    }

    public static void domain(String email) {

        email = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println(email);
    }


    public static void months(int number) {
        String month = (number == 1) ? "jan" : (number == 2) ? "feb" : (number == 3) ? "mar" : (number == 4) ? "ap" : "invalid";
        System.out.println(month);
    }


    public static String reverse(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
        return reverse;


    }


    public static int maxandmin(int a, int b) {
        int res = (a > b) ? a : b;
        System.out.println(res);
        return res;
    }


    public static void anagram(String name) {
        String anagram = "";
        String res = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            anagram += name.charAt(i);
            if (name.equals(anagram)) {
                res = (name + "is anagram");
            } else {
                res = (name + " is unanagram");
            }
        }
        System.out.println(res);
    }


    public static void anagram2(String a, String b) {
        char[] ch = a.toCharArray();
        char[] ch1 = b.toCharArray();
        String res = "";
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if (Arrays.equals(ch1,ch)) {
            res = "anagram";

        } else {
            res = "notanagram";
        }

        System.out.println(res);
    }

    public static int wordCount(String words) {
        //wordCount("one two three") your code
       int wordCount=0;

      String res[]=words.split(" ");
        for (String re : res) {
            wordCount++;
        }

return wordCount;
    }





}