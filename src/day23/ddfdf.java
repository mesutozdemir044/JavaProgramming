package day23;

import java.util.Scanner;

public class ddfdf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
int res=0;
        for (int i = 0; i <nums.length ; i++) {

            boolean str=false;

            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                  str=true;
                }
            }

            if(!str)
            {res=nums[i];}

        }
        System.out.println(res);

    }
}
