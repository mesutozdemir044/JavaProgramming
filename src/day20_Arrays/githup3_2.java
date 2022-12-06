package day20_Arrays;

public class githup3_2 {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int []arr2= {4,5,6,7,8};
        int a=0;
        int b=0;
        for (int i = 0; i <arr1.length ; i++) {
           a= arr1[i];

        for (int j = 0; j <arr2.length ; j++) {
            b= arr2[j];
            if(a==b) {System.out.print(a+" ");}
        }

    }
    }
}
