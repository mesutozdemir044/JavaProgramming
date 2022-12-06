package day24;

import java.util.Scanner;

public class repl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //WRITE YOUR CODE BELOW:

        String a = "";
        for (int i = 0; i < nums.length; i++) {
            int fre=0;
            for (int each : nums) {
                if(each==nums[i]){
                    fre++;
                }
            }if(fre==1){
                System.out.println(nums[i]);
            }
        }

    }}

