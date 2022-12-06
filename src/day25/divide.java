package day25;

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] score = new double[8];
        int n=1;
       double max=score[0];
       double min=score[0];
        int sum=0;
        double res =0;


        for (int i = 0; i <7 ; i++) {

        } {
            System.out.println("Enter score for judge "+(n)+":");
            score[n]=input.nextDouble();

        }


        for(double each:score){
            if(each>max){
              each=max;}
            }
        for(double each:score){

            if(each<min){
              each=min;
            }}
        for (double each : score) {

            if(!(each==max||each==min)){
                sum+=each;
            }
        }

            res=0.6*sum;


        System.out.println("Enter the difficulty rating:");
        System.out.println("Final Score:"+res);










        //WRITE YOUR CODE HERE


    }
}
