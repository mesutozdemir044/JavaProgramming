package day21;

import java.util.Arrays;

public class githup5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[]arr1=new int[arr.length];
        int k=arr.length-1;
        for (int each : arr) {
           arr1[k--]=each;
        }
        System.out.println(Arrays.toString(arr1));
/*
1. Write a program that sort the array of integer in descending order
 */
    }
}
