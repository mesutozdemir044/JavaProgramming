package day20_Arrays;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] number=new int[4];
        for (int i = 0; i < number.length; i++) {
            System.out.println("enter a number");
           number [i]= scanner.nextInt();
        }
        int max=number[0];
        int min=number[0];
        for (int i = 0; i <number.length ; i++) {
            if(number[i]>max)
                 max=number[i];
            if(number[i]<min)
                min=number[i];

        } System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
