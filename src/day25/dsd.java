package day25;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
class Main1 {

    public static String search(ArrayList<String> strs, String find) {

        String res="";
        for (String str : strs) {
            if(str.contains(find)){
                res=str;

            }else{
                res="search failed";
            }
        }return res;
        // complete the method


    }


    public static int refuels(ArrayList<Integer> deliveries,int gasTank) {
int times=0;
int sum=0;
        for (Integer delivery : deliveries) {
            sum+=delivery;
        }
        times=sum/gasTank;
        if(sum%gasTank>0){
            times+=1;
        }

return times;
    }

    public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {
boolean res=false;
int nanukCount=0;
int huntSum=0;
        for (String s : result) {
            if(s.equals("nanuk")){
                nanukCount++;
            }else{
                huntSum+=Integer.valueOf(s);
            }
        }
        if(wayStones>=nanukCount&&huntSum>=boast){
            res=true;
        }




return res;
    }

    public static String countLetters(String str){
        int num=0;
        String res="";
        //aaabbcc
       char[] ch= str.toCharArray();

        for (int i = 0; i <ch.length ; i++) {
            num = 0;
            if (ch[i] != ' ') {
                for (int j = i; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        num++;
                        ch[j] = ' ';
                    }

                }
                res += num + ch[i];
                ch[i] = ' ';
            }
        }

return res;
    }








    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }

}