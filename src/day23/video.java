package day23;

public class video {


    public static void main(String[] args) {
       greeting();
       even();
       oddOrEven(90);
       age(1990);
       between(1,11);
    }


    public static void greeting() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello");
        }

        System.out.println("mesut");
    }


    public static void even() {
        for (int i = 0; i <10 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
                System.out.println();}
        }
        }


    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
            if (number % 2 == 1) {
                System.out.println(number + " is odd");
            }
        }

    }

    public static void age(int year) {
        int net = 2022 - year;
        System.out.println(net);
    }

    public static void between(int x,int y) {
        for (int i = x; i <y ; i++) {
            System.out.print(x++ +" ");
        }
    }



}