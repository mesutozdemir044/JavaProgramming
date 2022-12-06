package day25;


import java.util.ArrayList;

import java.util.Scanner;

public class LISSS {
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){



        for (Integer each : list) {
        if(each<0){
            list.remove(each);

        }

            }return list;
        }










    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

}