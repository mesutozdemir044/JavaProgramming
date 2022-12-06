package utulities;

import java.util.Arrays;

public class arrayUtilities {
    public static void intArray(int[] num) {
        for (int each : num) {
            System.out.println(each);
        }
    }

    public static void StringArray(String[] num) {
        for (String each : num) {
            System.out.println(each);
        }
    }

    public static int maxNumberArray(int[] num) {

        Arrays.sort(num);
return num[num.length-1];
}

   public static int[] remove(int []array,int index){
int[]result={};
int j=0;
       for (int i = 0; i <array.length ; i++) {
           if(i== index){
               continue;}result[j++]=array[i];

       }return result;
    }

   }
