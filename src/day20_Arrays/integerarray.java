package day20_Arrays;

public class integerarray {
    public static void main(String[] args) {
       int[]arr1= {1,2,3,4,5};
       int[] arr2= {4,5,6,7,8};

       int frq=0;
        for (int each:arr1 ) {
        for (int each1:arr2) {
            if(each==each1){
                System.out.print(each+" ");
            }

        }
    }}
}
