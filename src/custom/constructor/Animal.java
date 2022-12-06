package custom.constructor;

public class Animal {
    public static void main(String[] args) {
        System.out.println("Test Started");

        greeting();
        greeting();
        hellowor();
        evenNumbers();
        oddOrEven(10);
        xAndYnum(5,12);
        initials("ali","kasim");

        System.out.println("Test Completed");


    }

    private static String initials(String first,String last) {

               String res=   first.charAt(0)+""+last.charAt(0);
res=res.toUpperCase();
        System.out.println(res);

        return res;
    }

    private static int xAndYnum(int x,int y) {
   int res=0;
        for (int i = x+1; i <y ; i++) {
            res=i;
            System.out.println(res);
        }
        return res;
    }

    private static int oddOrEven(int num) {
        if(num%2==0){
            System.out.println(num+" is odd");

        } return num;
    }

    private static void evenNumbers() {
        for (int i = 0; i <11 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    private static void hellowor() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello world");
        }
    }

    private static void greeting() {
        System.out.println("Hello Cydeo");
        System.out.println("how are you mesut");

    }


}

