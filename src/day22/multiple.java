package day22;

import java.util.Arrays;

public class multiple {
    public static void main(String[] args) {
     int[] grp1=   {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] grp2=   {90, 80, 70, 60, 50, 40, 30, 20, 10};
        int[] grp3=   {91, 81, 71, 61, 51, 41, 31, 21, 11};
        int[][]grps=new int[3][];
        grps[0]=grp1;
        grps[1]=grp2;
        grps[2]=grp3;
        System.out.println(Arrays.deepToString(grps));
        System.out.println(Arrays.toString(grps[1]));
        System.out.println(grps[0][3]);

    }
}
