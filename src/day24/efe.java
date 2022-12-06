package day24;

import java.util.Scanner;

public class efe {
    public static int getDup(String[] arr) {
    /*    int count=0;
       for (String s : arr) {
           if( arr1.equals(s))
               count++;
           arr1=arr1.replaceFirst(arr1,"")+s;
        }
*/

        String arr2="";
        for (String s : arr) {
            arr2+=s;
        }
        int say=0;//
        int unik=0;
        String res="";
        for (int i = 0; i <arr2.length() ; i++) {
            char ch=arr2.charAt(i);

            if(res.contains(""+ch)){
                say++;
                continue;

            }res=res.replaceFirst(res,"")+ch;






        }






        return say;


    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}