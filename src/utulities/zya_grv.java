package utulities;

public class zya_grv {
    public static void main(String[] args) {

        int[] nums = {4, 9, 1, 3, 6, 4};

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            int sum1 = 0;

            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum1 += nums[j];

            }
            if (sum == sum1) {
                System.out.println(nums[i]);
            }
        }
    }
}    /*
         //Given an array of integers, write a program that prints the index of an item in the array, where the sum of all items on its left is equal to the sum of the ones on the right.

   For example :
       Given array => [4, 9, 1, 3, 6, 4]
   //Output:
       your program should print as a result => 2
       because the item at index 2 is 1, and 4+9 = 3+6+4
         */


