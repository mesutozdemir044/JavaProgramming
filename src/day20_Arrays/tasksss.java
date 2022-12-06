package day20_Arrays;

import java.util.Scanner;

public class tasksss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int counter=0;
        for (int each : nums) {
           if( each%2==0){
               counter++;

           }

        }System.out.println(counter);
    }
}
