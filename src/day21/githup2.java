package day21;

import java.util.Scanner;

public class githup2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[]num=new int[scan.nextInt()];
        for (int i = 0; i <num.length ; i++) {
            num[i]= scan.nextInt();
        }
        int count=0;
        int co1=0;
        for (int each : num) {
            if(each%2==0){
                count++;
            }else{
                co1++;
            }
        }
        System.out.println(count);
        System.out.println(co1);


        /*
        2. Write a program that can count the even and odd number from an array of integers
			Note: MUST use for each loop
         */
    }
}
