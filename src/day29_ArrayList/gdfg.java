package day29_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class gdfg {

    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);
    }

    private static void populate(int a) {
        int[] b=new int[a];
        for (int i = 0; i <a ; i++) {
            b[i]=i+1;
        }

        System.out.println(Arrays.toString(b));
    }
    }