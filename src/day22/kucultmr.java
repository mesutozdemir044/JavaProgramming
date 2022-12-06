package day22;

import java.util.Arrays;

public class kucultmr {
    public static void main(String[] args) {
        int [][]grps={{9, 8, 7, 6, 5, 4, 3, 2, 1}, {90, 80, 70, 60, 50, 40, 30, 20, 10}, {91, 81, 71, 61, 51, 41, 31, 21, 11}};
        for (int[] grp : grps) {
            for (int i : grp) {
                System.out.print(i+" ");
            }
        }

      /*  for (int i = 0; i < grps.length; i++) {
            for (int j = grps[i].length-1; j >=0 ; j--) {
                System.out.print(grps[i][j]+" ");
            }
            System.out.println();
        }*/


        /*for (int i = grps.length-1; i >=0  ; i--) {
            for (int j = 0; j <grps[i].length ; j++) {
                System.out.print(grps[i][j]+" ");

            }
            System.out.println();
        }*/


       /* int[][]grp=new int[grps.length][];
        for (int i = grps.length-1,j=0; i >=0 ; i--,j++) {
           grp[j]=grps[i] ;
        }
        System.out.println(Arrays.deepToString(grp));
        for (int[] ints : grp) {
            System.out.println(Arrays.toString(ints));
        }

       /* for (int i = 0; i < grps.length ; i++) {
            //System.out.println(Arrays.toString(grps[i]));
            for (int j = 0; j <grps[i].length ; j++) {
                System.out.print(grps[i][j]+" ");

            }
        }*/
    }
}
