package day21;

import java.util.Arrays;

public class githup4 {
    public static void main(String[] args) {
       int[] arr1 = {30, 10, 20};
       int[] arr2 = {15, 40, 25, 35};
       int[] arr3 = {8, 9, 17, 5, 4, 1};
       int[]sum=new int[13];
int m=0;
        for (int i : arr1) {
           sum[m++]=i;
        }
        for (int i : arr2) {
            sum[m++]=i;
        }
        for (int i : arr3) {
            sum[m++]=i;
        }
        System.out.println(Arrays.toString(sum));
        /*
         Write a program that can merge 3 arrays of integers
    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}
			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
         */
    }
}
