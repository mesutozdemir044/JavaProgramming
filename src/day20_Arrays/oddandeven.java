package day20_Arrays;

import java.util.Scanner;

public class oddandeven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[]num=new int[5];
        for (int i = 0; i < 5; i++) {
            num[i]=scan.nextInt();
        }
        for (int each:num) {
            if(each%2==0){
                System.out.println("odd: "+each);
            }else{
                System.out.println("even: "+each);
            }
        }




       /* Write a program that can count the even and odd number from an
        array of integers*/
    }

}
