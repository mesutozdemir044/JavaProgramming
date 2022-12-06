package day25;

import java.util.Arrays;
import java.util.Scanner;

public class repl {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner input = new Scanner(System.in);
        double[] score = new double[7];
        for (int i = 0,j=1; i < score.length; i++,j++) {
            System.out.println("Enter score for judge "+(j)+":");
            score[i]+=input.nextDouble();
        }
        int n=1;
        double max=score[0];
        double min=score[0];
        double sum=0;
        double sum1=0;
        double res =0;
        double difficult=0;



        for (double each : score) {
            sum+=each;
        }
        for(double each:score){
            if(each>max){
                max=each;

            }
        }
        for(double each:score){

            if(each<min){
              min=each;

            }}

        if(sum1==38){
            difficult= score.length*0.3;
        }else{
            difficult= 3.6;
        }
         sum1=sum-(max+min);
       sum1= sum1*(score.length*0.3);



        res=0.6*sum1;

        System.out.println("Enter the difficulty rating:"+difficult);
        System.out.println("Final Score: "+res);










        //WRITE YOUR CODE HERE


    }
}

//WRITE YOUR CODE HERE




