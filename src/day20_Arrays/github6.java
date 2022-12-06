package day20_Arrays;

import java.util.Arrays;

public class github6 {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5};
       int[] rev=new int[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {
            rev[j]=array[i];
        }
        System.out.println(Arrays.toString(rev));




        /*
        5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
        output:
            reversedArray = {5,4,3,2,1};
         */
    }
}
