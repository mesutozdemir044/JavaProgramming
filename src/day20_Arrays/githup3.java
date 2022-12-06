package day20_Arrays;

public class githup3 {
    public static void main(String[] args) {

        int[] arr1= {1,2,3,4,5};
        int []arr2= {4,5,6,7,8};
        for (int i : arr1) {
            for (int i1 : arr2) {
                if(i1==i)
                    System.out.print(i1+" ");

            }
        }

        /*
        7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
         */
    }
}
