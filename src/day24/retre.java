package day24;

import java.util.Arrays;
import java.util.Scanner;

public class retre {public static int[] merge(int[] nums, int[] nums2) {

    int[] res = new int[nums.length + nums2.length];
    int i=0;
    for (int i1 : nums) {
        res[i++]=i1;
    }
    for (int i1 : nums2) {
        res[i++] =i1;
    }

    return res;



}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }


        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}

