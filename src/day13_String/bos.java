package day13_String;

import java.util.Scanner;

public class bos {
    public static void main(String[] args) {
        Scanner ali=new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.indexOf("bread")==str.lastIndexOf("bread")){
            System.out.println("nothing");

        }else if(str.indexOf("bread")!=str.lastIndexOf("bread"))
        {
            System.out.println(str.substring(str.indexOf("bread") + 5,str.lastIndexOf("bread")));
        } else{
            System.out.println("nothing");
        }
        //WRITE YOUR CODE BELOW




    }
}

