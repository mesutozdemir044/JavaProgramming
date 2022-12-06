package day25;

import java.util.Arrays;

public class task0AddElement {

    public static void main(String[] args) {
        int[]arr={1,2,3};
        int element=4;
  int[] res= addElementArray(arr,4);
        System.out.println(res);
    }

    public static int [] addElementArray(int[]array,int element){
       int[]res=new int[array.length+1];
       int i=0;
        for (int each : array) {
           res [i++]=each;

            }
        res[i]=element;
        return res ;
        }


    public static double[] addDoubleElementArray(double[]array,double element){
    double[]res=new double[array.length+1];
    int i=0;
    for (double each : array) {
        res [i++]=each;

    }
    res[i]=element;
    return res ;
}

    public static char[] addCharElementArray(char[]array,char element){
        char[]res=new char[array.length+1];
        int i=0;
        for (char each : array) {
            res [i++]=each;

        }
        res[i]=element;
        return res ;
    }

    public static String[] addStringElementArray(String[]array,String element){
        String[]res=new String[array.length+1];
        int i=0;
        for (String each : array) {
            res [i++]=each;

        }
        res[i]=element;
        return res ;
    }
    }






