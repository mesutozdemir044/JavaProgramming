package day25;

public class sumOfNumbers {
    public static void main(String[] args) {
       int n= sumOfTreeNumbers(1,2,3);
        System.out.println(n);
    }
    public static int sumOfNumbers(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int sumOfTreeNumbers(int a,int b,int c){
       return a+b+c;
    }

}

