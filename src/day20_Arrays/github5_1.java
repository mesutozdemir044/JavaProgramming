package day20_Arrays;

import java.util.Arrays;

public class github5_1 {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        int[]array1=new int[array.length];
        int j=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]!=0){
                array1[j]=array[i];
            j++;}
        }
        System.out.println(Arrays.toString(array1));
    }
}
