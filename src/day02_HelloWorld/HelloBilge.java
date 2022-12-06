package day02_HelloWorld;
import utulities.stringUtilities;
public class HelloBilge {

    public static void main(String[] args) {
String name="wooden spoon";
        stringUtilities.toEachChar(name);
String res=stringUtilities.reverse(name);
        System.out.println(res);
        String namees="ala";
       System.out.println( stringUtilities.isPalindrome(namees));
       String [] namess={"ali","malam","kal"};
       int count=0;
        for (String each : namess) {
           // if(each.equals(stringUtilities.reverse(each)))
            if(stringUtilities.isPalindrome(each))
                count++;
        }
        System.out.println(count);

        String a="abc";
        String b="bca";
        System.out.println(stringUtilities.isAnagram(a, b));

        String nm="aaaayssdfdfeeeeeeeeeeee";
        System.out.println(stringUtilities.removeDuplicate(nm));
        int[]num={1,2,3,4,5};



    }
}
