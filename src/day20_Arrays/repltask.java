package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class repltask {
    public static void main(String[] args) {
/*String res="kalem";
        System.out.println(res.charAt(0)+""+res.charAt(res.length()-1));*/
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);

    }}