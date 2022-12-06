package day20_Arrays;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]numbers=new int[10];
        int max=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("enter num");
            numbers[i]=scanner.nextInt();
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println("-------------");
        int[] numm={1,2,3,4,5,6};
        int sum=0;
        for (int i = 0; i <numm.length ; i++) {
sum+=numm[i];

        }
        System.out.println(sum);


    }
}
