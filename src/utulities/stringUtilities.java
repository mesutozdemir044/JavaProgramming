package utulities;

import java.util.Arrays;

public class stringUtilities {
    public static void toEachChar(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static String reverse(String name) {
        String rever = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rever += name.charAt(i);
        }
        return rever;
    }

    public static boolean isPalindrome(String names) {
        boolean ispalin = true;
        if (reverse(names).equals(names)) {
            ispalin = true;
        } else {
            ispalin = false;
        }
        return ispalin;
    }


    public static boolean isAnagram(String name, String names) {
        boolean isAnagram = true;
        char[] ch = name.toCharArray();
        Arrays.sort(ch);
        char[] ch1 = names.toCharArray();
        Arrays.sort(ch1);
       return Arrays.equals(ch,ch1);

    }


    public static String removeDuplicate(String name){
       String res="";
       for (int i = 0; i <name.length() ; i++) {
          char ch= name.charAt(i);
          if(!res.contains(""+ch))
           res+=name.charAt(i);
            }return res;

        }
    }















