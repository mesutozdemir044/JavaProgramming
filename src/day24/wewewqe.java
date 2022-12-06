package day24;

import java.util.Scanner;

public class wewewqe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
       // max();

    }


    public static int max(int x, int y) {
        // WRITE YOUR METHOD BELOW
        int res=0;
        if (x > y) {
        res=x;
        } else if (y > x) {
           res=y;
        } else {
            System.out.println("equal");
        }
return res;

    }
}

