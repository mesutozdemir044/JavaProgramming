package day25;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;


    class Main {
        public static ArrayList<String> combine(String[] r1, String[] r2){

            // your code here
ArrayList<String>list=new ArrayList<>();
            for (String s : r1) {
                list.add(s);
            }


            for (String s1 : r2) {
                list.add(s1);
            }

return list;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String [] strs = new String[in.nextInt()];
            String [] strs2 = new String[in.nextInt()];
            for(int i=0; i < strs.length; i++) {
                strs[i] = in.next();
            }
            for(int i=0; i < strs2.length; i++) {
                strs2[i] = in.next();
            }

            System.out.println(combine(strs,strs2));

        }

    }

