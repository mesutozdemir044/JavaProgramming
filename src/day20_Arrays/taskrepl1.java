package day20_Arrays;

import java.util.Scanner;

public class taskrepl1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res=0;

        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i]==5&&nums[i+1]==5){
                res++;
            }else{
                res=res;
            }
        }
        if(res==1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
