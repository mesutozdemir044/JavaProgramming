package day24;

import java.util.Scanner;

public class calismaaa { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of array!!!");
    int size = scan.nextInt();
    int[] nums = new int[size];
    int sum1=0;
    int sum=0;
    for(int i=0; i < size; i++) {
        nums[i] = scan.nextInt();//{1,2,3,4,5,6}
    }
    for (int i = 0; i <nums.length ; i++) {

        sum=0;
        sum1=0;

        for (int j = 0; j <i ; j++) {
            sum+=nums[j];
        }
        for (int j = i+1; j <nums.length; j++) {
            sum1+=nums[j];

        }
        if(sum==sum1){
            System.out.println(nums[i]);}
       }
    }



    }
    // printUniqueNumbers(nums);



